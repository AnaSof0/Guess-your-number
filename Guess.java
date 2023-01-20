import java.util.Scanner;


public class Guess {
    //Program that uses divide and conquer to guess the number the user is thinking (from 0 - 100)
    public static void main (String [] args){
        int low_range= 0;
        int high_range = 100;
        int guess = 50;

        int a = 199/2;
        System.out.println(a);
    
        System.out.println("Hello! Welcome to the guess game, where you think of a number from 1-1000 and I'll guess it after asking you a few questions...");
        System.out.println("Let's get started, think of a number from " + low_range + " to " + high_range + " and write it down... don't forget it!");
        System.out.println("I'll ask if your number is equal to a number, higher (h) , or lower (l), write down yes if I guessed it, h if it's higer, or l if it's lower");
       

        System.out.println("Okay... is your number " + guess + " higher, or lower?");
        Scanner console = new Scanner (System.in);
        String answer = console.next(); //user's answer based on initial guess

        while(!check(answer)){
            if(guess == 99){
                guess =100; //special case: java rounds down with integer division, so will never guess 100 based on algorithm
                break;
            }
            if(answer.equals("h")){ //user is thinking of a higher number
                low_range = guess;
                guess = (low_range + high_range)/2;
            }
            else{
                System.out.println("hm..okay"); //user is thinking of a lower number
                high_range=guess;
                guess = (low_range + high_range)/2;
            }
            System.out.println("Okay... is your number " + guess + " higher, or lower?");
            answer = console.next();
        }
        console.close();
        System.out.println("Yay, so your number was "+ guess + "!");

    }

    public static boolean check(String input){ //checks if program has guessed correctly
        if(input.toLowerCase().equals("yes")  ){
            return true;
        }
        return false;
    }
    
}
