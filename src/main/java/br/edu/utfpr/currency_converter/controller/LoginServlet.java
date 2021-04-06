package br.edu.utfpr.currency_converter.controller;

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
        request.getRequestDispatcher("/WEB-INF/view/log-in.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email == "" || password == ""){
            request.getRequestDispatcher("/WEB-INF/view/log-in.jsp");
        } else {
            if (isValid(email, password)) {
                request.getRequestDispatcher("/WEB-INF/view/converter.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/WEB-INF/view/log-in.jsp").forward(request, response);
            }
        }
    }

    private boolean isValid(String email, String password) {
        List<User> users = userService.findAll();
        boolean result = false;
        for (User user : users)
            if (user.getEmail() == email & user.getPassword() == password)
                result = true;
        return result;
    }

    public void destroy() {

    }
}