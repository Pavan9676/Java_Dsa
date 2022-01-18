package oops;

// args.


import Basics.Addition;

public class Main  {
    static public void main(String[] args) {
        Addition ad = new Addition();

    }

}

 class Car{
    // Class variables.
    // Anything defined as static can be accessed without creating object of that class.
    static private int age;
    String name;
    char ch;

    // Constructor overloading is supported in java. But Constructor overriding is not supported in java.
    // we can achieve constructor overloading by changing either the name of parameters or number of parameters.
    // constructor overriding is not possible.
    // Constructor can be called only once (While creating the object).
    // A class can have any number of constructors. But, we can use only one constructor to create object.
    // same name as Class name.
    // Constructor does not have any return type.

     Car(){
        System.out.println("Default constructor is called");
    }
    // this keyword: this keyword is used to refer to the class variables in the constructor.
    Car(int age){
        this.age = age;
    }
    Car(String name){
        this.name = name;
    }
    Car(int age, String name){
        this.age = age;
        this.name = name;
    }
    Car(char c){
        this.ch = c;
    }


    /*
        Class is a blueprint of objects. Class is used to create Objects.
        new Keyword.
     */
     /*
        Constructor
            Constructor is a special method used to create Objects.
      */
//    we have to daclare variable.
    // Class Variables can be initialized by using constructors.

}


/*
    Inheritance - definition
    Declereation - extends keyword is used.

 */

class A{
   static  int a = 5;
}
class B {
   static int b = 6;
}

class C {
    static int c = 7;
}



// multiple inheritance using interfaces
class D implements one,two{
    @Override
    public void hello() {

    }
}


interface one{
    int a = 5;
    abstract  void hello();

}
interface two{
    int b = 6;
}






