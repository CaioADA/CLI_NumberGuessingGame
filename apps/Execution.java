package apps;

import java.util.InputMismatchException;

public class Execution {

    public void execGame() {
        Message mensagens = new Message();
        GameLogic logicaJogo = new GameLogic();

        try {
            mensagens.wecolmeMessage();
            logicaJogo.generateNumber();
            mensagens.dificultySelectMessage();
            logicaJogo.dificultySelect();
            mensagens.innitMessage();
            logicaJogo.verification();
            logicaJogo.playAgain();
        } catch (InputMismatchException e) {
            System.out.println("Por favor para selecionar use números.");
        }
    }
}
