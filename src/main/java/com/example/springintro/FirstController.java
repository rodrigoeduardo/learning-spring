package com.example.springintro;

import com.example.springintro.model.Cliente;
import com.example.springintro.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

  private final AtivacaoClienteService ativacaoClienteService;

  public FirstController(AtivacaoClienteService ativacaoClienteService) {
    this.ativacaoClienteService = ativacaoClienteService;
  }

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    Cliente rodrigo = new Cliente("Rodrigo", "rodrigo@blobteam.tech", "84987674200");

    ativacaoClienteService.ativar(rodrigo);

    return "Hello";
  }
}
