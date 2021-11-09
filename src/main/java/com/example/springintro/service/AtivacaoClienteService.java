package com.example.springintro.service;

import com.example.springintro.model.Cliente;
import com.example.springintro.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;

public class AtivacaoClienteService {
  private Notificador notificador;

  @Autowired(required = false)
  public AtivacaoClienteService(Notificador notificador) {
    this.notificador = notificador;
  }

  public void ativar(Cliente cliente) {
    cliente.ativar();

    notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
  }
}
