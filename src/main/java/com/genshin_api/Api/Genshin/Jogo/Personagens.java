package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Personagens(String characters) {
    @Override
    public String toString() {
        return "\nPersonagens: " + "\n" +
                "Nome: " + characters + "\n";
    }
    public static List<Personagens> listaDePersonagens;
}
