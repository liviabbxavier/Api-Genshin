package com.genshin_api.Api.Genshin.Principal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genshin_api.Api.Genshin.Jogo.DadosPersonagens;
import com.genshin_api.Api.Genshin.Jogo.Personagens;
import com.genshin_api.Api.Genshin.service.ConsumoApi;
import com.genshin_api.Api.Genshin.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDeEscolhas {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private ObjectMapper mapper = new ObjectMapper();

    private final String ENDERECO = "https://genshin.jmp.blue/";

    public void menuEscolhas() {
        int escolha = 0;
        while (escolha != 5) {
            System.out.println("""
                ---Sobre o que voce deseja saber?---
                1 - Personagens
                2 - Elementos
                3 - Inimigos
                4 - Nações
                5 - Sair""");
            escolha = leitura.nextInt();
            leitura.nextLine();

            switch (escolha) {
                case 1: {
                    String personagens = leitura.nextLine();
                    var json = consumo.obtemDados(ENDERECO + "characters");
                    Personagens listaPersonagens = conversor.obtemDados(json, Personagens.class);
                    Scanner leituraPerso = new Scanner(System.in);
                    System.out.println("Qual personagem voce deseja procurar?");
                    String buscaPersonagem = leituraPerso.nextLine();
                    json = consumo.obtemDados(ENDERECO + "characters/" + buscaPersonagem.replace(" ", "+"));
                    DadosPersonagens dados = conversor.obtemDados(json, DadosPersonagens.class);
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 2: {
                    var json = consumo.obtemDados(ENDERECO + "elements");
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 3: {
                    var json = consumo.obtemDados(ENDERECO + "enemies");
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 4: {
                    var json = consumo.obtemDados(ENDERECO + "nations");
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 5: System.out.println("Programa encerrado!");
                default: System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}