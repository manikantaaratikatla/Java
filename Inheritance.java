package mani;
//SINGLE INHERITANCE
/*
    
	// Parent class
	class Animal {
	    void sound() {
	        System.out.println("Animals make sounds");
	    }
	}

	// Child class
	class Dog extends Animal {
	    void bark() {
	        System.out.println("Dog barks");
	    }
	}

	// Main class
	public class Inheritance {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.sound();  // Inherited method from Animal class
	        myDog.bark();   // Method of Dog class
	    }
	}
	*/
     // MULTI LEVEL INHERTANCE
/*
	// Grandparent class
	class Animal {
	    void sound() {
	        System.out.println("Animals make sounds");
	    }
	}

	// Parent class
	class Mammal extends Animal {
	    void walk() {
	        System.out.println("Mammals walk");
	    }
	}

	// Child class
	class Dog extends Mammal {
	    void bark() {
	        System.out.println("Dog barks");
	    }
	}

	// Main class
	public class Inheritance {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.sound();  // Inherited from Animal
	        myDog.walk();   // Inherited from Mammal
	        myDog.bark();   // Method of Dog class
	    }
	}
*/
 // HIERARCHICAL INHERTANCE
/*
//Parent class
class Animal {
 void sound() {
     System.out.println("Animals make sounds");
 }
}

//Child class 1
class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks");
 }
}

//Child class 2
class Cat extends Animal {
 void meow() {
     System.out.println("Cat meows");
 }
}

//Main class
public class Inheritance {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     myDog.sound();  // Inherited from Animal
     myDog.bark();   // Method of Dog class

     Cat myCat = new Cat();
     myCat.sound();  // Inherited from Animal
     myCat.meow();   // Method of Cat class
 }
}
*/
// MULTIPLE INHERTANCE
//First interface
interface Animal {
 void eat();
}

//Second interface
interface Bird {
 void fly();
}

//Child class implementing multiple interfaces
class Sparrow implements Animal, Bird {
 public void eat() {
     System.out.println("Sparrow eats grains");
 }

 public void fly() {
     System.out.println("Sparrow flies in the sky");
 }
}

//Main class
public class Inheritance {
 public static void main(String[] args) {
     Sparrow mySparrow = new Sparrow();
     mySparrow.eat();  // Implemented method from Animal
     mySparrow.fly();  // Implemented method from Bird
 }
}

