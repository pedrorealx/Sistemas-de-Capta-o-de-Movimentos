package com.seuprojeto.facial.service;

import com.seuprojeto.facial.model.pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class pessoaService {

    private List<pessoa> pessoas = new ArrayList<>();

    public pessoa salvar(pessoa pessoa) {
        pessoas.add(pessoa);
        return pessoa;
    }

    public List<pessoa> listar() {
        return pessoas;
    }
}
