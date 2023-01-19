import java.util.Scanner;


public class Guess {
    public static void main (String [] args){
        System.out.println("Hello! Welcome to the guess game, where you think of a number from 1-1000 and I'll guess it after asking you a few questions...");
        System.out.println("Let's get started, think of a number from 1 to 1000 and write it down... don't forget it!");
        System.out.println("I'll ask if your number is equal (e) to a number, higher (h) , or lower (l), write down e, h, or l for each corresponding answer");
        int number = 500;
        System.out.println("Okay... is your number " + number + " higher, or lower?");
        Scanner console = new scanner (System.in);
        String answer = console.next();
        


    }
    public static boolean check(String input){
        if(input.toLowerCase().equals("yes")  ){
            return true;
        }
        return false;
    }
    
}`
