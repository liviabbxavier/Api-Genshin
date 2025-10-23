package com.genshin_api.Api.Genshin.Principal;

import com.genshin_api.Api.Genshin.Jogo.*;
import com.genshin_api.Api.Genshin.service.ConsumoApi;
import com.genshin_api.Api.Genshin.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDeEscolhas {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://genshin.jmp.blue/?t=";
    private final String API_KEY = "&apikey=522d9a5";

    public void menuEscolhas() {
        System.out.println("---Sobre o que voce deseja saber?---");
        var escolha = leitura.nextLine();
        var json = consumo.obtemDados(ENDERECO + escolha.replace(" ", "+") + API_KEY);
        DadosJogo dados = conversor.obtemDados(json, DadosJogo.class);
        System.out.println(dados);

        List<DadosJogo> jogo = new ArrayList<>();
        List<DadosPersonagens> personagens = new ArrayList<>();
        List<DadosNacoes> nacoes = new ArrayList<>();
        List<DadosElementos> elementos = new ArrayList<>();
        List<DadosInimigos> inimigos = new ArrayList<>();

        for () {
            json = consumo.obtemDados()
        }
    }
}
