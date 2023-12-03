import java.util.Scanner;
import java.util.Random;
class Number_guessing{
    public static void main(String args[]){
        int guess,randomNumber,MAX=5,rounds=3;
        System.out.println("RULES FOR NUMBER GUESSING GAME : ");
        System.out.println("Number of levels is 3");
        System.out.println("Maximum attempts to guess in each round is 5");
        System.out.println("If you continuously complete all 3 levels without loosing then you win the game");
        System.out.println();
        System.out.println("Level 1 :");
        outerloop:
            for(int i=1;i<=rounds;i++){
                Random rand = new Random();
                randomNumber = rand.nextInt(100) + 1;
                System.out.println();
                for(int j=1;j<=MAX;j++){
                    System.out.println("Guess a number between 1 to 100");
                    Scanner input = new Scanner(System.in);
                    guess=input.nextInt();
                    if((guess==randomNumber) && (i==rounds)){
                        System.out.println("Great... your guess is correct!");
                        System.out.println("Level "+i+" completed");
                        System.out.println("You won the game!...");
                        break;
                    }
                    if((guess==randomNumber)&& (i<rounds)) {
                        System.out.println("Great... your guess is correct!");
                        System.out.println("Level "+i+" completed");
                        System.out.println();
                        System.out.println("Level "+(i+1)+" :");
                        break;
                    }
                    else if(guess<randomNumber){
                        System.out.println("your guess is low, try again");
                        System.out.println((MAX-j)+" attempts remaining");
                        if (j==MAX){
                            System.out.println();
                            System.out.println("Reached maximum number of attempts");
                            System.out.println("Game Over!...");
                            break outerloop;
                        }
                    }
                    else{
                        System.out.println("your guess is high, try again");
                        System.out.println((MAX-j)+" attempts remaining");
                        if (j==MAX){
                            System.out.println();
                            System.out.println("Reached maximum number of attempts");
                            System.out.println("Game Over!...");
                            break outerloop;
                        }
                    }
                }
        }
    }
}