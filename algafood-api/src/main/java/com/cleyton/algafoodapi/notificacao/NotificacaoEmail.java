package com.cleyton.algafoodapi.notificacao;

import com.cleyton.algafoodapi.models.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoEmail implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.print("Notificando " + cliente.getNome() + " atraves do email: " + cliente.getEmail() + mensagem);
    }
}
