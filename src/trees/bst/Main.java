package trees.bst;

public class Main {

	public static void main(String[] args) {

		Node root = new Node(15);
		Tree tree = new Tree(root);

		//Insert
		tree.insert(6);
		tree.insert(18);
		tree.insert(1);
		tree.insert(9);
		tree.insert(16);
		tree.insert(22);
		tree.insert(7);
		tree.insert(14);
		System.out.println("--------------------------------");

		// Em ordem
		tree.inOrder(tree.getRoot());
		System.out.println();
		System.out.println("--------------------------------");

		// Buscar (14, -1)
		try {
			System.out.print("Buscando [14]: ");
			System.out.println(tree.search(14).getInfo());
			System.out.print("Buscando [-1]: ");
			System.out.println(tree.search(-1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("--------------------------------");

		//Buscar mínimo
		System.out.print("Buscando mínimo: ");
		System.out.println(tree.searchMin(tree.getRoot()).getInfo());
		System.out.println("--------------------------------");

		//Buscar máximo
		System.out.print("Buscando máximo: ");
		System.out.println(tree.searchMax(tree.getRoot()).getInfo());
		System.out.println("--------------------------------");

		// Sucessor (14 e 22)
		try {
			System.out.print("Buscando sucessor de [14]: ");
			System.out.println(tree.getSucessor(14).getInfo());
			System.out.print("Buscando sucessor de [22]: ");
			System.out.println(tree.getSucessor(22).getInfo());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("--------------------------------");
		
		// Remove todos
		tree.remove(7);
		tree.remove(6);
		tree.remove(9);
		tree.remove(14);
		tree.remove(15);
		tree.remove(16);
		tree.remove(18);
		tree.remove(22);
		tree.remove(1);
		
		// Em ordem
		tree.inOrder(tree.getRoot());
		System.out.println();
		System.out.println("--------------------------------");
	}
}