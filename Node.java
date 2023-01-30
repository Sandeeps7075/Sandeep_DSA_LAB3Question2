package BST;

import java.util.*;

public class Node {

	int data;
	Node left;
	Node right;

	static Node NewNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	public Node insert(Node root, int key) {
		if (root == null)
			return NewNode(key);
		if (key < root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;
	}

	public boolean findpairsum(Node root, int sum, HashSet<Integer> set) {
		if (root == null)
			return false;

		if (findpairsum(root.left, sum, set))
			return true;

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is found (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else
			set.add(root.data);

		return findpairsum(root.right, sum, set);
	}

	public void findPair(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpairsum(root, sum, set))
			System.out.print("Print nodes are not found" + "\n");
	}

}
