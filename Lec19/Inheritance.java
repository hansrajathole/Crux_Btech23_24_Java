package Lec19;


 class  Parent {

    String pName = "ratiram";
    int age = 69;

    void display(){
        System.out.println("your father name is : "+pName);
        System.out.println("your father age is : "+age);
    }
    
}


class Child extends Parent { 

    String name = "ghansham";
    int age = 22;
    
    void print(){
        System.out.println("your name is : "+name);
        System.out.println("your age is : "+age);
    }
}

 

public class Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        Parent p1 = new Parent();

        c1.display();
        c1.print();


    }
}
 