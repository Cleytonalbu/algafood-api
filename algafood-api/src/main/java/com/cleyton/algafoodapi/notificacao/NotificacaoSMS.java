package com.cleyton.algafoodapi.notificacao;

import com.cleyton.algafoodapi.models.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoSMS implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + " por SMS atraves do telefone " + cliente.getTelefone() + mensagem);

    }
}
