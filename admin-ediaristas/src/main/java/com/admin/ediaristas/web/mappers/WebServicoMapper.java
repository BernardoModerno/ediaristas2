package com.admin.ediaristas.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.admin.ediaristas.core.models.Servico;
import com.admin.ediaristas.web.dtos.ServicoForm;

@Mapper(componentModel = "spring")
public interface WebServicoMapper {

    WebServicoMapper INSTANCE = Mappers.getMapper(WebServicoMapper.class);

    Servico toModel(ServicoForm form);

    ServicoForm toForm(Servico model);

}
