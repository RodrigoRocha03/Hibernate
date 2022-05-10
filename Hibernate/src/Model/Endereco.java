package Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

@Entity
@Table(name = "endereco")
public class Endereco {
	


@Id
@ManyToOne
@JoinColumn(name = "id_medico")
@Null
 private Medico medico;

@Id
@ManyToOne
@GeneratedValue(strategy = GenerationType.IDENTITY)
@JoinColumn(name = "id_paciente")
@Null
 private Paciente paciente; 

@Id
@Column(name = "id_endereco")
@NotNull
private int enderecoId;

public Paciente getPaciente() {
	return paciente;
}
public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
}
@Column(name = "logradouro", length = 10 )
 private String logradouro;
@Column(name = "CEP", length = 9 )
 private String CEP;
@Column(name = "complemento", length = 30 )
 private String complemento;
@Column(name = "numero")
 private int numero;

public Medico getMedico() {
	return medico;
}
public void setMedico(Medico medico) {
	this.medico = medico;
}
public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getCEP() {
	return CEP;
}
public void setCEP(String cEP) {
	CEP = cEP;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}


}