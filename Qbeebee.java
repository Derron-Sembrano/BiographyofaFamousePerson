/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qbeebee;
import java.util.*;

public class Qbeebee {
    public static void main(String[] args) {
        
        int score = 0;
        Scanner sc = new Scanner(System.in);
        String end;
        do{
        //Q1
            System.out.println("**** QUIZ ****");
        System.out.println("1.) Who sang the title song for the latest Bond film, No Time to Die?");
        System.out.println("A. Adele");
        System.out.println("B. Sam Smith");
        System.out.println("C. Billie Eillish");
        System.out.println("D. Lady Gaga");
        System.out.print("Enter your answer: ");
        String q1 = sc.nextLine();
        if (q1.equals("c")){
            System.out.println("Correct Answer!");
            score++;
            System.out.println("Score: " + score);
        }else{
            System.out.println("Incorrect Answer!");
            System.out.println("Score: " + score);
            System.out.println("");
        }
        //Q2
        System.out.println("2.) Which of the following is NOT a fruit?");
        System.out.println("A. Rhubarb");
        System.out.println("B. Tomatoes");
        System.out.println("C. Avocados");
        System.out.println("D. Olives");
        System.out.print("Enter your answer: ");
        String q2 = sc.nextLine();
        if (q2.equals("a")){
            System.out.println("Correct Answer!");
            score++;
            System.out.println("Score: " + score);
        }else{
            System.out.println("Incorrect Answer!");
            System.out.println("Score: " + score);
            System.out.println("");
        }
        //Q3
        System.out.println("3.) Where was the first example of paper money used?");
        System.out.println("A. China");
        System.out.println("B. Turkey");
        System.out.println("C. Greece");
        System.out.println("D. Philippines");
        System.out.print("Enter your answer: ");
        String q3 = sc.nextLine();
        if (q3.equals("a")){
            System.out.println("Correct Answer!");
            score++;
            System.out.println("Score: " + score);
        }else{
            System.out.println("Incorrect Answer!");
            System.out.println("Score: " + score);
            System.out.println("");
        }
         //Q4
        System.out.println("4.) Which of the following languages has the longest alphabet?");
        System.out.println("A. Greek");
        System.out.println("B. Russian");
        System.out.println("C. Arabic");
        System.out.println("D. Japanese");
        System.out.print("Enter your answer: ");
        String q4 = sc.nextLine();
        if (q4.equals("b")){
            System.out.println("Correct Answer!");
            score++;
            System.out.println("Score: " + score);
        }else{
            System.out.println("Incorrect Answer!");
            System.out.println("Score: " + score);
            System.out.println("");
        }
         //Q5
        System.out.println("5.) Which app has the most total users?");
        System.out.println("A. Tiktok");
        System.out.println("B. Snapchat");
        System.out.println("C. Instagram");
        System.out.println("D. X(Twitter)");
        System.out.print("Enter your answer: ");
        String q5 = sc.nextLine();
        if (q5.equalsIgnoreCase("c")){
            System.out.println("Correct Answer!");
            score++;
            System.out.println("Score: " + score);
        }else{
            System.out.println("Incorrect Answer!");
            System.out.println("Score: " + score);
        }
        //TOTAL
        System.out.println("Final Score: " + score + "/5");
            System.out.println("--------------------");
            System.out.println("Do you want to continue? y/n");
            end = sc.next();
            sc.nextLine();
        }while(end.equalsIgnoreCase("y"));{
        System.out.println("Thank you for taking the quiz!");
        
    }
    }
    
}
