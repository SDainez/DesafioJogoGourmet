import javax.swing.*;

public class Jogo {
    private Cardapio listaDePratos;
    private Boolean acertadoOuAdcionado = false;
    private Comunicacao mensagem;

    public Jogo() {
        iniciaJogo();
        mensagem = new Comunicacao();
    }

    public void jogar(){
        acertadoOuAdcionado = false;
        percorreListaDePratos(listaDePratos);
    }

    private void iniciaJogo(){
        this.listaDePratos = new Cardapio();
        adicionaPratosIniciais();
    }

    private void percorreListaDePratos(Cardapio pratos){
        int sim = 0;
        if(pratos.temSubCardapio){
            for (Cardapio prato:
                    pratos.getSubCardapio()) {
                if(!acertadoOuAdcionado) {
                    if (mensagem.perguntaPrato(prato.getNomeCategoria()) == sim) {
                        percorreListaDePratos(prato);
                    }
                }
            }
        }
        if(!acertadoOuAdcionado) {
            if (mensagem.perguntaPrato(pratos.getNomePrato()) == sim) {
                acertadoOuAdcionado = mensagem.mensagemAcertei();
            } else {
                Object[] novoPrato;
                novoPrato = mensagem.perguntaNovoPrato(pratos);
                adicionaNovoPrato((Cardapio) novoPrato[0], (Cardapio) novoPrato[1]);
            }
        }
    }

    private void adicionaNovoPrato(Cardapio prato, Cardapio novo){
        prato.adicionarSubCategoria(novo);
        acertadoOuAdcionado = true;
    }


    private void adicionaPratosIniciais(){
        listaDePratos.setNomePrato(new Prato("Bolo de Chocolate"));
        listaDePratos.adicionarSubCategoria("Massa", "Lasanha");
        }
}
