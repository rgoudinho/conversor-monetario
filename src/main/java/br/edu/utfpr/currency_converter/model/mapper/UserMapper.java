package br.edu.utfpr.currency_converter.model.mapper;

import br.edu.utfpr.currency_converter.model.domain.User;
import br.edu.utfpr.currency_converter.model.dto.UserDTO;

public class UserMapper {
    public UserMapper getInstance() { return new UserMapper(); }

    public static User toEntity(UserDTO dto){
        User entity = new User(dto.getUsername(), dto.getEmail(), dto.getPassword());
        return entity;
    }

    public static UserDTO toDTO(User entity){
        UserDTO dto = new UserDTO(entity.getUsername(), entity.getEmail(), entity.getPassword());
        return dto;
    }
}
