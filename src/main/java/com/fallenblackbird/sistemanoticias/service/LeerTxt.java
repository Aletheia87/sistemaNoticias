package com.fallenblackbird.sistemanoticias.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fallenblackbird.sistemanoticias.modelo.Noticia;


@Service
public class LeerTxt {

	private final static Logger logger = LoggerFactory.getLogger(LeerTxt.class);
	private ArrayList<Noticia> noticias = new ArrayList<Noticia>();
	
	public ArrayList<Noticia> leerArchivoTxt() {

		File archivo = new File("src/main/resources/static/noticias.txt");	
		
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while (linea != null) {
				String[] lineaArreglo = linea.split("@@");
				String titular = lineaArreglo[0];
				String cuerpo = lineaArreglo[1];
				String url = lineaArreglo[2];
				Noticia noticia = new Noticia(titular, cuerpo, url);
				noticias.add(noticia);
				linea = br.readLine();
			}
			br.close();
			fr.close();
			logger.info("La información está lista para ser desplegada.");
			
		} catch (Exception e) {
			logger.error("Error leyendo el fichero " + "noticias.txt" + ": " + e);
			e.printStackTrace();
		}
		return noticias;
		
	}

}