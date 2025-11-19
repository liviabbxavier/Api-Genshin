package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties

public record Reacoes(@JsonAlias("name") String nome,
                      //@JsonAlias("elements") String elementos,
                      @JsonAlias("description") String descricao) {
}
