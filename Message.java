public class Message {

    public void wecolmeMessage() {
        System.out.println("Seja bem vindo ao jogo de adivinha!");
        System.out.println("");
        System.out.println("Pensarei em um número entre 1 e 100");
        System.out.println("");
    }

    public void innitMessage() {
        System.out.println("");
        System.out.println("Ok, tudo pronto, vamos começar");
    }

    public void dificultySelectMessage() {
        System.out.println("Nesse jogo existem 3 diferentes dificuldades: ");
        System.out.println("1. Fácil: (10 Tentativas)");
        System.out.println("2. Médio: (5 Tentativas)");
        System.out.println("3. Díficil: (3 Tentativas)");
        System.out.println("");
        System.out.print("Por favor escolha sua dificuldade: ");
    }

    public void victoryMessage() {
        System.out.println("Parábens você ganhou");
    }

    public void loseMessage(int numberOfPc) {
        System.out.println("Você perdeu com dicas NEWBA");
        System.out.println("O número correto era: " + numberOfPc);
    }

    public void newNumber() {
        System.out.print("Tente Novamente: ");
    }

    public void tryAgain() {
        System.out.println("");
        System.out.println("Você deseja tentar novamente?");
        System.out.println("[1]Sim, [2]Não");
        System.out.print("Escolha: ");
    }

    public void greaterThan(int numberGuessed) {
        System.out.println("");
        System.out.println("O número é maior que " + numberGuessed);
    }

    public void lessThan(int numberGuessed) {
        System.out.println("");
        System.out.println("O número é menor que " + numberGuessed);
    }

    public void endGame() {
        System.out.println("Fim do Jogo, Obrigado por jogar");
    }

    public void errorDificultSelect() {
        System.out.println("");
        System.out.println("Erro na seleção de dificuldade");
        System.out.println("Por favor, Tente novamente");
        System.out.println(
            "Lembrando que as opções são apenas [1]Fácil; [2]Médio e [3]Díficil"
        );
    }

    public void errorTryAgainSelect() {
        System.out.println("");
        System.out.println("Erro, Por favor tente novamente");
        System.out.println("Lembrando que as opções são [1]Sim, [2]Não");
    }

    public void takeGuess() {
        System.out.println("");
        System.out.print("Tente um número: ");
    }
}
