import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int totalScore = 0;
    String playAgain = "yes";

    do{
    int myNumber = (int)(Math.random()*100)+1; // Generate random number within a range 1-100
    int userNumber = 0;
    int attempts = 0;
    int NumberOfAttempts = 10;
     int roundScore;
    
    System.out.println("Game Started!");
    do {
        System.out.print("Guess a number(1-100): "); // Ask user to guess a number
        userNumber = sc.nextInt();
        attempts ++;
        if(userNumber == myNumber ){
            System.out.println("It is the correct number"); // If the guess is correct
             roundScore = (NumberOfAttempts - attempts + 1);
              totalScore = totalScore + roundScore;
            System.out.println("You earned " +roundScore+ " out of 10 in this round");

            break;
        }
        else if(userNumber > myNumber){
            System.out.println("The guess is too large"); // If the guess is large 
        }
        else{
            System.out.println("The guess is too small"); // If the guess is small
        }
        
    if(attempts < NumberOfAttempts){
        System.out.println("The remaining chances are " +(NumberOfAttempts - attempts)); // Limit the number of attempts
    
}
    }
        while( attempts < NumberOfAttempts  ) ;
        if(userNumber != myNumber ){
         System.out.println("Game over.The number was :"); // Print the actual number
         System.out.println(myNumber);
    
        }
         System.out.print("Do you want to play again ?(yes/no): ");
         playAgain = sc.next();
        
      
} 
    while(playAgain.equalsIgnoreCase("yes"));
    System.out.println("Final score: " +totalScore);
    System.out.println("Thanks for playing");
    sc.close();

    }
}




















    

    
  



    

