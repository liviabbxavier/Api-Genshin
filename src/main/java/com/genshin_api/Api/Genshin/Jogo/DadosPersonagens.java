package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosPersonagens(@JsonAlias("name") String nome,
                               @JsonAlias("title") String titulo,
                               @JsonAlias("vision") String visao,
                               @JsonAlias("weapon") String arma,
                               @JsonAlias("gender") String genero,
                               @JsonAlias("nation") String nacao,
                               @JsonAlias("affiliation") String afiliacao,
                               @JsonAlias("rarity") String raridade,
                               @JsonAlias("constellation") String constelacao)
{
    @Override
    public String toString() {
        return
                "\nNome: " + nome +
                "\nTitulo: " + titulo +
                "\nVisao: " + visao +
                "\nArma: " + arma +
                "\nGenero: " + genero +
                "\nNacao: " + nacao +
                "\nAfiliacao: " + afiliacao +
                "\nRaridade: " + raridade +
                "\nConstelaco: " + constelacao;
    }
}
