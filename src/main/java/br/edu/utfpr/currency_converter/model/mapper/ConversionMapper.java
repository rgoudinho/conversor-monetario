package br.edu.utfpr.currency_converter.model.mapper;

import br.edu.utfpr.currency_converter.model.domain.Conversion;
import br.edu.utfpr.currency_converter.model.domain.Currency;
import br.edu.utfpr.currency_converter.model.domain.User;
import br.edu.utfpr.currency_converter.model.dto.ConversionDTO;
import br.edu.utfpr.currency_converter.model.dto.CurrencyDTO;
import br.edu.utfpr.currency_converter.model.dto.UserDTO;

public class ConversionMapper {
    public ConversionMapper getInstance() { return new ConversionMapper(); }

    public static Conversion toEntity(ConversionDTO dto){
        User user = UserMapper.toEntity(dto.getUser());
        Currency startingCurrency = CurrencyMapper.toEntity(dto.getStartingCurrency());
        Currency convertedCurrency = CurrencyMapper.toEntity(dto.getConvertedCurrency());
        Conversion entity = new Conversion(dto.getValue(), startingCurrency, convertedCurrency, user);
        return entity;
    }

    public static ConversionDTO toDTO(Conversion entity){
        UserDTO userDTO = UserMapper.toDTO(entity.getUser());
        CurrencyDTO startingCurrencyDTO = CurrencyMapper.toDTO(entity.getStartingCurrency());
        CurrencyDTO convertedCurrencyDTO = CurrencyMapper.toDTO(entity.getConvertedCurrency());
        ConversionDTO dto = new ConversionDTO(entity.getValue(), startingCurrencyDTO, convertedCurrencyDTO, userDTO);
        return dto;
    }
}
