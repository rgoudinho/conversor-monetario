package br.edu.utfpr.currency_converter.model.dao;

import br.edu.utfpr.currency_converter.model.domain.Conversion;
import br.edu.utfpr.currency_converter.model.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ConversionDAO extends AbstractDAO{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("currency-converter-pu");
    EntityManager entityManager = emf.createEntityManager();
    Conversion entity = new Conversion();

    public List<Conversion> findByUser(User user) {
        Query query = entityManager.createQuery("SELECT c FROM Conversion c WHERE c.user = :user");
        query.setParameter("user", user);
        List<Conversion> queryResult = query.getResultList();
        return queryResult;
    }
}
