package com.seuprojeto.facial.controller;

import com.seuprojeto.facial.model.pessoa;
import com.seuprojeto.facial.service.pessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class pessoaController {

    @Autowired
    private pessoaService service;

    @PostMapping
    public pessoa salvar(@RequestBody pessoa pessoa) {
        return service.salvar(pessoa);
    }

    @GetMapping
    public List<pessoa> listar() {
        return service.listar();
    }
}
