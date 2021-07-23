public class Driver
{
	public static void main(String[] args)
	{
		BSTree tree = new BSTree();
		tree.seed();
		System.out.println(tree.search(8));
		System.out.println(tree.search(32));
		
	}
}