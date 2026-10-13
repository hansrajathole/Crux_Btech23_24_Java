

public class string {
    public static void main(String[] args) {
        String str = "raju";
        String str1 = new String("raj");

        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        System.out.println(equals(str, str1));


        System.out.println(str.compareTo(str1)); // 0    // -v   // +v

        

    }

    public static boolean equals(String str1 , String str2){
        if(str1 == str2){
            return true;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0 ; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }

        return true;
    }


}