package br.edu.utfpr.currency_converter.model.dao;

import br.edu.utfpr.currency_converter.model.domain.Currency;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CurrencyDAO extends AbstractDAO{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("currency-converter-pu");
    EntityManager entityManager = emf.createEntityManager();

    public Currency getById(Long id){
        Currency entity = new Currency();
        Query query = entityManager.createQuery("SELECT c FROM Currency c WHERE c.id = :param");
        query.setParameter("param", id);
        List<Currency> queryResult = query.getResultList();
        if (!queryResult.isEmpty()){
            entity = queryResult.get(0);
        }
        return entity;
    }
}
