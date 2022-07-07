package lists;

public class Main {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		System.out.println("É lista vazia? " + lista.isListaVazia());
		
		lista.insereOrdenado(2);
		lista.insereOrdenado(4);
		lista.insereOrdenado(3);
		//lista.insereOrdenado(8);
		
		lista.imprimir();
		
		lista.remover(2);
		lista.remover(4);
		lista.remover(3);
	
		lista.imprimir();
		
		lista.insereOrdenado(7);
		lista.insereOrdenado(9);
		lista.insereOrdenado(10);
		
		lista.imprimir();
		
		System.out.println("Elemento 2 está na lista? " + lista.buscar(2));
        lista.remover(2);	
    	System.out.println("Elemento 2 está na lista? " + lista.buscar(2));
    	
    	System.out.println("Elemento 10 está na lista? " + lista.buscar(10));
		lista.remover(10);
		System.out.println("Elemento 10 está na lista? " + lista.buscar(10));
		System.out.println("É lista vazia? " + lista.isListaVazia());
	}

}
