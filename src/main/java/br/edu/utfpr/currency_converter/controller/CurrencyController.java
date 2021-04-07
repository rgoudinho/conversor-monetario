package br.edu.utfpr.currency_converter.controller;

import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CurrencyController", value = "/currency")
public class CurrencyController extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> currency = new ArrayList<>();
        currency.add("Brasil, Real(BRL)");
        currency.add("EUA, Dolar(USD)");
        currency.add("Japão, Iene(JPY)");
        String json = new Gson().toJson(currency);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }
}
