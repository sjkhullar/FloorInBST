
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class FloorInBST {
	
	public static Node floor(Node root, int data) {
		if (root == null) 
			return root;
		if (root.data == data) 
			return root;
		if (root.data >  data) 
			return floor(root.left, data);
		Node right = floor(root.right, data); 
		if (right == null) 
			return root;
		else return right; 
	}
	
	public static void inorder(Node root) {		
		if(root == null)
			return;
		inorder(root.left);
		System.out.printf("%d ",root.data);
		inorder(root.right);		
	}	
}
