package brotos.api.aluno;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record AtualizacaoDadosAlunos(
		
		@NotNull
		Long id,
		
		String nome,
		
		Curso curso, 
		
		Periodo periodo, 
		
		@Email
		String email) {

}
