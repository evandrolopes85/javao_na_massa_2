package dev.evandro.desafio2;

import java.util.List;
import java.util.OptionalInt;

public class Dia06 extends DiaGenerico{

	@Override
	public void executarDesafio(List<Pessoa> lista) {
		// TODO Auto-generated method stub
		int maiorIdade = lista.stream()
			.mapToInt(p -> p.getIdade())
			.max()
			.getAsInt();
		
		int menorIdade = lista.stream()
		.mapToInt(p -> p.getIdade())
		.min()
		.getAsInt();
		
		int soma = lista.stream().mapToInt(p -> p.getIdade()).sum();
			//.forEach(i -> System.out.println(i));
		
		double media = lista.stream().mapToInt(p -> p.getIdade()).average().getAsDouble();
		
		
		System.out.println("Maior Idade: " + maiorIdade);
		System.out.println("Meno Idade: " + menorIdade);
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	}

}
