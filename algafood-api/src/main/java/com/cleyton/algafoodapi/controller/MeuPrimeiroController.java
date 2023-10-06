package com.cleyton.algafoodapi.controller;

import com.cleyton.algafoodapi.models.Cliente;
import com.cleyton.algafoodapi.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;
    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService){
        this.ativacaoClienteService = ativacaoClienteService;
    }
   @GetMapping("/hello")
   @ResponseBody
    public String hello(){
        Cliente joao = new Cliente("joao", "joao@gmail.com", "9955-8422");
        ativacaoClienteService.ativar(joao);
        return "hello";
    }
}
