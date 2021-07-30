//Michelle Best and Lyuba Fridman

/*
Create a class that represents a queue. This class should use a linked list that you build (not the built in Java class) with at least two pointers. Your class should implement the following methods:

constructor(s)
enqueue(value) <-- add value to the end of the queue
x = dequeue() <-- remove and return the value at the front of the queue
x = front() <-- return but don't remove the value at the front
isEmpty() <-- returns true if the queue is empty
size() <-- returns the number of items in the queue
*/

public class Queue
{
	//instance variables
	private Node front; // the front of the queue
    private int length; //how many items there are in the queue
	/*
	constructor(s)
	*/
	public Queue()
	{
		front = null;
		length = 0;
	}
	public Queue(Node front)
	{
		this.front = front;
		length = 1;
	}
	/*
	enqueue(value) <-- add value to the end of the queue
	refer to insert(int index) in linkedList
	*/
	public void enqueue(String value)
	{
	  length++;
	  Node m = new Node(value);
	  //if the list has no nodes, insert value at the front
	  if(front == null)
	  {
		  front = m;
		  return;
	  }
      Node currentNode =front;
	  
	  //loop until we reach the last node
      while(currentNode.getNext() != null){
        currentNode =currentNode.getNext();
      }
	  
      //currentNode now points to the node right before where we want to insert
	  currentNode.setNext(m);
	  
	}
	
	/*
	x = dequeue() <-- remove and return the value at the front of the queue
	*/
	public String dequeue()
	{
		if(front != null)
		{
			String frontVal = front.getData();
			front = front.getNext();
			length--;
			return frontVal;
		}
		return null;
		
	}
	
	/*
	x = front() <-- return but don't remove the value at the front
	*/
	public String front()
	{
		if(front != null)
		{
			return front.getData();
		}
		else return null;
	}
	/*
	isEmpty() <-- returns true if the queue is empty
	*/
	public boolean isEmpty()
	{
		return length == 0;
	}
	/*
	size() <-- returns the number of items in the queue
	*/
	public int size()
	{
		return length;
	}
	
	public String toString()
	{
		if(front == null)
			return "";
		Node currentNode =front;
	    String result = "";
	  //loop until we reach the last node
	  while(currentNode != null){
		  result += currentNode.getData() + " " ;
		currentNode =currentNode.getNext();
	  }
	  return result;
	}
}