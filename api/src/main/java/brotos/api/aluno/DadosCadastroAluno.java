package brotos.api.aluno;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroAluno(
		
		@NotBlank //nao pode ser vazio nem nulo
		String student,
		
		@NotNull
		String mother,
		
		@NotNull
		String father,
		
		@NotBlank
		String phone,
		
		@NotBlank
		//@Pattern(regexp ="\\d-{1,6}")
		String age, 
		
		@NotNull // nao notblank pq é um enum
		Curso course, 
		
		@NotNull
		Periodo period, 
		
		@NotBlank
		@Email
		String email, 
		
		String password) {

}
