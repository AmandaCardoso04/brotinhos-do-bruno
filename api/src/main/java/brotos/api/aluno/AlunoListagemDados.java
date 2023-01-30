package brotos.api.aluno;

public record AlunoListagemDados(Long id, String student, String mother,String father,
		String phone,String age, Curso course, Periodo period , String email){

	public AlunoListagemDados(Aluno aluno) {
		this(aluno.getId(), aluno.getStudent(), aluno.getMother(),aluno.getFather(), 
				aluno.getphone(), aluno.getAge() , aluno.getCourse(), aluno.getPeriod(), aluno.getEmail());
	}
}
