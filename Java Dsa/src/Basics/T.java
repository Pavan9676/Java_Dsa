package Basics;

import oops.Implementation;

public class T extends Implementation{
    public static void main(String[] args) {
        T t = new T();
        System.out.println(t.joo);
        c o = new c();
    }
}


interface A{
    int age = 7;
    void greet();
}
interface B {
    String name = " pavan ";
    void hello();
}
class c implements A, B{
    @Override
    public void greet() {

    }
    public void hello(){
        System.out.println("hello");
    }
}