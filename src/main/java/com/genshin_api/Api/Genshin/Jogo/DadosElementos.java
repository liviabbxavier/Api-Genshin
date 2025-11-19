package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosElementos(@JsonAlias("name") String nome,
                             @JsonAlias("reactions") List<Reacoes> reacoes,
                             @JsonAlias("description") String descricao)
{
    @Override
    public String toString() {
        return
                "\nNome: " + nome + "\n" +
                "Reacoes: " + reacoes + "\n" +
                "Descricao: " + descricao;
    }
}