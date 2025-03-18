public class Message {

    public void wecolmeMessage() {
        System.out.println("Seja bem vindo ao jogo de adivinha!");
        System.out.println("Pensarei em um número entre 1 e 100");
    }

    public void innitMessage() {
        System.out.println("Ok, tudo pronto, vamos começar");
    }

    public void dificultySelectMessage() {
        System.out.println("Por favor escolha sua dificuldade: ");
        System.out.println("1. Fácil: (10 Tentativas)");
        System.out.println("2. Médio: (5 Tentativas)");
        System.out.println("3. Díficil: (3 Tentativas)");
    }

    public void victoryMessage() {
        System.out.println("Parábens você ganhou");
    }

    public void loseMessage(int numberOfPc) {
        System.out.println("Você perdeu com dicas NEWBA");
        System.out.println("O número correto era: " + numberOfPc);
    }

    public void tryAgain() {
        System.out.println("Você deseja tentar novamente");
        System.out.println("[1]Sim, [2]Não");
    }

    public void greaterThan(int numberGuessed) {
        System.out.println("O número é maior que: " + numberGuessed);
    }

    public void lessThan(int numberGuessed) {
        System.out.println("O número é menor que: " + numberGuessed);
    }

    public void errorDificultSelect() {
        System.out.println("Erro na seleção de dificuldade");
        System.out.println("Por favor, Tente novamente");
        System.out.println(
            "Lembrando que as opções são apenas [1]Fácil; [2]Médio e [3]Díficil"
        );
    }
}
