package com.genshin_api.Api.Genshin.service;

public interface IConversor {
    <T> T obtemDados(String json, Class<T> classe);
}
