package apps;
public class execution {

    public void execGame() {
        message mensagens = new message();
        gameLogic logicaJogo = new gameLogic();

        mensagens.wecolmeMessage();
        logicaJogo.generateNumber();
        mensagens.dificultySelectMessage();
        logicaJogo.dificultySelect();
        mensagens.innitMessage();
        logicaJogo.verification();
        logicaJogo.playAgain();
    }
}
