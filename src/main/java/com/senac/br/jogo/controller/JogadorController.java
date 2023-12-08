package com.senac.br.jogo.controller;

import com.senac.br.jogo.dao.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorController {


    @Autowired
    CadastroRepository cr;

    @GetMapping



}
