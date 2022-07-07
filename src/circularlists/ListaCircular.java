package circularlists;

public class ListaCircular {

	private No ref; // referencia para o primeiro no da lista
	private int tamanho; // quantidade de elementos na lista

	public ListaCircular() {
		this.ref = null;
		this.tamanho = 0;		
	}

	public void insereOrdenado(int elemento) {
		No novoNo = new No(elemento);
		if (isListaVazia()) {
			novoNo.setProx(novoNo);
			this.ref = novoNo;
			this.tamanho++;
			return;
		}
		if (this.tamanho == 1) {
			if (this.ref.getInfo() <= elemento) {
				novoNo.setProx(this.ref);
				this.ref.setProx(novoNo);
				this.ref = novoNo;	
				this.tamanho++;
			} else {
				this.ref.setProx(novoNo);
				novoNo.setProx(this.ref);
				this.tamanho++;
			}
			return;
		} else {
			if (elemento < this.ref.getProx().getInfo()) {
				novoNo.setProx(this.ref.getProx());
				this.ref.setProx(novoNo);
				this.tamanho++;
				return;
			}
			if (elemento > this.ref.getInfo()) {
				novoNo.setProx(this.ref.getProx());
				this.ref.setProx(novoNo);
				this.ref = novoNo;
				this.tamanho++;
				return;
			}
			for(No p = this.ref.getProx(); p!= this.ref; p = p.getProx()) {
				if (elemento <= p.getProx().getInfo() && elemento > p.getInfo()) {
					novoNo.setProx(p.getProx());
					p.setProx(novoNo);
					this.tamanho++;
					return;
				}
			}
		}
	}

	public void imprime() {
		if (isListaVazia()) {
			System.out.println("Lista vazia!");
		} else {
			for(No p = this.ref.getProx(); p != this.ref; p = p.getProx()) {
				System.out.print("[ " + p.getInfo() + " ]");
			}
			System.out.print("[ " + this.ref.getInfo() + " ]");
			System.out.println();
		}
	}

	public boolean isListaVazia() {
		return this.tamanho == 0;
	}

	public void remover(int elemento) {
		No ant = null;
		if (isListaVazia()) {
			return;
		}
		
		if (this.tamanho == 1) {
			this.ref = null;
			this.tamanho--;
			return;
		}
		
		for(No p = this.ref.getProx(); p != this.ref; p = p.getProx()) {
			ant = p;
			// remove primeiro elemento
			if (elemento == p.getInfo() && this.ref.getProx().getInfo() == elemento) {
				this.ref.setProx(p.getProx());
				ant.setProx(p.getProx());
				this.tamanho--;
				return;
			} // remove elementos do meio
			else if (elemento == p.getInfo()) {
					
					this.tamanho--;
					return;
				}
		}
		//remove último elemento
		if (elemento == this.ref.getInfo() && ant!=null) {
			ant.setProx(this.ref.getProx());
			this.ref = ant;
			this.tamanho--;
		}

	}	

	public No getRef() {
		return ref;
	}

	public void setRef(No ref) {
		this.ref = ref;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
