package hashtables;

import java.util.LinkedList;
import java.util.Objects;


public class HashTable {

	private LinkedList<String>[] t;

	@SuppressWarnings("unchecked")
	public HashTable(int m) {
		t = new LinkedList[m];
	}

	public void insere(String str) {
		int hashCode = getHashCode(str);
		if (t[hashCode] == null) {
			t[hashCode] = new LinkedList<String>();
		}
		t[hashCode].add(str);
	}

	public String busca(String str) {
		String result = "";
		int hashCode = getHashCode(str);
		if (t[hashCode] != null) {
			for (String item : t[hashCode]) {
				if(item.equals(str)) {
					result = item +" - T["+hashCode+"]";
					return result;
				}
			}
		}
		return "Elemento não encontrado.";
	}

	public void remove(String str) {
		int hashCode = getHashCode(str);
		if (t[hashCode] == null) {
			return;
		}
		for (String item : t[hashCode]) {
			if(item.equals(str)) {
				t[hashCode].remove(item);
				if (t[hashCode].isEmpty()) {
					t[hashCode] = null;
				}
			}
		}
	}
	
	public void remove(int key) {
		while(!t[key].isEmpty()) {
			t[key].remove();
		}
		if(t[key].isEmpty()) {
			t[key] = null;
		}
	}

	private int getHashCode(String key) {
		int k = Objects.hashCode(key);
		int m = t.length;
		return Math.abs(k % m);
	}

	public LinkedList<String>[] getHashtable() {
		return t;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int max = t.length - 1;
		sb.append("[\n");
		for (int i = 0; ; i++) {
			sb.append("k["+ i +"] = "+t[i]+"\n");
			if (i == max)
				return sb.append("]").toString();
		}
	}

}
