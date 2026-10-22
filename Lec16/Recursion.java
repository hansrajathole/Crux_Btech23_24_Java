



public class Recursion{

    public static void Print(String name,int n){
        if(n== 0){
            return ;
        }

        Print(name, n-1);
        System.out.println(name);
    }


    public static void main(String[] args) {
        
        Print("Rahul", 5);

    }



}