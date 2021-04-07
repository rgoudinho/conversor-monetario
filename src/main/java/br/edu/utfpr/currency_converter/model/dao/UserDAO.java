package br.edu.utfpr.currency_converter.model.dao;



import br.edu.utfpr.currency_converter.model.domain.Currency;
import br.edu.utfpr.currency_converter.model.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserDAO extends AbstractDAO{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("currency-converter-pu");
    EntityManager entityManager = emf.createEntityManager();
    User entity = new User();

    public User getById(Long id){
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.id = :id");
        query.setParameter("id", id);
        List<User> queryResult = query.getResultList();
        if (!queryResult.isEmpty()){
            entity = queryResult.get(0);
        }
        return entity;
    }

    public boolean exists(String email, String password){
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.password = :password");
        query.setParameter("email", email);
        query.setParameter("password", password);
        List<User> queryResult = query.getResultList();
        if (!queryResult.isEmpty()) {
            return true;
        }
        return false;
    }
}
