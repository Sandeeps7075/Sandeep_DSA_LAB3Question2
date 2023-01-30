package Driver;

import BST.Node;

public class Main {

	public static void main(String[] args) {

		Node node = new Node();
		Node root = null;
		root = node.insert(root, 40);
		root = node.insert(root, 20);
		root = node.insert(root, 60);
		root = node.insert(root, 10);
		root = node.insert(root, 30);
		root = node.insert(root, 50);
		root = node.insert(root, 70);

		int sum = 130;
		node.findPair(root, sum);
	}

}