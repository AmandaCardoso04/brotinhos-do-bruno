package brotos.api.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brotos.api.aluno.Aluno;
import brotos.api.aluno.AlunoListagemDados;
import brotos.api.aluno.AtualizacaoDadosAlunos;
import brotos.api.aluno.DadosCadastroAluno;
import brotos.api.repository.AlunoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@ControllerAdvice
@RequestMapping("/aluno")
public class CadastroAlunoController { 
	
	@Autowired
	private AlunoRepository repository;

	@PostMapping
	@Transactional //para ter transação com banco de dados
	public void cadastrarAluno(@RequestBody @Valid DadosCadastroAluno dados){
	repository.save(new Aluno(dados));
	System.out.println(dados);
}
	@GetMapping
	public List<AlunoListagemDados> listarAlunosCadastrados(){
		return repository.findAll().stream().map(AlunoListagemDados::new).toList();	
	}
	
	@GetMapping("/{id}")
	public List<AlunoListagemDados> listarAlunosCadastradosPorId(@PathVariable Long id){
			return repository.findById(id).stream().map(AlunoListagemDados::new).toList();	
	}
	
	@PutMapping
	@Transactional //para ter transação com banco de dados
	public void atualizarCadastroAluno(@RequestBody @Valid AtualizacaoDadosAlunos dados) {
		var aluno = repository.getReferenceById(dados.id());
		aluno.atualizarDados(dados);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void excluirDadosAluno(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
