package exe;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		List<Funcionario> listFuncionario = new ArrayList<>();
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");

		for (int i = 0; i <= 5; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
			String data = JOptionPane.showInputDialog("Data nascimento:");
			String salario = JOptionPane.showInputDialog("Salario:");
			String funcao = JOptionPane.showInputDialog("Função:");

			Funcionario f1 = new Funcionario();
			f1.setNome(nome);
			f1.setDataNascimento(LocalDate.parse(data));
			Double salario1 = Double.valueOf(salario);
			f1.setSalario(BigDecimal.valueOf(salario1));
			f1.setFunção(funcao);

			listFuncionario.add(f1);
		}

		for (Funcionario funcionario : listFuncionario) {
			if (funcionario.getNome().equalsIgnoreCase("Joao")) {
				listFuncionario.remove(funcionario);
				break;
			} else {
				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Data: " + funcionario.getDataNascimento().format(parser));
				System.out.println("Salario " + funcionario.getSalario());
				System.out.println("Função: " + funcionario.getFunção());
			}
		}

	}
}
