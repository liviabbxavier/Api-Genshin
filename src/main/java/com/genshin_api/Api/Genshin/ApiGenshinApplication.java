package com.genshin_api.Api.Genshin;

import com.genshin_api.Api.Genshin.Principal.MenuDeEscolhas;
import com.genshin_api.Api.Genshin.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGenshinApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiGenshinApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        MenuDeEscolhas menu = new MenuDeEscolhas();
        menu.menuEscolhas();

//        Principal menu1 = new Principal();
//        menu1.menuEscolhas();
    }
}
