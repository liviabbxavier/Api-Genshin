package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosJogo (@JsonAlias("Characters") String Personagens,
                         @JsonAlias("Elements") String Elementos,
                         @JsonAlias("Nations") String Nacoes,
                         @JsonAlias("Enemies") String Inimigos){}