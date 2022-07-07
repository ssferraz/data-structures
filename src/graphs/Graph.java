package graphs;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Graph {

	private int vertices;
	private LinkedList<Integer>[] edges;

	@SuppressWarnings("unchecked")
	public Graph(int v) {
		this.vertices = v;
		this.edges = new LinkedList[v];
		for (int i = 0; i < edges.length; i++) {
			this.edges[i] = new LinkedList<Integer>();
		}
	}

	public LinkedList<Integer> getEdges(int id) {
		return edges[id];
	}

	public LinkedList<Integer>[] getEdges() {
		return edges;
	}

	public void connect(int source, int destination) {
		if(source > vertices || destination > vertices || source <= 0 || destination <= 0) {
			return;
		}
		edges[source-1].add(destination-1);
	}

	public void print() {
		for (int i = 0; i < edges.length; i++) {
			System.out.print((i+1) + " -> " + "[");
			for (int j = 0; j < edges[i].size(); j++) {
				if(j == (edges[i].size()-1)) {
					System.out.print(edges[i].get(j)+1);
				}else {
					System.out.print(edges[i].get(j)+1);
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
		System.out.println("--------------");
	}

	public void BFS(int s) {
		s = s - 1;
		if(s < 0) {
			s = 0;
		}else if(s >= vertices){
			s = vertices;
		}

		int cor[] = new int[vertices]; 
		int pai[] = new int[vertices];
		int dist[] = new int[vertices];

		for(int i = 0; i < edges.length; i++) {
			cor[i] = 0;
			pai[i] = -1;
			dist[i] = -1;
		}

		cor[s] = 1;
		dist[s] = 0;

		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.push(s);

		while(!queue.isEmpty()) {
			int origem = queue.removeFirst();
			for (Integer info : edges[origem]) {
				if(cor[info] == 0) {
					cor[info] = 1;
					pai[info] = origem + 1;
					dist[info] = dist[origem] + 1;
					queue.push(info);
				}
			}
			cor[origem] = 3;
		}

		for(int i = 0; i < vertices; i++) {
			if(dist[i] != -1 && (pai[i]>=(s+1) || pai[i] == -1)) {
				System.out.println((i+1) + " -> Pai: " + pai[i]+ " Dist: " + dist[i]);
			}
		}		
	}
}

