import java.util.Scanner;
import java.util.Random;
class Number_guessing{
    public static void main(String args[]){
        int guess,randomNumber,MAX=5;
        System.out.println();
        System.out.println("********************************** NUMBER GUESSING GAME **********************************");
        System.out.println();
        int a=1;
        outerloop:
            while(a==1){
                Random rand = new Random();
                randomNumber = rand.nextInt(100) + 1;
                System.out.println();
                for(int j=1;j<=MAX;j++){
                    System.out.print("Guess a number between 1 to 100 : ");
                    Scanner input = new Scanner(System.in);
                    guess=input.nextInt();
                    if(guess==randomNumber){
                        System.out.println("Great... your guess is correct!");
                        System.out.println("You won the game!...");
                        System.out.println();
                        System.out.print("Do you want to play again ? : if yes enter 1 or else enter 0 . ");
                        a=input.nextInt();
                        System.out.println();
                        if(a==1){
                            continue outerloop; 
                        }
                    }
                    else if(guess<randomNumber){
                        System.out.println("your guess is low, try again");
                        System.out.println((MAX-j)+" attempts remaining");
                        System.out.println();
                        if (j==MAX){
                            System.out.println();
                            System.out.println("Reached maximum number of attempts");
                            System.out.println("Game Over!...");
                            System.out.println();
                            System.out.print("Do you want to play again ? : if yes enter 1 or else enter 0 . ");
                            a=input.nextInt();
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println("your guess is high, try again");
                        System.out.println((MAX-j)+" attempts remaining");
                        System.out.println();
                        if (j==MAX){
                            System.out.println();
                            System.out.println("Reached maximum number of attempts");
                            System.out.println("Game Over!...");
                            System.out.println();
                            System.out.print("Do you want to play again ? : if yes enter 1 or else enter 0 . ");
                            a=input.nextInt();
                            System.out.println();
                        }
                    }
                }
        }
    }
}