package com.admin.ediaristas.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.ediaristas.core.exceptions.ServicoNaoEncontradoException;
import com.admin.ediaristas.core.models.Servico;
import com.admin.ediaristas.core.repositories.ServicoRepository;
import com.admin.ediaristas.web.dtos.ServicoForm;
import com.admin.ediaristas.web.mappers.WebServicoMapper;

@Service
public class WebServicoService {

    @Autowired
    private ServicoRepository repository;

    @Autowired
    private WebServicoMapper mapper;

    public List<Servico> buscarTodos() {
        return repository.findAll();
    }

    public Servico cadastrar(ServicoForm form) {
        var model = mapper.toModel(form);

        return repository.save(model);
    }

    public Servico buscarPorId(Long id) {
        var servicoEncotrado = repository.findById(id);

        if (servicoEncotrado.isPresent()) {
            return servicoEncotrado.get();
        }

        var mensagem = String.format("Serviço com ID %d não encontrado", id);
        throw new ServicoNaoEncontradoException(mensagem);
    }

    public Servico editar(ServicoForm form, Long id) {
        var servicoEncotrado = buscarPorId(id);

        var model = mapper.toModel(form);
        model.setId(servicoEncotrado.getId());

        return repository.save(model);
    }

    public void excluirPorId(Long id) {
        var servicoEncotrado = buscarPorId(id);

        repository.delete(servicoEncotrado);
    }

}
