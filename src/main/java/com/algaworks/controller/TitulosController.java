package com.algaworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/titulos")
public class TitulosController {
    @RequestMapping(value = "/novo", method = RequestMethod.GET)
    public String AA() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        return "CadastroTitulo";
    }
}
