package com.example.lab.db.api.mapper;

import com.example.lab.db.api.dto.CreateUserRequest;
import com.example.lab.db.api.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mappings({
            @Mapping(source = "login", target = "login"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "phone", target = "phone"),
            @Mapping(source = "email", target = "email"),
            @Mapping(target = "id", ignore = true)
    })
    User toEntity(CreateUserRequest request);

}
