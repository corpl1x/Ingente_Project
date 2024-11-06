package ingente_biography_of_a_famous_guy;
import java.util.Scanner;
public class Ingente_Biography_of_a_Famous_Guy 
{
 public static void main(String[] args) 
    {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter a Famous Person's Name: ");
     String name = scanner.nextLine();
     System.out.println(name + " is a Canadian and American actor, producer, and businessman.");
     System.out.println("--------------------------------------");
     
     System.out.println("More Information:"); 
     System.out.println("(Age, Height, Weight, Birthdate, Place of Birth)");
     String age = scanner.nextLine();
     System.out.println(age + " = 48");
     System.out.println("--------------------------------------");

     System.out.println("More Information:"); 
     System.out.println("(Height, Weight, Birthdate, Place of Birth)");
     String height = scanner.nextLine();
     System.out.println(height + " = 188cm");
     System.out.println("--------------------------------------");
     
     System.out.println("More Information:"); 
     System.out.println("(Weight, Birthdate, Place of Birth)");
     String weight = scanner.nextLine();
     System.out.println(weight + " = 85kg");
     System.out.println("--------------------------------------");
     
     System.out.println("More Information:"); 
     System.out.println("(Birthdate, Place of Birth)");
     String birthdate = scanner.nextLine();
     System.out.println(birthdate + " = October 23, 1976");
     System.out.println("--------------------------------------");
     
     System.out.println("More Information:"); 
     System.out.println("(Place of Birth)");
     String birthplace = scanner.nextLine();
     System.out.println(birthplace + " = Vancouver, Canada");
     System.out.println("--------------------------------------");
    }
    
}
