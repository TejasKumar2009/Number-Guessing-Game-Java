import java.util.Scanner;

class Game {
    int random_int;
    Game(){
        int min = 1;
        int max = 100;
        random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
    }
    public static int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num_input = sc.nextInt();
        return num_input;
    }
    public static boolean isCorrectNumber(int user_number, int comp_number, int noOfGuesses){
        if (user_number == comp_number){
            return true;
        }
        else {
            return false;
        }
    }
}

public class main{
    public static void main(String[] args) {
        int noOfGuesses = 1;
        Game game = new Game();
        int comp_number = game.random_int;

        while (true){
            int user_number = game.takeUserInput();
            boolean output = game.isCorrectNumber(user_number, comp_number, noOfGuesses);
            if (output){
                System.out.println("Yehh!! You Guessed it right in " + noOfGuesses + " No. Of Guesses, the number is " + user_number);
                break;
            }
            else{
                if (user_number>comp_number){
                    System.out.println("Nope You Guessed it Wrong! Your Number is LARGER than the Actual Number !");
            } else {
                    System.out.println("Nope You Guessed it Wrong! Your Number is smaller than the Actual Number !");
            }
            }
            noOfGuesses ++;
        }
    }
}
