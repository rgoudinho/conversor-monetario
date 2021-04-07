package br.edu.utfpr.currency_converter.controller;

import br.edu.utfpr.currency_converter.model.dao.CurrencyDAO;
import br.edu.utfpr.currency_converter.model.dao.UserDAO;
import br.edu.utfpr.currency_converter.model.domain.Conversion;
import br.edu.utfpr.currency_converter.model.domain.Currency;
import br.edu.utfpr.currency_converter.model.domain.User;
import br.edu.utfpr.currency_converter.service.ConversionService;
import br.edu.utfpr.currency_converter.service.CurrencyService;
import br.edu.utfpr.currency_converter.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "converterServlet", value = "/conversor")
public class ConverterServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();
    ConversionService conversionService = new ConversionService();
    CurrencyDAO currencyDAO = new CurrencyDAO();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/view/converter.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valueString = request.getParameter("value");
        String startingCurrencyString = request.getParameter("selected-starting-currency");
        String convertedCurrencyString = request.getParameter("selected-converted-currency");
        String idUserString = request.getParameter("id-user");

        Float value = Float.parseFloat(valueString);
        Long startingCurrencyLong = Long.parseLong(startingCurrencyString) + 1;
        Currency startingCurrency = currencyDAO.getById(startingCurrencyLong);
        Long convertedCurrencyLong = Long.parseLong(convertedCurrencyString) + 1;
        Currency convertedCurrency = currencyDAO.getById(convertedCurrencyLong);
        Long idUserLong = Long.parseLong(idUserString);
        User user = userDAO.getById(idUserLong);

        if (valueString == "" || startingCurrencyString == convertedCurrencyString){
            request.getRequestDispatcher("/WEB-INF/view/converter.jsp").forward(request, response);
        } else {
            Conversion conversion = new Conversion(value, startingCurrency, convertedCurrency, user);
            conversionService.save(conversion);
            float convertedValue = convertCurrency(value, startingCurrency, convertedCurrency);
            request.setAttribute("converted_value", convertedValue);
            request.setAttribute("original_value", value);
            request.getRequestDispatcher("/WEB-INF/view/converter.jsp").forward(request, response);
        }
    }

    public float convertCurrency(float valueV, Currency startingCurrencyV, Currency convertedCurrencyV){
        float result = 0;
        if (startingCurrencyV.getId() == 1)
            result = valueV * convertedCurrencyV.getValueRelativeReal();
        else if(startingCurrencyV.getId() == 2)
            if (convertedCurrencyV.getId() == 1)
                result = valueV * (float) 5.60;
            else
                result = valueV * (float) 112.00;
        else if (startingCurrencyV.getId() == 3)
            if (convertedCurrencyV.getId() == 1)
                result = valueV * (float) 0.05;
            else
                result = valueV * (float) 0.01;

        return result;
    }
}