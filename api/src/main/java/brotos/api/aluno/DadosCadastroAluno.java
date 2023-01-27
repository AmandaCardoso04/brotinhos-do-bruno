package brotos.api.aluno;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroAluno(
		
		@NotBlank //nao pode ser vazio nem nulo
		String nome,
		
		@NotNull
		String nomeMae,
		
		@NotNull
		String nomePai,
		
		@NotBlank
		String telefone,
		
		@NotBlank
		//@Pattern(regexp ="\\d-{1,6}")
		String idade, 
		
		@NotNull // nao notblank pq é um enum
		Curso curso, 
		
		@NotNull
		Periodo periodo, 
		
		@NotBlank
		@Email
		String email, 
		
		@NotBlank
		String senha) {

}
