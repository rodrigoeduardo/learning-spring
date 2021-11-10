package com.example.springintro.notificacao;

import com.example.springintro.model.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailSimu implements Notificador {

  @Override
  public void notificar(Cliente cliente, String mensagem) {

    System.out.printf(
        "SIMULAÇÃO: Notificando %s através do email %s: %s\n",
        cliente.getNome(), cliente.getEmail(), mensagem);
  }
}
