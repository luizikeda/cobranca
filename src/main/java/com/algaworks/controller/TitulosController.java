package com.algaworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.model.Titulo;

@Controller
@RequestMapping(value = "/titulos") 
public class TitulosController {
	
    @RequestMapping(value = "/novo", method = RequestMethod.GET)
    public String novo() {
    	System.out.println("teste");
        return "CadastroTitulo";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Titulo titulo) {
    	//TODO: Salvar no banco de dados
    	System.out.println(">>> " + titulo.getDescricao());
    	
    	return "CadastroTitulo";
    }
    
  }
