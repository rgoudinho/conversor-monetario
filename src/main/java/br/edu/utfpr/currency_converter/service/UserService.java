package br.edu.utfpr.currency_converter.service;

import br.edu.utfpr.currency_converter.model.dao.UserDAO;
import br.edu.utfpr.currency_converter.model.domain.User;

public class UserService extends AbstractService<Long, User>{
    public UserService() { dao = new UserDAO(); }
}
