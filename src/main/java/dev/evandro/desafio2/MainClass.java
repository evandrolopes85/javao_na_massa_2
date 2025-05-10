package dev.evandro.desafio2;

import java.io.File;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainClass {
	public static void main(String[] args) {
		try {
			File f = new File("pessoa.json");
			String jsonStr = new String(Files.readAllBytes(Paths.get("pessoa.json")));

			Gson gson = new Gson();
			Type type = new TypeToken<List<Pessoa>>() {
			}.getType();
			List<Pessoa> lista = gson.fromJson(jsonStr, type);

			lista.forEach(p -> System.out.println(p));

			Pessoa novaPessoa = new Pessoa(151, "Evandro", "evandro@mail.com", "123.456.789-01", 40);
			//List<Pessoa> rest1 = lista.stream().toList(); // Cria uma lista imutavel
			List<Pessoa> rest2 = lista.stream().collect(Collectors.toList()); // Cria uma Lista mutavel 
			rest2.add(novaPessoa);
			System.out.println(rest2);

			
			DiaGenerico dia = new Dia06();
			
			
			dia.executarDesafio(lista);
			// System.out.println(jsonStr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
