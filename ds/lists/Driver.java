//intro to linked lists
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Node n;
	n = new Node();
	n.setData("Eduardo");
	

	Node n2 = new Node("Brian");
	n.setNext(n2);

	System.out.println(n);

	System.out.println(n2);

	System.out.println(n.getNext());
	n.getNext().setNext(new Node("Steph"));
	System.out.println(n2.getNext());
	System.out.println(n.getNext().getNext());
	
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
	// 2. Write the code to insert an "x"
	//    between the b and the c
	// 3. Write the code to delete the c


	//1
	Node L;
	Node a = new Node("a");
	Node b = new Node("b");
	Node c = new Node("c");
	Node d = new Node("d");
	Node e = new Node("e");

	L=a;
	a.setNext(b);
	b.setNext(c);
	c.setNext(d);
	d.setNext(e);
	System.out.println("Part 1:");
	// remember not to lose the head / start
	// of the list - make a copy
	Node currentNode;
	currentNode = L;
	while (currentNode != null){
	    System.out.print(currentNode+"->");
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	System.out.println("null");

	//2
	Node x = new Node("X");
	x.setNext(c);
	b.setNext(x);
	System.out.println("Part 2:");
	currentNode = L;
	while (currentNode != null){
	    System.out.print(currentNode+"->");
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	System.out.println("null");

	//3
	b.setNext(d);
	currentNode = L;
	while (currentNode != null){
	    System.out.print(currentNode+"->");
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	System.out.println("null");

	/* Or:
	   L = new Node("a");
	   L.setNext(new Node("B"));
	   L.getNext().setNext(new Node("C"));
	   L.getNext().getNext().setNext(new Node("D"));
	   etc
	*/

	System.out.println("\n");
	System.out.println("Llist");
	System.out.println("-----------");
	
	Llist ll = new Llist();

	ll.addFront("a");
  ll.addFront("b");
  ll.addFront("c");
  ll.addFront("d");
  System.out.println("The initial list: " + ll);
  /*
  System.out.println(ll.get(0));
  System.out.println(ll.get(2));
  System.out.println(ll.get(3));
  System.out.println(ll.get(4));
  System.out.println(ll.get(5));
  */
	ll.set(1, "g");
	System.out.println("After set g at 1: " + ll);

	ll.set(0, "h");
	System.out.println("After set h at 0: " + ll);

	ll.set(3, "i");
	System.out.println("After set i at 3: " + ll);	

	ll.set(4, "j");
	System.out.println("After set j at 4: " + ll);		
	
	ll.insert(1, "gg");
	System.out.println("After insert gg at 1: " + ll);

	ll.insert(0, "hh");
	System.out.println("After insert hh at 0: " + ll);

	ll.set(3, "ii");
	System.out.println("After insert ii at 3: " + ll);	

	ll.set(4, "jj");
	System.out.println("After insert jj at 4: " + ll);

   //test search
	ll.search("i");
	System.out.println("Search for I: " +  ll.search("i") );
	ll.search("j");
	System.out.println("Search for J: " +  ll.search("j") );	
	
	ll.remove(1);
	System.out.println("After remove at 1: " + ll);
	
	ll.remove(0);
	System.out.println("After remove at 0: " + ll);
	
	ll.remove(7);
	System.out.println("After remove at 7: " + ll);
	
	ll.remove(4);
	System.out.println("After remove at 4: " + ll);
	
    }
}
/*
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {

    Node n;
  	n = new Node();
  	n.setData("Eduardo");

  	Node n2 = new Node("Brian");
  	n.setNext(n2);

  Node L = new Node();
  L.setData("a");

  Node L1=new Node("b");
  L.setNext(L1);
  
  Node L2=new Node("c");
  L1.setNext(L2);

//	n.getNext().setNext(new Node("Steph"));
  L2.setNext(new Node("x"));

  Node L3=new Node("d");
 //L.setNext(L2);

	  System.out.println(L);
  	System.out.println(L1);
    System.out.println(L2);
    System.out.println(L3);
/*
while(L!=null)
{
  	System.out.println(L + "->");
    L=L.getNext();
}
*/
//	System.out.println("null");
 
 /*
	System.out.println("############### ");

	System.out.println(n);

	System.out.println(n2);

	System.out.println(n.getNext());
	n.getNext().setNext(new Node("Steph"));
	System.out.println(n2.getNext());
	System.out.println(n.getNext().getNext());

	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
	// 2. Write the code to insert an "x"
	//    between the b and the c
	// 3. Write the code to delete the c
    }
}

*/