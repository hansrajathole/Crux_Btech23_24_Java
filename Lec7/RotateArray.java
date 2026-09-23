
import  java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k = k%arr.length;
        System.out.println(k);
        int j = 0;
        while (j<k) {
            int temp = arr[arr.length-1];
            for(int i = arr.length-1; i>0 ; i--){
                arr[i] = arr[i-1];

            }
            arr[0] = temp;
            j++;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
