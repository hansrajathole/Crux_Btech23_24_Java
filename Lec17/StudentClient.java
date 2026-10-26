
import  java.lang.String;
public class StudentClient {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.Show_yourInfo();

        s1.name = "kaju";
        s1.age = 19;
        

        Student s2 = new Student();
        s2.name = "Anamika";
        s2.age = 20;

        s1.Show_yourInfo();
        s2.Show_yourInfo();
    }
}
