package pacote;

import java.util.Scanner;

public class TestePosto {

	public static void main(String[] args) {

		int op;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n****************************************");
			System.out.println("\nSejam bem-vindes ao movimento Sa�de na Rua!");
			System.out.println("\n(1) Caso voc� seja funcion�rio");
			System.out.println("\n(2) Caso voc� seja paciente");
			System.out.println("\n(0) Para encerrar");
			System.out.print("\n\nDigite uma op��o: ");
			op = leia.nextInt();

			switch (op) {
			case 0:
				System.out.println("\nO programa foi encerrado!");
				break;

			case 1:
				leia.nextLine();
				System.out.print("Digite seu nome: ");
				String nome = leia.nextLine();
				System.out.print("Digite sua fun��o: ");
				String funcao = leia.nextLine();
				System.out.print("Digite seu setor: ");
				String setor = leia.nextLine();
				System.out.print("Informe seu local de trabalho: ");
				String localTrabalho = leia.nextLine();
				System.out.print("Informe seu sal�rio: ");
				Double salario = leia.nextDouble();
				Funcionarios func = new Funcionarios(nome, funcao, setor, localTrabalho, salario);

				System.out.println("\n");
				System.out.println("\n");

				func.imprimeCartao(func);
				break;

			case 2:
				leia.nextLine();
				System.out.print("Digite seu nome: ");
				String nome2 = leia.nextLine();
				System.out.print("Digite sua idade: ");
				String idade = leia.nextLine();
				System.out.print("Digite seu CPF (Opcional): ");
				String cpf = leia.nextLine();	

				System.out.println("\n1 - Buscar sua consulta ja marcada");
				System.out.println("\n2 - Se deseja cancelar uma consulta j� marcada");
				System.out.println("\n3 - Marcar consulta com a especialidade m�dica Pediatra");
				System.out.println("\n4 - Marcar consulta com a especialidade m�dica Cl�nico Geral");
				System.out.println("\n5 - Marcar consulta com a especialidade m�dica Geriatra");
				System.out.println("\n6 - Marcar consulta com a especialidade m�dica Dentista");
				System.out.println("\n7 - SAIR");
				System.out.println("\nDigite sua op��o: ");
				op = leia.nextInt();

				if (op == 1) {
					System.out.println("\nSua consulta est� agendada para o pr�ximo dia �til. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHor�rios de distribui��o de fixas: 07h �s 09h - manh� | 13h �s 15h - tarde\n");
				} else if (op == 2) {
					System.out.println("\nSua consulta acaba de ser cancelada!!!!\n");
				} else if (op == 3) {
					System.out.println("\nSua consulta com o(a) Pediatra foi agendada para o pr�ximo dia �til. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHor�rios de distribui��o de fixas: 07h �s 09h - manh� | 13h �s 15h - tarde\n");
				} else if (op == 4) {
					System.out.println("\n2Sua consulta com o Cl�nico Geral foi agendada para o pr�ximo dia �til. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHor�rios de distribui��o de fixas: 07h �s 09h - manh� | 13h �s 15h - tarde\n");
				} else if (op == 5) {
					System.out.println("\nSua consulta com a Geri�tra foi agendada para o pr�ximo dia �til. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHor�rios de distribui��o de fixas: 07h �s 09h - manh� | 13h �s 15h - tarde\n");
				} else if (op == 6) {
					System.out.println("\nSua consulta com a Dentista foi agendada para o pr�ximo dia �til. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHor�rios de distribui��o de fixas: 07h �s 09h - manh� | 13h �s 15h - tarde");
				} else if (op == 7) {
					System.out.println("\nSaindo do sistema");
				}
				break;
			default:
				if (op < 0 || op > 3) {
					System.out.println("\nOp��o inv�lida, tente novamente!");
				}
			}

		} while (op != 0);
		
		leia.close();

	}
}