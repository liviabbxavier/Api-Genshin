package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosInimigos(@JsonAlias("name") String nome,
                            @JsonAlias("type") String tipo,
                            @JsonAlias("elements") String elemento)
{
    @Override
    public String toString() {
        return
                "\nNome: " + nome +
                "\nTipo: " + tipo +
                "\nElemento: " + elemento;
    }
}
