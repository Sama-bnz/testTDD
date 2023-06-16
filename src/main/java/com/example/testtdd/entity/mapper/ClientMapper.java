package com.example.testtdd.entity.mapper;

import com.example.testtdd.entity.Client;
import com.example.testtdd.entity.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ClientMapper {
    Client toClient(ClientDto clientDto);

    ClientDto toClientDto(Client client);
}
