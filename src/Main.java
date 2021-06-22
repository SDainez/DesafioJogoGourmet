
public class Main {
    public static void main(String[] args) {
        Jogo jogoGourmet = new Jogo();
        Comunicacao mensagem = new Comunicacao();

        int resposta;
         do {
            resposta = mensagem.penseEmUmPrato();

            if (resposta == 0) {
                Thread jogo = new Thread(jogoGourmet);
                jogo.start();
            }
        }while (resposta == 0);

    }
}
