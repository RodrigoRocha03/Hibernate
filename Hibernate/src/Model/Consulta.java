package Model;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Consulta")
public class Consulta {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "codigo_medico")
	@NotNull
	  private Medico medico;
	
	@Id
	@ManyToOne
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "nBeneficiario_paciente")
	@NotNull
	  private Paciente paciente;
	
	@Id
	@Column(name = "data_consulta")
	@NotNull
	private LocalDateTime data;
	
	@Column(name = "observacao", length = 300)
	@NotNull
	private String Observacao;

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	
	
	
}
