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
	
	private void traversePre(TreeNode current)
	{
		if(current == null)
			return;
		System.out.print(current.getData() + " , ");
		traversePre(current.getLeft());
		traversePre(current.getRight());
	}
	
	//print out every node
	public void traversePre()
	{
		traversePre(root);
		System.out.println();
	}
	
	private void traversePost(TreeNode current)
	{
		if(current == null)
			return;
		traversePost(current.getLeft());
		traversePost(current.getRight());
		System.out.print(current.getData() + " , ");
	}
	
	//print out every node
	public void traversePost()
	{
		traversePost(root);
		System.out.println();
	}
	
	private void traverseIn(TreeNode current)
	{
		if(current == null)
			return;
		traverseIn(current.getLeft());
		System.out.print(current.getData() + " , ");
		traverseIn(current.getRight());
		
	}
	
	//print out every node
	public void traverseIn()
	{
		traverseIn(root);
		System.out.println();
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
	
	public void delete(int key)
	{
		//find the node, keeping track of the parent
		TreeNode toDelete = root;
		TreeNode parent = root;
		boolean leftChild = false;
		//search for leaf to insert the node
		while(toDelete != null && toDelete.getData() != key)
		{
			int currentData = toDelete.getData();
			if(currentData < key ) //delete key right
			{
				parent = toDelete;
				toDelete = toDelete.getRight();
				leftChild = false;
			}
			else //delete key left
			{
				parent = toDelete;
				toDelete = toDelete.getLeft();
				leftChild = true;
			}
		}
		if(toDelete == null) //not found, nothing to do
			return;
		//at this point, current points to the node we want to delete, previous points to parent
		//delete a leaf: point parent to null
		if(toDelete.getLeft() == null && toDelete.getRight() == null)
		{
			if(leftChild)
			{
				parent.setLeft(null);
			}
			else
			{
				parent.setRight(null);
			}
			return;
		}
		//deleting a node with one child: point parent's left or right node to child
		if(toDelete.getLeft() != null && toDelete.getRight() == null) //left child is the only child
		{
			if(leftChild)
			{
				parent.setLeft(toDelete.getLeft());
			}
			else
			{
				parent.setRight(toDelete.getLeft());
			}
			return;				
		}
		if(toDelete.getLeft() == null && toDelete.getRight() != null) //right child is the only child
		{
			if(leftChild)
			{
				parent.setLeft(toDelete.getRight());
			}
			else
			{
				parent.setRight(toDelete.getRight());
			}
			return;				
		}		
		//deleting with two children: look for smallest node on the right subtree 
		//keep going left
		TreeNode smallest = toDelete.getRight();
		TreeNode smallestParent = toDelete;
		while(smallest.getLeft() != null) //until you reach the leftmost leaf
		{
			smallestParent = smallest;
			smallest = smallest.getLeft();
		}
		int newData = smallest.getData();
		delete(smallest.getData());
		toDelete.setData(newData);
	}
	/*
	search
	insert
	delete
	traverse/print
	*/
}