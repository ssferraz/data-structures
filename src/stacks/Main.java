package stacks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PilhaLista pilha = new PilhaLista();
		Scanner sc = new Scanner(System.in);
		String expressao = sc.nextLine();
		String aux = "";
		sc.close();
		for (int i = 0; i < expressao.length(); i++) {
			if (expressao.charAt(i) == '(') {
				pilha.push("(");
			} else if (expressao.charAt(i) == ')') {
				aux = pilha.pop();
			}
		}
		if (pilha.pilhaVazia() && !aux.equals("Pilha vazia")) {
			System.out.println("Expressão válida");
		} else {
			System.out.println("Expressão inválida");
		}
	}
}

