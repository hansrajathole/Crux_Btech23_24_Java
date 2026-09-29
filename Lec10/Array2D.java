import java.util.Scanner;

public class Array2D{
    public static void main(String[] args) {
        

        // int arr[][] = new int[4][4];

        // int arr[][] = {{10,20,30},{40,50,60}, {70,80,90}};

        // System.out.println(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr[3]);
        // System.out.println(arr[0][0]);



        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int row = 0 ; row<n ; row++){
            for(int col = 0; col <m ; col++){
                arr[row][col] = sc.nextInt();
            }
        }


        for(int row = 0 ; row<n ; row++){
            for(int col = 0; col <m ; col++){
               System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }


    }
}