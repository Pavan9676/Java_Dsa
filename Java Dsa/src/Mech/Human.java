package Mech;

public class Human {
    int weight;
    int height;
    String name;
    int noOfGirlfriends;
     public static void main(String[] args) {

    }

    public void run(String name){ // parametrized method

        System.out.println(name + " is Running ");

    }

    int  girlfriends(){ // non perametrized // no parameters.
         return this.noOfGirlfriends;
    }

    void walk(String  name){
        System.out.println(name + " is walking");
    }

    void chat (String name){
        System.out.println(name + " is chatting");
    }



    /*
    Class -
    data + functions = class
    variables + methods = class

    Data:
    syntax - how to write
    dataType variablename  = value;

    functions/methods :
    Syntax - acess_specifier return_type nameofmethod( parameters ){

        return type;
    }

     */
}


