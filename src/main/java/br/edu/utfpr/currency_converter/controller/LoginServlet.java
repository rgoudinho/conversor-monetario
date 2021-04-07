package br.edu.utfpr.currency_converter.controller;

import br.edu.utfpr.currency_converter.model.dao.UserDAO;
import br.edu.utfpr.currency_converter.model.domain.User;
import br.edu.utfpr.currency_converter.service.UserService;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/log-in")
public class LoginServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User();

        if (email == "" || password == ""){
            request.getRequestDispatcher("/WEB-INF/view/log-in.jsp");
        } else {
            if (userService.exists(email, password)) {
                request.setAttribute("username", user);
                request.getRequestDispatcher("/WEB-INF/view/converter.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            }
        }
    }

    public void destroy() {

    }
}