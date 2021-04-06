package br.edu.utfpr.currency_converter.controller;

import br.edu.utfpr.currency_converter.model.domain.User;
import br.edu.utfpr.currency_converter.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "registerServlet", value = "/cadastrar")
public class RegisterServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (email == "" || username == "" || password == "") {
            request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
        } else {
            User user = new User(email, username, password);
            userService.save(user);
            request.setAttribute("email", email);
            request.getRequestDispatcher("/WEB-INF/view/log-in.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
}