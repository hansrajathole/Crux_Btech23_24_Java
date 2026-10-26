
class  Car {

    // Data Member
    String cName;
    String cColor;
    int cNum;

    // Constructor
    Car(){
      
        cColor= "red";
        cName = "Supra";
        cNum = 1000;

    }

    void show(){
        
        System.out.println("car name : "+ cName);
        System.out.println("car color : "+ cColor);
        System.out.println("car Number : "+ cNum);
    }
   
}

public class Car_Demo{


    public  static  void main(String agrs []){
        Car obj = new Car();
        
        // obj.show();

        Car obj1 = new Car();
        obj1.cName = "verna";
        obj.cColor = "black";
        obj1.cNum = 905;

        obj.show();
        obj1.show();

    }
}