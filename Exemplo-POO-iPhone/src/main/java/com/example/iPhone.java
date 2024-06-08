package com.example;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public interface iPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id = 0L;
    public String modelo = "";


    private void tocar(){

    }

    private void pausar() {

    }

    default void selecionarMusica(String musica){

    }
}
