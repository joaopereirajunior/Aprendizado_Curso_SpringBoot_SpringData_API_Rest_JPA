package br.com.alura.forum.controller;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
@RestController
public class HelloController {
	
	@ResponseBody
	public String hello() {
		System.out.println("passou aqui o metodo");
		return "Hello World!";
	}
	
	@GetMapping(value="/listarCurso")
	public List<Curso> listarCurso(){
		List<Curso> cursoList = new ArrayList<Curso>();
		
		Curso curso = new Curso();
		curso.setCategoria("BackEnd");
		curso.setNome("Java MongoDb");
		cursoList.add(curso);
		
		Curso curso1 = new Curso();
		curso.setCategoria("BackEnd");
		curso.setNome("Java Spring");
		cursoList.add(curso);
		Curso curso2 = new Curso();
		curso.setCategoria("BackEnd");
		curso.setNome("Java Java ElastiSearch");
		cursoList.add(curso);

		Curso curso3 = new Curso();
		curso.setCategoria("BackEnd");
		curso.setNome("Java Swagger");
		cursoList.add(curso);
		
		return Arrays.asList(curso, curso1, curso2,curso3);
		
		
	}

}
