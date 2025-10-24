package com.genshin_api.Api.Genshin.Principal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genshin_api.Api.Genshin.service.ConsumoApi;
import com.genshin_api.Api.Genshin.service.ConverteDados;

import java.util.Scanner;

public class MenuDeEscolhas {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private ObjectMapper mapper = new ObjectMapper();

    private final String ENDERECO = "https://genshin.jmp.blue/";

    public void menuEscolhas() {
        System.out.println("""
                ---Sobre o que voce deseja saber?---
                1 - Personagens
                2 - Elementos
                3 - Inimigos
                4 - Nações
                0 - Sair""");
        int escolha = leitura.nextInt();

            switch (escolha) {
                case 1 -> {
                    var json = consumo.obtemDados(ENDERECO + "characters");
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 2 -> {
                    var json = consumo.obtemDados(ENDERECO + "elements");
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 3 -> {
                    var json = consumo.obtemDados(ENDERECO + "enemies");
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 4 -> {
                    var json = consumo.obtemDados(ENDERECO + "nations");
                    try {
                        JsonNode jsonNode = mapper.readTree(json);
                        String jsonFormatted = jsonNode.toPrettyString();
                        System.out.println(jsonFormatted);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 0 -> System.out.println("Programa encerrado!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            } leitura.close();
        }
    }