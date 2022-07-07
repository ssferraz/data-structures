package circularlists;

public class Main {

	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		lista.imprime();
		System.out.println(lista.isListaVazia());
		lista.insereOrdenado(1);
		lista.insereOrdenado(4);
		lista.insereOrdenado(3);
		lista.insereOrdenado(2);
		lista.insereOrdenado(5);
		lista.insereOrdenado(0);

		lista.imprime();
		
		lista.remover(7);
	
		//lista.remover(7);
	
		lista.imprime();
		//lista.insereOrdenado(3);
		//lista.insereOrdenado(1);
		//System.out.println(lista.isListaVazia());
		//System.out.println(lista.getRef().getInfo());
		//System.out.println(lista.getRef().getProx().getInfo());

	}
}
