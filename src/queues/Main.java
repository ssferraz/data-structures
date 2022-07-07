package queues;

public class Main {

	public static void main(String[] args) {
		FilaLista fila = new FilaLista();
		
		fila.dequeue();
		
		fila.imprime();
		
		fila.enqueue(2);
		fila.enqueue(3);
		fila.enqueue(4);
		
		fila.imprime();
		
		fila.dequeue(); 
		fila.dequeue(); 
		fila.dequeue(); 
		
		fila.imprime();
		
		fila.enqueue(5);
		fila.enqueue(6);
		fila.enqueue(7);
		
		fila.imprime();
		
		fila.dequeue(); 
		
		fila.imprime();

	}

}