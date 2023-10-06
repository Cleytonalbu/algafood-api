package com.cleyton.algafoodapi.notificacao;

import com.cleyton.algafoodapi.models.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
