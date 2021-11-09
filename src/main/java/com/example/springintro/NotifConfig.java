package com.example.springintro;

import com.example.springintro.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotifConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.blobteam.tech");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
