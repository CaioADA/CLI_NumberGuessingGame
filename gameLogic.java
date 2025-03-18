import java.util.Random;
import java.util.Scanner;

public class gameLogic {

    execution executarJogo = new execution();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Message mensagens = new Message();

    int userGuess;
    int tryCounter;
    int numberOfGuesses;
    int randomNumber;

    public int generateNumber() {
        randomNumber = random.nextInt(1, 100);
        return randomNumber;
    }

    public int userGuesses() {
        mensagens.takeGuess();
        this.userGuess = scanner.nextInt();
        return this.userGuess;
    }

    public int dificultySelect() {
        int userDificulty = scanner.nextInt();
        if (userDificulty == 1) {
            //Easy dificult
            numberOfGuesses = 10;
            return numberOfGuesses;
        } else if (userDificulty == 2) {
            //Medium dificult
            numberOfGuesses = 5;
            return numberOfGuesses;
        } else if (userDificulty == 3) {
            //Hard dificult
            numberOfGuesses = 3;
            return numberOfGuesses;
        } else {
            mensagens.errorDificultSelect();
            return dificultySelect();
        }
    }

    public boolean guessesCompare() {
        if (userGuess == randomNumber) {
            mensagens.victoryMessage();
            return true;
        } else if (userGuess < randomNumber) {
            mensagens.greaterThan(userGuess);
            return false;
        } else if (userGuess > randomNumber) {
            mensagens.lessThan(userGuess);
            return false;
        }
        return false;
    }

    public void verification() {
        do {
            userGuesses();
            if (guessesCompare() == true) {
                break;
            } else {
                tryCounter++;
                continue;
            }
        } while (tryCounter != numberOfGuesses);
    }

    public void playAgain() {
        mensagens.tryAgain();
        int decisao = scanner.nextInt();
        if (decisao == 1) {
            executarJogo.execGame();
        } else if (decisao == 2) {
            mensagens.endGame();
        } else {
            mensagens.errorTryAgainSelect();
            playAgain();
        }
    }
}
