
import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        

        int arr[] = {4,3,2,1};
            int value = arr[0];
            for(int i = 1 ; i<arr.length ; i++){
                value *= 10;
                value += arr[i];

            }

            value+=1;
            int copyVal = value;
            System.out.println(value);
            int count = 0;
            while(copyVal != 0){
                count++;
                copyVal /= 10;
            }

            
            int newArr[] = new int[count];
            count--;
            while(value != 0){
                int digit = value%10;
                newArr[count--] = digit;
                value /= 10;
            }

        System.out.println(Arrays.toString(newArr));

    }
}