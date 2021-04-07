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
    UserDAO userDAO = new UserDAO();
    User user = new User();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/view/log-in.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email == "" || password == ""){
            System.out.println(">>>>>> ta vazio trouxa");
            request.getRequestDispatcher("/WEB-INF/view/log-in.jsp");
        } else {
            if (userDAO.exists(email, password)) {
                System.out.println(">>>>>> FUNCIONOUUUU CARALHOOOO");
                request.setAttribute("username", user);
                request.getRequestDispatcher("/WEB-INF/view/converter.jsp").forward(request, response);
            } else {
                System.out.println(">>>>>> algo muito errado aconteceu");
                request.getRequestDispatcher("/WEB-INF/view/log-in.jsp").forward(request, response);
            }
        }
    }

    public void destroy() {

    }
}