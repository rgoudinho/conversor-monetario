package br.edu.utfpr.currency_converter.service;

import br.edu.utfpr.currency_converter.model.dao.ConversionDAO;
import br.edu.utfpr.currency_converter.model.domain.Conversion;
import br.edu.utfpr.currency_converter.model.domain.User;

import java.util.List;

public class ConversionService extends AbstractService<Long, Conversion>{
    ConversionDAO conversionDAO = new ConversionDAO();
    public ConversionService() { dao = new ConversionDAO(); }

    public List<Conversion> findByUser(User user) {
        return conversionDAO.findByUser(user);
    }
}
