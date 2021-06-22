
public class Main {
    public static void main(String[] args) {
        Jogo jogoGourmet = new Jogo();
        Comunicacao mensagem = new Comunicacao();

        int resposta;
         do {
            resposta = mensagem.penseEmUmPrato();

            if (resposta == 0) {
                jogoGourmet.jogar();
            }
        }while (resposta == 0);

    }
}
