package brotos.api.aluno;

public record AlunoListagemDados(Long id, String student, String mother,String father,
		String phone,String age, Curso course, Periodo period ){

	public AlunoListagemDados(Aluno aluno) {
		this(aluno.getId(), aluno.getstudent(), aluno.getmother(),aluno.getfather(), 
				aluno.getphone(), aluno.getage() , aluno.getcourse(), aluno.getperiod());
	}
}
