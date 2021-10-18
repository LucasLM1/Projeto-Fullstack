package com.lucaslm.projeto.service;



import java.text.ParseException;
import java.text.SimpleDateFormat;
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

 
	public void InstanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot e Angular 12", sdf.parse("06/10/2022"), true);
		Todo t2 = new Todo(null, "Ler", "Terminar o livro a arte da guerra", sdf.parse("31/12/2021"), false);
		Todo t3 = new Todo(null, "Ranking", "Subir para o Ranking Grão Mestre", sdf.parse("30/10/2021"), false);
		Todo t4 = new Todo(null, "Projeto", "Terminar o projeto fullstack/ Lista de tarefas", sdf.parse("20/10/2021"), false);
		Todo t5 = new Todo(null, "Caminhar", "Caminhar 10 kilometros ", sdf.parse("18/10/2021"), true);
		Todo t6 = new Todo(null, "Atividade", "Terminar atividades da faculdade", sdf.parse("18/10/2021"), true);
	    

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	} 
}
