package brotos.api.aluno;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Table(name = "alunos")
@Entity(name = "alunos")
@AllArgsConstructor

public class Aluno {
	
	public Aluno() {
		
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String student;
	private String mother;
	private String father;
	private String age;
	private String phone;
	private String email;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Curso course;
	private Periodo period;
	
	public Aluno(DadosCadastroAluno dados) {
		this.student = dados.student();
		this.mother = dados.mother();
		this.father = dados.father();
		this.age = dados.age();
		this.email = dados.email();
		this.course = dados.course();
		this.period = dados.period();
		this.phone = dados.phone();
		this.password = dados.password();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}

	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Curso getCourse() {
		return course;
	}
	public void setCourse(Curso course) {
		this.course = course;
	}
	public Periodo getPeriod() {
		return period;
	}
	public void setPeriod(Periodo period) {
		this.period = period;
	}
	public void atualizarDados(@Valid AtualizacaoDadosAlunos dados) {
		if(dados.student() != null) {
			this.student = dados.student();
			}
	
		if(dados.course() != null) {
			this.course = dados.course();
		}
		if(dados.period() != null) {
			this.period = dados.period();
		}
		if(dados.email() != null) {
			this.email = dados.email();
		}
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}

}
