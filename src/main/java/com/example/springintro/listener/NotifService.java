package com.example.springintro.listener;

import com.example.springintro.notificacao.NivelUrgencia;
import com.example.springintro.notificacao.Notificador;
import com.example.springintro.notificacao.TipoNotificador;
import com.example.springintro.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotifService {
  @TipoNotificador(NivelUrgencia.URGENTE)
  @Autowired
  private Notificador notificador;

  @EventListener
  public void clienteAtivadoListener(ClienteAtivadoEvent event) {
    notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
  }
}
