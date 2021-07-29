## Lesson objective:
SWAT:
- Practice modeling real-world concepts with Java objects
- Practice writing classes, calling methods, using the Math.random() and String methods

### Intended student audience
12th grade AP CSA class, including students with disabilities and ELL students

### Pedagogical techniques
Unplugged activities to make the very abstract concept of object-oriented programming more concrete.
Subgoal labeling to provide students with a starting point for their project. Additional scaffolding in the form of a fully built example with certain areas hidden for students with disabilities or ELL students if needed.

### Aim:
I can use object-oriented programming to model a real-world concept.

### Warm up
time: 5 mins
With no restrictions, what would you want to be when you grow up? Why? Your answer does not have to be "realistic" ie astronaut, movie star, Jedi are all acceptable answers.

---

### Lesson Content
time: 10 mins
Instructor models designing an object to represent a job using a student volunteer's warm up response.
What attributes does your chosen role have? What information might you know about it?
What can your role do?
Example:
A ballerina has a:
- name
- company
- age
- level

A ballerina can:
- dance
- put on a costume
- receive flowers

Students individually list attributes and behaviours for their roles.
---

### Lesson Activity
time: 25 mins
When I Grow Up Project
1. Define a class that represents an answer to the question "What do you want to be when you grow up?"
Your answer does not have to be "realistic."

Your class must have:
- at least 3 instance variables of at least 2 different data types
- a constructor
- at least 1 void method
- at least 1 non-void method
- at least 1 use of String concatenation or a String method
- at least 1 use of the random() method from the Math class

2. In your main method, write code that creates an instance of your object. Call each of your methods.

Scaffolding:
Comments as subgoal labels:
public class YourClassNameHere //class definition
{
  //instance variables
  


  
  //constructor
  




  //TODO use String concatenation in at least one of the methods below
  //TODO use the random() method from the Math class in at least one of the methods below
  
  //non-void method
  
  



  //void method



}

class Main {
  public static void main(String[] args) {
    //constructor call to instantiate new object


    //calling non-void method on the object
    

    //calling void method on the object
    
  }
}
---
Scaffolding for SPED and ELL students as needed - a fully worked example with strategic fill-in-the blanks, provided in the form of a screen shot so that students have to type rather than copy and paste.

public class Ballerina //class definition
{
  //instance variables
  private String name;
  private String role;
  private String company;
  private double salary;
  
  //constructor
  public Ballerina(String theName, String theRole, String theCompany, double theSalary)
  {
    name = theName;
    role = theRole;
    company = theCompany;
    salary = theSalary;
  }

//non-void method
  public String toString()
  {
    return name + ", " + role + " performing at " + company;
  }

//void method
  public void dance()
  {
    int random = (int)(Math.random() * 10 ) + 1;
    System.out.println("Twirling " + random + " times.");
  }
}

class Main {
  public static void main(String[] args) {
    //constructor call to instantiate new object
    Ballerina msFridman = new Ballerina("Ms. Fridman", "Principal", "American Ballet Theater", 200000);

    //calling non-void method on the object
    System.out.println(msFridman.toString());

    //calling void method on the object
    msFridman.dance();
  }
}
### Closing
time: 5 mins
Which object-oriented concept did you find most challenging when working on this project? Why?
---