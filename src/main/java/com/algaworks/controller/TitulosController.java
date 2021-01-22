package com.algaworks.controller;

import com.algaworks.repository.Titulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.model.Titulo;

@Controller
@RequestMapping(value = "/titulos") 
public class TitulosController {


    @Autowired
    private Titulos titulos;


    @RequestMapping(value = "/novo", method = RequestMethod.GET)
    public String novo() {
    	System.out.println("teste");
        return "CadastroTitulo";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Titulo titulo) {

        titulos.save(titulo);
    	
    	return "CadastroTitulo";
    }
    
  }
