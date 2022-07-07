package graphs;

public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph(8);
		
		graph.connect(1, 2);
		graph.connect(1, 3);
		graph.connect(1, 4);
		graph.connect(2, 1);
		graph.connect(2, 4);
		graph.connect(2, 5);
		graph.connect(3, 1);
		graph.connect(3, 5);
		graph.connect(5, 2);
		graph.connect(6, 5);
		graph.connect(6, 7);
		graph.connect(6, 8);
		graph.connect(7, 6);
		graph.connect(8, 6);
		
		graph.print();
		
		graph.BFS(1);
	}
	
}
