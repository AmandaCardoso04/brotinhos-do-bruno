package brotos.api.aluno;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record AtualizacaoDadosAlunos(
		
		@NotNull
		Long id,
		
		String student,
		
		Curso course, 
		
		Periodo period, 
		
		@Email
		String email) {

}
