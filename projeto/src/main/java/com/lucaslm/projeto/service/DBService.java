package com.lucaslm.projeto.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaslm.projeto.domain.Todo;
import com.lucaslm.projeto.repository.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void InstanciaBaseDeDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot2 e Angular", LocalDateTime.parse("25/03/2022"), true);
		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", LocalDateTime.parse("22/03/2021"), true);
		Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", LocalDateTime.parse("21/03/2022"), false);
		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", LocalDateTime.parse("27/03/2021"), false);
		Todo t5 = new Todo(null, "Correr", "Correr 20 kilometros ", LocalDateTime.parse("27/09/2021"), false);
		Todo t6 = new Todo(null, "Trabalho", "Trabalho da faculdade para apresentar", LocalDateTime.parse("27/05/2021"), true);
	    

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

	}
	
}
