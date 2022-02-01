package com.fallenblackbird.sistemanoticias.modelo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Noticia noticia() {
		return new Noticia();
	}
}