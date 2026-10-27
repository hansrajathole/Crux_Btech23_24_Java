
class  Car {

    // Data Member
    static String cName = "BMW";
    String model;
    String cColor;
    int cNum;

  

    // Constructor
    Car(String model , String cColor , int cNum){
        this.model = model;
        this.cColor = cColor;
        this.cNum = cNum;
    }
    Car(){

    }

    void show(){
        
        System.out.println("car name : "+ cName);
       
    }
    void show(String cName){
        
        System.out.println("car name : "+ cName);
       
    }
    void show(String cName ,int cNum){
        
        System.out.println("car name : "+ cName);
        System.out.println("car number : "+ cNum);
       
    }


   
}

public class Car_Demo{


    public  static  void main(String agrs []){
       
        Car car2 = new Car();
        car2.model = "M4";
        car2.cColor = "brown";
        car2.cNum = 4444;

        car2.show();
        car2.show("jaguar",3333);
        car2.show("grand vitara");

    }
}