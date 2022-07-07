package queues;

public class FilaLista  {

	private No inicio;
	private No fim;
	private int tamanho;
	
	public FilaLista() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public void enqueue(int info) {
		No novoNo;
		if(isFilaVazia()) {
			novoNo = new No(info, null);
			inicio = novoNo;
			fim = novoNo;
			this.tamanho++;
			return;
		} else {
			novoNo = new No(info);
			fim.setProx(novoNo);
			fim = novoNo;
			this.tamanho++;
		}
		
	}
	
	public void dequeue() {
		if (!isFilaVazia()) {
			this.inicio = this.inicio.getProx();
			this.tamanho--;
		}else {
			System.out.println("Impossível remover. Fila vazia!");
		}
	}
	
	public void imprime() {
		if (isFilaVazia()) {
			System.out.println("Fila vazia");
			return;
		}
		for(No p = this.inicio; p != null; p = p.getProx()) {
			System.out.print("[" + p.getInfo() + "] ");
		}
		System.out.println();
	}
	
	public boolean isFilaVazia() {
		if(this.tamanho != 0) {
			return false;
		}
		return true;
	}
	
	
	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
}