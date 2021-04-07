package br.edu.utfpr.currency_converter.model.mapper;

import br.edu.utfpr.currency_converter.model.domain.Currency;
import br.edu.utfpr.currency_converter.model.dto.CurrencyDTO;

public class CurrencyMapper {
    public CurrencyMapper getInstance() { return new CurrencyMapper(); }

    public static Currency toEntity(CurrencyDTO dto){
        Currency entity = new Currency(dto.getCurrencyName(), dto.getValueRelativeReal());
        return  entity;
    }

    public static CurrencyDTO toDTO(Currency entity){
        CurrencyDTO dto = new CurrencyDTO(entity.getCurrencyName(), entity.getValueRelativeReal());
        return dto;
    }
}
