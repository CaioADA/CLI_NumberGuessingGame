public class Main {

    public static void main(String[] args) {
        Message mensagens = new Message();
        gameLogic logicaJogo = new gameLogic();

        mensagens.wecolmeMessage();
        logicaJogo.generateNumber();
        mensagens.dificultySelectMessage();
        logicaJogo.dificultySelect();
        mensagens.innitMessage();
        logicaJogo.verification();
    }
}
