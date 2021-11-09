package com.example.springintro.notificacao;

import com.example.springintro.model.Cliente;

public interface Notificador {
  void notificar(Cliente cliente, String mensagem);
}
