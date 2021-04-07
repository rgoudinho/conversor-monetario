package br.edu.utfpr.currency_converter.service;

import br.edu.utfpr.currency_converter.model.dao.UserDAO;
import br.edu.utfpr.currency_converter.model.domain.User;

public class UserService extends AbstractService<Long, User>{
    UserDAO userDAO;
    public UserService() {
        dao = new UserDAO();
        userDAO = new UserDAO();
    }

    public User getById(Long id){
        return userDAO.getById(id);
    }
    public boolean exists(String email, String password) {
        return userDAO.exists(email, password);
    }
}
