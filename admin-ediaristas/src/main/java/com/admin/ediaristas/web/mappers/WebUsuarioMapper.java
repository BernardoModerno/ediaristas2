package com.admin.ediaristas.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.admin.ediaristas.core.models.Usuario;
import com.admin.ediaristas.web.dtos.UsuarioCadastroForm;

@Mapper(componentModel = "spring")
public interface WebUsuarioMapper {

    WebUsuarioMapper INSTANCE = Mappers.getMapper(WebUsuarioMapper.class);

    Usuario toModel(UsuarioCadastroForm form);

}
