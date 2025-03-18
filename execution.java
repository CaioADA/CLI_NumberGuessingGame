public class execution {

    public void execGame() {
        Message mensagens = new Message();
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
