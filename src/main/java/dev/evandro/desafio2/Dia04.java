package dev.evandro.desafio2;

import java.util.List;

public class Dia04 extends DiaGenerico{

	@Override
	public void executarDesafio(List<Pessoa> lista) {
		// TODO Auto-generated method stub
	lista.stream()
	     .filter(p -> p.getNome().contains("Ana "))
	     .toList()
	     .forEach(p -> System.out.println(p));
	}

}
