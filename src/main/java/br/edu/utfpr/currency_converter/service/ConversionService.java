package br.edu.utfpr.currency_converter.service;

import br.edu.utfpr.currency_converter.model.dao.ConversionDAO;
import br.edu.utfpr.currency_converter.model.domain.Conversion;

public class ConversionService extends AbstractService<Long, Conversion>{
    public ConversionService() { dao = new ConversionDAO(); }
}
