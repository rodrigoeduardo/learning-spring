package com.example.springintro.notificacao;

import com.example.springintro.model.Cliente;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorSMS implements Notificador {

  @Override
  public void notificar(Cliente cliente, String mensagem) {

    System.out.printf(
        "Notificando %s através do telefone %s: %s\n",
        cliente.getNome(), cliente.getTelefone(), mensagem);
  }
}
