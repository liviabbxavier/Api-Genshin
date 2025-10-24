package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosElementos(@JsonAlias("name") String nome,
                             @JsonAlias("reactions") String reacoes)
{
    @Override
    public String toString() {
        return
                "\nNome: " + nome +
                "\nReacoes: " + reacoes;
    }
}