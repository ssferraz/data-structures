package hashtables;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashTable hashtable = new HashTable(53);
		Scanner sc = new Scanner(System.in);
		
		// Insere o primeiro elemento da lista
		hashtable.insere("j");
		
		// Insere 998 elementos aleatórios na lista
		for (int i = 0; i < 998; i++) {
			hashtable.insere(randomString());
		}
		
		// Insere o último elemento da lista
		hashtable.insere("i");
		
		// 1. buscar um elemento existente que seja o primeiro da lista
		System.out.println("Buscar um elemento existente que seja o primeiro da lista [j]: ");
		System.out.println(hashtable.busca("j"));
		System.out.println("---------------------------------------------------------------------------");
		// 2. buscar um elemento existente que seja o último da lista e não seja o primeiro
		System.out.println("Buscar um elemento existente que seja o último da lista e não seja o primeiro [i]: ");
		System.out.println(hashtable.busca("i"));
		System.out.println("---------------------------------------------------------------------------");
		// 3. buscar um elemento que nunca foi inserido
		System.out.println("Buscar um elemento que nunca foi inserido [z]: ");
		System.out.println(hashtable.busca("z"));
		System.out.println("---------------------------------------------------------------------------");
		// 4. buscar um elemento que já foi inserido e removido
		System.out.println("Buscar um elemento que já foi inserido e removido [i]: ");
		hashtable.remove("i");
		System.out.println(hashtable.busca("i"));
		System.out.println("---------------------------------------------------------------------------");
		// Imprime hashtable
		System.out.println("Hashtable ANTES de REMOVER elementos de uma posição da tabela");
		System.out.println(hashtable.toString());
		System.out.println("---------------------------------------------------------------------------");
	
		// 5. remover todos os elementos de uma posição da tabela e voltar a inserir elementos novamente
		// setUp
		LinkedList<String> aux = hashtable.getHashtable()[0];
		LinkedList<String> aux1 = new LinkedList<>();
		for (String item : aux) {
			aux1.add(item);
		}
		// remover todos os elementos de uma posição da tabela
		hashtable.remove(0);
		System.out.println("Hashtable DEPOIS de REMOVER elementos de uma posição da tabela");
		System.out.println(hashtable.toString());
		System.out.println("---------------------------------------------------------------------------");
		// inserir elementos novamente
		for (String item : aux1) {
			hashtable.insere(item);
		}
		
		// Imprime hashtable
		System.out.println("Hashtable DEPOIS de INSERIR elementos de uma posição da tabela");
		System.out.println(hashtable.toString());
		System.out.println("---------------------------------------------------------------------------");
		sc.close();
	}

	public static String randomString() {
		int leftLimit = 97; // letra 'a' 97
		int rightLimit = 122; // letra 'z' 122
		int targetStringLength = 5;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1)
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();

		return generatedString;
	}

}
