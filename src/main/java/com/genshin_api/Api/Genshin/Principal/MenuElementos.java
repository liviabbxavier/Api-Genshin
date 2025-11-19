package com.genshin_api.Api.Genshin.Principal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.genshin_api.Api.Genshin.Jogo.DadosElementos;
import com.genshin_api.Api.Genshin.service.ConsumoApi;
import com.genshin_api.Api.Genshin.service.ConverteDados;

import java.util.Scanner;

public class MenuElementos {
    private String escolha;
    private Scanner buscaElemento = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private ObjectMapper mapper = new ObjectMapper();
    private final String ENDERECO = "https://genshin.jmp.blue/";

    public void EscolhaElementos() {
        System.out.println("Qual elemento voce deseja ver?");
        escolha = buscaElemento.nextLine();
        var json = consumo.obtemDados(ENDERECO + "elements/" + escolha.replace(" ", "+"));
        DadosElementos[] seuElemento = conversor.obtemDados(json, DadosElementos[].class);
        System.out.println(seuElemento);

        /*switch (escolha) {
            case "anemo":
                json = consumo.obtemDados(ENDERECO + "elements/anemo" );
                break;
            case "cryo":
                json = consumo.obtemDados(ENDERECO + "elements/cryo");
                break;
            case "dendro":
                json = consumo.obtemDados(ENDERECO + "elements/" + escolha);
        }*/
    }
}
