package com.example.lab.db.api.mapper;

import com.example.lab.db.api.dto.RegistrationRequest;
import com.example.lab.db.api.dto.UserDTO;
import com.example.lab.db.api.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(source = "login", target = "login")
    @Mapping(target = "password", ignore = true)
    @Mapping(source = "phone", target = "phone")
    @Mapping(source = "email", target = "email")
    @Mapping(target = "id", ignore = true)
    User toEntity(RegistrationRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    UserDTO toDTO(User user);
}
