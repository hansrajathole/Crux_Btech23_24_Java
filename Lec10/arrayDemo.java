

public class arrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];

       for(int i = 0 ; i<arr.length ; i++){
            arr[i] = (i+1)*10;
       }


    //    int newArr[] = arr;
    //    newArr[0] = 10;
    //    System.out.println(arr[0]);
    //    System.out.println(newArr[0]);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
       }

        
    }
}