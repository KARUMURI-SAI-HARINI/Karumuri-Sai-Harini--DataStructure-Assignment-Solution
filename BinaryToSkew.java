package assigniii;

class Node {
	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}
}

public class BinaryToSkew {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void bTs(Node root, int order) {

		if (root == null) {
			return;
		}

		if (order > 0) {
			bTs(root.right, order);
		} else {
			bTs(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			bTs(leftNode, order);
		} else {
			bTs(rightNode, order);
		}
	}

	static void ST(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		ST(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToSkew tree = new BinaryToSkew();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;
		bTs(node, order);
		ST(headNode);
	}

}
