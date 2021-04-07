package br.edu.utfpr.currency_converter.service;

import br.edu.utfpr.currency_converter.model.dao.CurrencyDAO;
import br.edu.utfpr.currency_converter.model.domain.Currency;

public class CurrencyService extends AbstractService<Long, Currency> {
    public CurrencyService() { dao = new CurrencyDAO(); }
}
