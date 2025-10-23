package com.genshin_api.Api.Genshin.service;

public interface IConverteDados {
    <T> T obtemDados(String json, Class<T> classe);
}
