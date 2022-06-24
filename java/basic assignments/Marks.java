package BasicAssignments;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects");
        float Science=sc.nextFloat();
        float Maths=sc.nextFloat();
        float Social=sc.nextFloat();
        float Hindi=sc.nextFloat();
        float English=sc.nextFloat();

        if(Science>60)
        System.out.println("Passed");
        else if(Maths>60)
        System.out.println("Passed");
        else if(Social>60)
        System.out.println("Passed");
        else if(Hindi>60)
        System.out.println("Passed");
        else if(English>60)
        System.out.println("Passed");

    }
    
}
