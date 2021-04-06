package br.edu.utfpr.currency_converter.model.mapper;

import br.edu.utfpr.currency_converter.model.domain.Conversion;
import br.edu.utfpr.currency_converter.model.domain.User;
import br.edu.utfpr.currency_converter.model.dto.ConversionDTO;
import br.edu.utfpr.currency_converter.model.dto.UserDTO;

public class ConversionMapper {
    public ConversionMapper getInstance() { return new ConversionMapper(); }

    public static Conversion toEntity(ConversionDTO dto){
        User user = UserMapper.toEntity(dto.getUser());
        Conversion entity = new Conversion(dto.getValue(), dto.getStartingCurrency(), dto.getConvertedCurrency(), user);
        return entity;
    }

    public static ConversionDTO toDTO(Conversion entity){
        UserDTO userDTO = UserMapper.toDTO(entity.getUser());
        ConversionDTO dto = new ConversionDTO(entity.getValue(), entity.getStartingCurrency(), entity.getConvertedCurrency(), userDTO);
        return dto;
    }
}
