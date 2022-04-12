package br.com.tcs.despesasapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcs.despesasapi.models.HistoricoModel;
import br.com.tcs.despesasapi.services.HistoricoService;

@RestController
public class HistoricoController {

    @Autowired
    private HistoricoService service;
    
    @GetMapping("/")
    public String sayHello() throws Exception{
        return "Hello world!";
    }
    @GetMapping("/historico")
    public List<HistoricoModel> list() throws Exception{
        return service.findAll();
    }
}
