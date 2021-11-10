package com.example.springintro.service;

import com.example.springintro.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

  //  @TipoNotificador(NivelUrgencia.URGENTE)
  //  @Autowired
  //  private Notificador notificador;

  @Autowired private ApplicationEventPublisher eventPublisher;

  public void ativar(Cliente cliente) {
    cliente.ativar();

    eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    //    notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
  }
}
