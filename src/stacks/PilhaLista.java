package stacks;

public class PilhaLista {

	private No topo;
	
	public PilhaLista() {
		this.topo = null;
	}
	
	public void push(String info) {
		No novoNo = new No(info, this.topo);
		this.topo = novoNo;
	}
	
	public String pop() {
		if(topo == null) {
			return "Pilha vazia"; 
		}
		String info = this.topo.getInfo();
		this.topo = this.topo.getProx();
		return info;
	}
	
	public boolean pilhaVazia() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void imprime() {
		for(No p = this.topo; p != null; p = p.getProx()) {
			System.out.println("[" + p.getInfo() + "] ");
		}
	}

	public No getTopo() {
		return topo;
	}

	public void setTopo(No topo) {
		this.topo = topo;
	}	
	
}
