package lists;

public class ListaSimples {

	private int qtd;
	private No ref;

	public ListaSimples() {
		this.qtd = 0;
		this.ref = null;
	}

	public void insereOrdenado(int info) {
		No novo;
		No anterior = null;
		No p = this.ref;
		
		while(p != null && p.getInfo() < info){
			anterior = p;
			p = p.getProx();			
		}

		novo = new No(info);

		if(anterior == null){
			novo.setProx(this.ref);
			this.ref = novo;
		} else{
			novo.setProx(anterior.getProx());
			anterior.setProx(novo);
		}
		
		this.qtd++;
	}

	public boolean isListaVazia() {
		return this.qtd == 0;
	}

	public void imprimir() {
		for(No p = this.ref; p != null; p = p.getProx()) {
			System.out.print("[" + p.getInfo() + "] ");
		}
		System.out.println();
	}

	public boolean buscar(int info) {
		for(No p = this.ref; p != null; p = p.getProx()) {
			if(p.getInfo() == info) {
				return true;
			}
		}
		return false;
	}

	public void remover(int info) {
		No ant = null;
		if(isListaVazia()) {
			return;
		}
		if(this.ref.getInfo() == info) {
			setRef(this.getRef().getProx());
			this.qtd--;
			return;
		}
		for(No p = this.ref; p != null && p.getInfo() <= info; p = p.getProx()) {
			if(p.getInfo() == info) {
				ant.setProx(p.getProx());
				this.qtd--;
				return;
			} 
			ant = p;
		}
		
	
	}

	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public No getRef() {
		return ref;
	}
	public void setRef(No ref) {
		this.ref = ref;
	}

}