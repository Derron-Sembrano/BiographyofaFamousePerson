
package labexercise05;

import java.util.Scanner;
public class LabExercise05 {
    public static void main(String[] args) {
    String name;
    int birthyear;
    String nationality;
    String occupation;
    String achievement;
    int success;
    int awards;
    int passaway;
    int networth;
    String quotes;
    
    Scanner scanner;
    scanner = new Scanner(System.in);
    
    System.out.print("Enter the name of the famous person: ");
    name = scanner.nextLine();
    
    
    System.out.print("Enter their birthyear: ");
    birthyear = scanner.nextInt();
        
    System.out.print("Enter their nationality: ");
    nationality = scanner.nextLine();  
    scanner.nextLine();
    
   
    System.out.print("Enter their primary occupation: ");
    occupation = scanner.nextLine();
    
    
    System.out.print("Enter a notable achievement or contribution: ");
    achievement = scanner.nextLine();
    
    
    System.out.print("Enter the age they ahieved their first major success: ");
    success = scanner.nextInt();
    
    
    System.out.print("Enter the number of awards they have won: ");
    awards = scanner.nextInt();
    
    
    System.out.print("Enter the year they passed away: ");
    passaway = scanner.nextInt();
    
    
    System.out.print("Enter their networth in millions: ");
    networth = scanner.nextInt();
    
   
    System.out.print("Enter one of their famous quotes: ");
    quotes = scanner.nextLine();
  
    
    
    System.out.println("Name:" + name);
    System.out.println("Birth Year:" + birthyear);
    System.out.println("Nationality:" + nationality);
    System.out.println("Occupation:" + occupation);
    System.out.println("Notable:" + achievement);
    System.out.println("Age at First Major Sruccess:" + success);
    System.out.println("Awards Won:" + awards);
    System.out.println("Death Year:" + passaway);
    System.out.println("Net Worth:" + networth);
    System.out.println("Famous Quote:" + quotes);
    
   }
}
