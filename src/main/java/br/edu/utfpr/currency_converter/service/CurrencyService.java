package br.edu.utfpr.currency_converter.service;

import br.edu.utfpr.currency_converter.model.dao.CurrencyDAO;
import br.edu.utfpr.currency_converter.model.domain.Currency;

public class CurrencyService extends AbstractService<Long, Currency> {
    CurrencyDAO currencyDAO;
    public CurrencyService() {
        dao = new CurrencyDAO();
        currencyDAO = new CurrencyDAO();
    }

    public Currency getById(Long id){
        return currencyDAO.getById(id);
    }
}