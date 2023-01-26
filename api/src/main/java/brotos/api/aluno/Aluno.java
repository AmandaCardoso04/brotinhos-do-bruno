package brotos.api.aluno;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Table(name = "alunos")
@Entity(name = "alunos")
@AllArgsConstructor

public class Aluno {
	
	public Aluno() {
		
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String nomeMae;
	private String nomePai;
	private String matricula; 
	private String idade;
	private String telefone;
	private String email;
	private String senha;
	
	@Enumerated(EnumType.STRING)
	private Curso curso;
	private Periodo periodo;
	
	public Aluno(DadosCadastroAluno dados) {
		this.nome = dados.nome();
		this.nomeMae = dados.nomeMae();
		this.nomePai = dados.nomePai();
		this.matricula = dados.matricula();
		this.idade = dados.idade();
		this.email = dados.email();
		this.curso = dados.curso();
		this.periodo = dados.periodo();
		this.telefone = dados.telefone();
		this.senha = dados.senha();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	public void atualizarDados(@Valid AtualizacaoDadosAlunos dados) {
		if(dados.nome() != null) {
			this.nome = dados.nome();
			}
		if(dados.matricula() != null) {
		this.matricula = dados.matricula();
		}
		if(dados.curso() != null) {
			this.curso = dados.curso();
		}
		if(dados.periodo() != null) {
			this.periodo = dados.periodo();
		}
		if(dados.email() != null) {
			this.email = dados.email();
		}
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
