package com.fallenblackbird.sistemanoticias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fallenblackbird.sistemanoticias.modelo.AppConfig;
import com.fallenblackbird.sistemanoticias.modelo.Noticia;

@SpringBootApplication
public class SistemaNoticiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaNoticiasApplication.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Noticia n = appContext.getBean(Noticia.class);
		System.out.println(n.toString());
	}

}
