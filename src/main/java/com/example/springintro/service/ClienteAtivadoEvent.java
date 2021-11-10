package com.example.springintro.service;

import com.example.springintro.model.Cliente;

public class ClienteAtivadoEvent {
  private Cliente cliente;

  public ClienteAtivadoEvent(Cliente cliente) {
    this.cliente = cliente;
  }

  public Cliente getCliente() {
    return cliente;
  }
}
