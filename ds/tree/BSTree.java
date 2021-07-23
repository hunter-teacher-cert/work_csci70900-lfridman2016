import java.io.*;
import java.util.*;

public class BSTree
{
	private TreeNode root;
	
	public BSTree()
	{
		root = null;
	}
	
	public void seed()
	{
		TreeNode t = new TreeNode(10);
		root = t;
		t = new TreeNode(5);
		root.setLeft(t);
		t = new TreeNode(20);
		root.setRight(t);
		
		root.getLeft().setRight(new TreeNode(8));
	}
	
	public int search(int key)
	{
		TreeNode current = root;
		while(current != null)
		{
			if(current.getData() ==  key)
			{
				return current.getData();
			}
			if(current.getData() < key) //search the right
			{
				current = current.getRight();
			}
			else //current data > key, search the left
			{
				current = current.getLeft();
			}				
		}
		//while loop ended without finding something
		throw new NullPointerException();
		
	}
	/*
	search
	insert
	delete
	traverse/print
	*/
}