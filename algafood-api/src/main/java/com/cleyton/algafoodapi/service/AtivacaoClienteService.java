package com.cleyton.algafoodapi.service;

import com.cleyton.algafoodapi.models.Cliente;
import com.cleyton.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtivacaoClienteService {
    @Autowired
    private List<Notificador> notificadores;
    public void ativar(Cliente cliente){
        cliente.ativar();

        for (Notificador notificador: notificadores){
            notificador.notificar(cliente, " Seu cadastro no sistema está ativo!");
        }

    }
}
