package com.algaworks.controller;

import com.algaworks.model.StatusTitulo;
import com.algaworks.repository.Titulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.model.Titulo;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/titulos") 
public class TitulosController {


    @Autowired
    private Titulos titulos;


    @RequestMapping(value = "/novo", method = RequestMethod.GET)
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("CadastroTitulo");
    	System.out.println("teste");
        return mv;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView salvar(Titulo titulo) {
        titulos.save(titulo);

        ModelAndView mv = new ModelAndView("CadastroTitulo");
        mv.addObject("mensagem", "Título cadastrado com sucesso!!");
        return mv;
    }

    @RequestMapping
    public  String pesquisar() {
        return "PesquisaTitulos";
    }

    @ModelAttribute
    public List<StatusTitulo> todosStatusTitulo() {
        return Arrays.asList(StatusTitulo.values());
    }

  }
