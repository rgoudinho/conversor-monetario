package br.edu.utfpr.currency_converter.controller;

import br.edu.utfpr.currency_converter.model.dao.ConversionDAO;
import br.edu.utfpr.currency_converter.model.dao.UserDAO;
import br.edu.utfpr.currency_converter.model.domain.Conversion;
import br.edu.utfpr.currency_converter.model.domain.User;
import br.edu.utfpr.currency_converter.service.ConversionService;
import br.edu.utfpr.currency_converter.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "historyServlet", value = "/historico")
public class HistoryServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ConversionService conversionService = new ConversionService();
        User user = new User();
        UserService userService = new UserService();
        String idString = request.getParameter("id-user");
        Long idLong = Long.parseLong(idString);
        user = userService.getById(idLong);
        List<Conversion> conversions = conversionService.findByUser(user);
        request.setAttribute("conversions", conversions);
        request.getRequestDispatcher("/WEB-INF/view/history.jsp").forward(request, response);
    }
}