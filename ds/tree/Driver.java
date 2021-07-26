public class Driver
{
	public static void main(String[] args)
	{
		BSTree tree = new BSTree();
		tree.seed();
		System.out.println(tree.search(8));
		//System.out.println(tree.search(32));
		tree.insert(18);
		System.out.println(tree.search(18));
		System.out.println("Pre order traversal:");
		tree.traversePre();
		System.out.println("Post order traversal:");
		tree.traversePost();
		System.out.println("In order traversal:");
		tree.traverseIn();
		
		/*
		System.out.println("Deleting leaf 18");
		tree.delete(18);
		tree.traverseIn();
		*/
		
		/*
		System.out.println("Deleting node with 1 child 5");
		tree.delete(5);
		tree.traverseIn();
		*/
		/*
		System.out.println("Deleting node with 1 child 20");
		tree.delete(20);
		tree.traverseIn();
		*/
		tree.insert(4);
		tree.insert(21);
		tree.insert(22);
		tree.traverseIn();
		/*
		System.out.println("Deleting node with 2 children 5");
		tree.delete(5);
		tree.traverseIn();
		*/
		System.out.println("Deleting node with 2 children 20");
		tree.delete(20);
		tree.traverseIn();
		/*
		System.out.println("Deleting node with 2 children 10");
		tree.delete(10);
		tree.traverseIn();
		*/
	}
}