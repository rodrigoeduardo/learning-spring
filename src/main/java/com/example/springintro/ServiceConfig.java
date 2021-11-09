package com.example.springintro;

import com.example.springintro.notificacao.Notificador;
import com.example.springintro.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
  @Bean
  public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
    return new AtivacaoClienteService(notificador);
  }
}
