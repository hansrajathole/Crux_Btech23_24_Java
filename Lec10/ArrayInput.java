import java.util.Scanner;

public class ArrayInput {


    public static void main(String[] args) {
        
        int arr[] =  new int[5];

        Scanner read = new Scanner(System.in);

        // to take Input for user
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = read.nextInt();
        }


        // to Print Output on console
        for(int i = 0 ; i<arr.length ; i++){
           System.out.println(arr[i]);
        }



    }
}
