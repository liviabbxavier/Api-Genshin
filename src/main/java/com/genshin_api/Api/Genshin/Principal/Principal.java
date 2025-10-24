package com.genshin_api.Api.Genshin.Principal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genshin_api.Api.Genshin.Jogo.DadosNacoes;
import com.genshin_api.Api.Genshin.Jogo.DadosPersonagens;
import com.genshin_api.Api.Genshin.service.ConsumoApi;
import com.genshin_api.Api.Genshin.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private ObjectMapper mapper = new ObjectMapper();
    private final String ENDERECO = "https://genshin.jmp.blue/";

    public void menuEscolhas() {
        while (true) {
            System.out.println("""
            ---Sobre o que voce deseja saber?---
            1 - Personagens
            2 - Elementos
            3 - Inimigos
            4 - Nações
            5 - Sair""");

            int escolha = leitura.nextInt();
            leitura.nextLine(); // limpa o \n pendente

            switch (escolha) {
                case 1 -> {
                    var json = consumo.obtemDados(ENDERECO + "characters");
                    imprimirJson(json);

                    System.out.println("Qual personagem voce deseja procurar?");
                    String busca = leitura.nextLine().replace(" ", "+");
                    json = consumo.obtemDados(ENDERECO + "characters/" + busca);
                    DadosPersonagens dados = conversor.obtemDados(json, DadosPersonagens.class);
                    imprimirJson(json);
                }
                case 2 -> {
                    var json = consumo.obtemDados(ENDERECO + "elements");
                    imprimirJson(json);
                }
                case 3 -> {
                    var json = consumo.obtemDados(ENDERECO + "enemies");
                    imprimirJson(json);
                }
                case 4 -> {
                    var json = consumo.obtemDados(ENDERECO + "nations");
                    imprimirJson(json);

                    System.out.println("Qual nação voce deseja ver?");
                    String busca = leitura.nextLine().replace(" ", "+");
                    json = consumo.obtemDados(ENDERECO + "nations/" + busca);
                    DadosNacoes dados = conversor.obtemDados(json, DadosNacoes.class);
                    imprimirJson(json);
                }
                case 5 -> {
                    System.out.println("Programa encerrado!");
                    break;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

            if (escolha == 5) break;
        }
    }

    private void imprimirJson(String json) {
        try {
            JsonNode jsonNode = mapper.readTree(json);
            System.out.println(jsonNode.toPrettyString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Erro ao processar JSON", e);
        }
    }



}
