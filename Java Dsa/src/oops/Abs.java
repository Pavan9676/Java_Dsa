package oops;
/**
 *      // Abstract class can be created using abstract keyword.
 *     // Abstract class can have both abstract and non-abstract methods.
 *     // Abstract methods do not have body.
 *     // Abstract methods must be implemented by the child class.
 *
 *
 *     Difference between abstract Class and Interface is:
 *      Abstract methods can have both abstract and non-abstract methods
 *      But Interface only have abstract methods.
 *
 *
 */
class Abs {
    public static void main(String[] args) {
        paw2 p = new paw2();
       // p.m();
    }
}
class paw1{
    int a = 5;
    void m1(){
        System.out.println("paw3");
    }
}
class paw2 extends paw1{
    public void m(){
        //System.out.println(a);
        this.m1();
        this.m2();
    }
    void m2(){
        System.out.println("m2 method");
    }
}











