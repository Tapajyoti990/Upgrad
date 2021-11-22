package recursion;
//Write a program to print maximum height Of a binary tree

class Node {

	int key;
	Node left, right;
 
	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
public class HeightBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(5);
		root.left=new Node(12);
		root.right=new Node(-80);
		root.left.left=new Node(10);
		root.left.right=new Node(-5);
		System.out.println(compute(root));
	}
	public static int compute(Node root) {
		if(root == null) {
			return 0;
		}
		return Math.max(1+compute(root.left), 1+compute(root.right));
	}

}
