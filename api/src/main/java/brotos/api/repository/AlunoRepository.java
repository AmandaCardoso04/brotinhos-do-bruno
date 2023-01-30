package brotos.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import brotos.api.aluno.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	List<Aluno> findAll();
}
