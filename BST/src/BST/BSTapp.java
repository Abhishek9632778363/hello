package BST;

class Node 
{
	int data;
	Node Left;
	Node Right;
	
}
class BST{
	public Node insert( Node node, int val) {
if(node == null)
	{return Createnewnode(val);}
else if(val<node.data)
{node.Left = insert(node.Left, val);}
else
{node.Right = insert(node.Right, val);}
return node;
	}
	public Node Createnewnode(int k) {
		Node a = new Node();
		a.data = k;
		a.Left = null;
		a.Right = null;
		return a;
		
	}
}

public class BSTapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST a = new BST();
		Node root = null;
         root = a.insert(root,43);
		root = a.insert(root,3);
		root = a.insert(root,38);
		root = a.insert(root,8);
		

	}

}
