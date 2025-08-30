import java.util.*;

class NumOfGuess {
    int guessbyuser = 0;
    int randomnum;
    int n = 0;

    void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        guessbyuser = sc.nextInt();
        n++;
    }

    void Guesses() {
        if (guessbyuser == randomnum)
            System.out.println("You Guessed it Right!! " + " In " + n + " tries");
        else if (guessbyuser < randomnum)
            System.out.println("Wrong Guesss.Guess a higher number");
        else if (guessbyuser > randomnum)
            System.out.println("Wrong Guess. Guess a lower number");

    }

}

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        NumOfGuess num = new NumOfGuess();
        num.randomnum = rd.nextInt(100) + 1;
        do {
            num.userInput();
            num.Guesses();
        } while (num.guessbyuser != num.randomnum);
    }
}
