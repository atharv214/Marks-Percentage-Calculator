       
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

 System.out.print("enter obtained marks: ");
        float obtainMarks = sc.nextFloat();
        System.out.print("enter total marks: ");
        float totalMarks = sc.nextFloat();

        float percent = (obtainMarks/totalMarks)*100;
        System.out.println("Your percent is: "+percent+"%");

}
}