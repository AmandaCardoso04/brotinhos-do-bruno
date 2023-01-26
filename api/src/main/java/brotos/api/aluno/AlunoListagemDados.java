package brotos.api.aluno;

public record AlunoListagemDados(Long id, String nome, String nomeMae,String nomePai,String matricula,
		String telefone,String idade, Curso curso, Periodo periodo ){

	public AlunoListagemDados(Aluno aluno) {
		this(aluno.getId(), aluno.getNome(), aluno.getNomeMae(),aluno.getNomePai(),aluno.getMatricula(), 
				aluno.getTelefone(), aluno.getIdade() , aluno.getCurso(), aluno.getPeriodo());
	}
}
