import java.util.ArrayList;

public class Cardapio {
    private final String nomeCategoria;
    private Prato prato;
    private ArrayList<Cardapio> subCardapio;
    boolean temSubCardapio;

    public Cardapio(){
        this.nomeCategoria = null;
        this.prato = new Prato(null);
    }

    public Cardapio(String nomeCategoria, String nomePrato) {
        this.nomeCategoria = nomeCategoria;
        this.prato = new Prato(nomePrato);
    }

    public void novaSubCategoria(){
        this.subCardapio = new ArrayList<>();
        this.temSubCardapio = true;
    }

    public void adicionarSubCategoria(Cardapio novo){
        verificaSubCategoria();
        this.subCardapio.add(novo);
    }

    public void adicionarSubCategoria(String subCategoria, String nomePrato){
        verificaSubCategoria();
        this.subCardapio.add(new Cardapio(subCategoria, nomePrato));
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public String getNomePrato() {
        return prato.getPrato();
    }

    public void setNomePrato(Prato nomePrato) {
        this.prato = nomePrato;
    }

    public ArrayList<Cardapio> getSubCardapio() {
        return subCardapio;
    }

    private void verificaSubCategoria(){
        if (!temSubCardapio)
            novaSubCategoria();
    }
}
