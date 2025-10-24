package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Personagens(String characters) {
    @Override
    public String toString() {
        return "\nPersonagens: " +
                "\nNome: " + characters;
    }
}
