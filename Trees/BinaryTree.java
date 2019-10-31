package Trees;

public class BinaryTree {
	
	Node root;
	
	
	void preOrderTraversal(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.element);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	void postOrderTraversal(Node root)
	{
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.element);
	}
	
	void inOrderTraversal(Node root)
	{
		inOrderTraversal(root.left);
		System.out.println(root.element);
		inOrderTraversal(root.right);
	}

	int findHeight(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftHeight= findHeight(root.left);
		int rightHeight=findHeight(root.right);
		return 1+ Math.max(leftHeight, rightHeight);
	}
	
	int count(Node root){
		
		if(root==null){
			return 0;
		}
		return 1+count(root.left)+count(root.right);
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt=new BinaryTree();
		bt.root=new Node(3);
		bt.root.left=new Node(4);
		bt.root.right=new Node(5);
		bt.root.left.left=new Node(6);
		bt.root.left.right=new Node(7);
		
		
		System.out.println(bt.count(bt.root));
		
	}

}
