package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@GetMapping
	public List<TopicoDto> lista(String nomeCurso) {
		if (nomeCurso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			System.out.println("aquiss");
			return TopicoDto.converter(topicos);
			
		} else {
			List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
			System.out.println(nomeCurso);
			System.out.println("aqui parametro" + nomeCurso);
			return TopicoDto.converter(topicos);
		}
	}
	
	/*@PostMapping
	public void cadastrar(@RequestBody TopicoForm form){
		
		Topico topico = form.converter();
		
		
	}*/

}
