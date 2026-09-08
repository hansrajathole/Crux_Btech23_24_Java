

public class Pattern1 {

    public static void main(String[] args) {
        
        int n = 5;
        int row = 0;

        // Outer for row
        while(row < n){


            // inner loop for col
            int col = 0;
            while(col <n){
                System.out.print("* ");
                col++;
            }

            // Next line prep
            System.out.println();
            row++;

        }
    }
}