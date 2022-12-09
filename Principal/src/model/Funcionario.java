package model;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {

	private BigDecimal salario; 
	private String função;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(BigDecimal salario, String função) {
		super();
		this.salario = salario;
		this.função = função;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getFunção() {
		return função;
	}

	public void setFunção(String função) {
		this.função = função;
	}
}
