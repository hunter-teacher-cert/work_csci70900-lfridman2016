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
			System.out.println(current.getData());
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
	
	public void insert(int key)
	{
		TreeNode n = new TreeNode(key);
		TreeNode current = root;
		TreeNode previous = root;
		//search for leaf to insert the node
		while(current != null)
		{
			int currentData = current.getData();
			if(currentData == key)
			{
				//already exists
				return;
			}
			else if(currentData < key ) //insert key right
			{
				previous = current;
				current = current.getRight();
			}
			else //insert key left
			{
				previous = current;
				current = current.getLeft();
			}
		}
		if(previous.getData() < key)
		{
			previous.setRight(n);
		}			
		else
		{
			previous.setLeft(n);
		}
	}
	/*
	search
	insert
	delete
	traverse/print
	*/
}