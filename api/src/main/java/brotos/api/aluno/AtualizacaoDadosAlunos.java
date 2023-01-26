package brotos.api.aluno;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record AtualizacaoDadosAlunos(
		
		@NotNull
		Long id,
		
		String nome,
		
		//@Pattern(regexp ="\\d-{4,8}") //qtos digitos tem que ter na matricula
		String matricula, 
		
		Curso curso, 
		
		Periodo periodo, 
		
		@Email
		String email) {

}
