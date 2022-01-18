package oops;

// TESTING
public class Implementation {
    public int joo = 5;
    private  int jooo = 6;
    protected  int joooo = 7;
    protected  void hehe(){
        System.out.println("pro imp");
    }
    int jo = 8;
    public static void main(String[] args) {
        System.out.println("haha");
        Parent p = new Parent();
        System.out.println();

    }

    static {
        System.out.println("hehe");
    }
}

/*
INHERITANCE:
 */
// SINGLE INHERITANCE
class Parent{
    int age = 30;
    String name;



    void age(){

        System.out.println("parent");
    }


}
class Child extends Implementation{
    Child(){}
    Child(int age){
        //this.age = age;
    }
    void age(int n){
        System.out.println(n + " "+ "hjgytyt");
    }
    void paw(){
        System.out.println(joooo);
    }

}


