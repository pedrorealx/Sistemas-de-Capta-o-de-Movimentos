package com.seuprojeto.facial.service;

import com.seuprojeto.facial.model.pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class pessoaService {

    private final List<pessoa> pessoas = new ArrayList<>();
    private Long contadorId = 1L;

    public pessoa salvar(pessoa pessoa) {
        pessoa.setId(contadorId++);
        pessoas.add(pessoa);
        return pessoa;
    }

    public List<pessoa> listar() {
        return pessoas;
    }

    public pessoa atualizar(Long id, pessoa novaPessoa) {

        for (pessoa pessoa : pessoas) {
           if (pessoa.getId() != null && pessoa.getId().equals(id)) {
                pessoa.setNome(novaPessoa.getNome());
                pessoa.setIdade(novaPessoa.getIdade());
                return pessoa;
            }
        }

        throw new RuntimeException("Pessoa não encontrada");
    }
}
