package com.senac.br.jogo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    private String jogoFavorito;

    private int ponto;

    private String nick;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogoFavorito() {
        return jogoFavorito;
    }

    public void setJogoFavorito(String jogoFavorito) {
        this.jogoFavorito = jogoFavorito;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
