package trees.bst;

public class Tree {

	private Node root;
	private int size;

	public Tree(Node root) {
		this.root = root;
		this.size = 1;
	}

	public boolean isEmpty() {
		return this.root == null;
	}
	
	public int getHeight(Node temp) {
		if(!this.isEmpty()) {
			if(temp!=null) {
				int left = getHeight(temp.getLeft()) + 1;
				int right = getHeight(temp.getRight()) + 1;
				if(left>right) {
					return left;
				}
				else {
					return right;
				}
			}
		}
		return -1;
	}

	public void insert(int info) {
		Node subtree = new Node(info);
		Node ref = this.root;
		while(true) {
			if (ref.getInfo() >= info) {
				if (ref.getLeft() == null) {
					ref.setLeft(subtree);
					this.size++;
					break;
				} else {
					ref = ref.getLeft();
				}
			}else {
				if(ref.getRight() == null) {
					ref.setRight(subtree);
					this.size++;
					break;
				} else {
					ref = ref.getRight();
				}
			}
		}
	}
	
	public void remove(int info) {
		this.root = removeRec(this.root, info);
	}
	
	private Node removeRec(Node root, int info) {
		// Caso 1
        if (info < root.getInfo()) {
            root.setLeft(removeRec(root.getLeft(), info));
            }
        else if (info > root.getInfo()) {
            root.setRight(removeRec(root.getRight(), info));
        }
        // Caso 2
        else {
            if (root.getLeft() == null) {
                return root.getRight();
            }
            else if (root.getRight() == null) {
                return root.getLeft();
            }
            root.setInfo(searchMin(root.getRight()).getInfo());
            
        // Caso 3
            root.setRight(removeRec(root.getRight(), root.getInfo()));
        }
        return root;
    }

	public Node getSucessor(int info) throws NullPointerException {
		Node ref = search(info);
		if (ref == null) {
			throw new NullPointerException("Node not found!");
		}
		if (ref.getRight() != null) {
			return searchMin(ref.getRight());
		}else {
			Node suc = null;
			Node ant = this.root;
			while(ant!= ref) {
				if (ref.getInfo()< ant.getInfo()) {
					suc = ant;
					ant = ant.getLeft();
				}else {
					ant = ant.getRight();
				}
			}
			if (suc == null) {
				throw new NullPointerException("Node not found!");
			}else {
				return suc;
			}
		}
	}

	public Node search(int info) throws NullPointerException {
		Node ref = this.root;
		while(true) {
			if (ref.getInfo() == info) {
				return ref;
			}
			if (ref.getInfo() > info) {
				if (ref.getLeft() == null) {
					throw new NullPointerException("Node not found!");
				} else {
					ref = ref.getLeft();
				}
			}else {
				if(ref.getRight() == null) {
					throw new NullPointerException("Node not found!");
				} else {
					ref = ref.getRight();
				}
			}
		}
	}

	public Node searchMax(Node root) {
		if(root==null) {
			return null;
		}
		while(root.getRight() != null) {
			root = root.getRight();
		}
		return root;
	}

	public Node searchMin(Node root) {
		if(root==null) {
			return null;
		}
		while(root.getLeft() != null) {
			root = root.getLeft();
		}
		return root;
	}

	private void printNode(Node node) {
		System.out.print("[" + node.getInfo()+ "]");
	}

	public void preOrder(Node root) {
		if (root != null) {
			printNode(root);
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.getLeft());
			printNode(root);
			inOrder(root.getRight());
		}
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			printNode(root);
		}
	}

	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
