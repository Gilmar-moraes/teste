package model;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {

	private BigDecimal salario; 
	private String fun��o;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(BigDecimal salario, String fun��o) {
		super();
		this.salario = salario;
		this.fun��o = fun��o;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getFun��o() {
		return fun��o;
	}

	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}
}
