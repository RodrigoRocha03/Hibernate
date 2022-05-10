package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "Medico")
public class Medico {

@Id
@Column(name = "codigo_medico")
@NotNull
private int codigo;

@Column(name = "nome_medico", length = 100)
@NotNull
private String nome;

@Column(name = "contato_medico", length = 11)
@NotNull
private String contato;

@Column(name = "especialidade_medico", length = 100)
@NotNull
private String especialidade;

@Override
public String toString() {
	return "Medico [codigo=" + codigo + ", nome=" + nome + ", contato=" + contato + ", especialidade=" + especialidade
			+ "]";
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getContato() {
	return contato;
}
public void setContato(String contato) {
	this.contato = contato;
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}

}
