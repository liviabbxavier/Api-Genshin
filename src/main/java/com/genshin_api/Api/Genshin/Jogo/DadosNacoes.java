package com.genshin_api.Api.Genshin.Jogo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosNacoes(@JsonAlias("name") String nome,
                          @JsonAlias("element") String elemento,
                          @JsonAlias("archon") String arconte) {
}
