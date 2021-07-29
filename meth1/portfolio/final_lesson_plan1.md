## Lesson objective:
SWAT:
- Define methods
- Call a method on an objective
- Trace a method call when methods call other methods
### Intended student audience
12th grade AP CSA class, including students with disabilities and ELL students

### Pedagogical techniques
Code tracing is used in this lesson to solidify the concept of methods delegating work to other methods.

### New York State Standards for Digital Fluency and Computer Science
9-12.CT.4
Implement a program using a
combination of student-defined and
third-party functions to organize the
computation.

### Slideshow
https://docs.google.com/presentation/d/16x5bL0BMIXmaHAAnQ6wkLSK7nPboeFSXqNwyr5JHAK0/edit?usp=sharing

### Aim:
I can call a void method and trace method calls.

### Warm up
time: 7 mins
Students answer in Nearpod, What is an activity you wish someone else would do for you? How would you describe the steps of this activity to the person you are delegating it to?
2 students share out
Compare the idea of "delegating steps" to methods in Java.
---

### Lesson Content
time: 15 minutes
Students work on the Calling a Void Method section in CSAwesome: 
https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit2-Using-Objects/topic-2-3-methods-no-params.html
While working on this section students answer these questions in their guided notes:
1. How do you call an object's method?
2. What is procedural abstraction and why should you use it?

This includes reading and multiple choice questions.
As a whole class read key definitions and answer a sample of the multiple choice questions from these sections:
	Calling Methods
	Procedural Abstraction
	
Students complete the sections independently but ask peers for help when needed.


---

### Lesson Activity
time: 18 minutes
We do:
Complete a stack trace diagram of the following code from CSAwesome:
public class Song {
  
    public void print() {
        System.out.println("Old MacDonald had a farm");
        chorus();
        System.out.print("And on that farm he had a ");
        animal();
        chorus();
    }
    public void chorus()
    {
        System.out.println("E-I-E-I-O");
    }
    
    public void animal() {
       System.out.println("duck");
    }
    public static void main(String[] args) {
       Song s = new Song();
       s.print();
    }
}

You do, working in pairs:
Complete a stack trace diagram of the following code from CSAwesome 2-3-6:
  public class Song
  {
    public void print()
    {
        System.out.print("I like to ");
        eat();
        eat();
        eat();
        fruit();
    }

    public void fruit()
    {
        System.out.println("apples and bananas!");
    }

    public void eat()
    {
       System.out.print("eat ");
    }

    public static void main(String[] args)
    {
       Song s = new Song();
       s.print();
    }
}
1 pair shares out their diagram.
---

### Closing
time: 5 minutes
Review your notes. Copy and paste into the next Nearpod slide either:
-one point you think you will have trouble understanding/remembering
-the most important point you are taking away from this lesson.

---