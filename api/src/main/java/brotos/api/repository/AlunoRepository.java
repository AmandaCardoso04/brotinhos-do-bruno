package brotos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import brotos.api.aluno.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
