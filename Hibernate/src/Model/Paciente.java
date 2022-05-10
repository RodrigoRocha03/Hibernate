package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Paciente")
public class Paciente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "nBeneficiario_paciente")
@NotNull
private int nBeneficiario;
@Column(name = "nome_Paciente", length = 100)
@NotNull
private String nome;
@Column(name = "telefone_Paciente", length = 11)
@NotNull
private String telefone;


@Override
public String toString() {
	return "Paciente [nome=" + nome + ", telefone=" + telefone + ", nBeneficiario=" + nBeneficiario + "]";
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public int getnBeneficiario() {
	return nBeneficiario;
}
public void setnBeneficiario(int nBeneficiario) {
	this.nBeneficiario = nBeneficiario;
}


}
