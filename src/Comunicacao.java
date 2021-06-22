import javax.swing.*;

public class Comunicacao {

    public int perguntaPrato(String nome){
        Object[] opcoes = {"Sim", "Não"};
        int resposta;
        resposta =  JOptionPane.showOptionDialog(null,
                "O prato que você pensou é " + nome + "?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
        return resposta;
    }

    public Object[] perguntaNovoPrato(Cardapio prato){
        Object[] novoPratoASerAdicionado = new Object[2];
        String novoPrato = JOptionPane.showInputDialog(null,
                "Qual prato você pensou?","Desisto", JOptionPane.QUESTION_MESSAGE);
        String categoria = JOptionPane.showInputDialog(novoPrato + " é ______ mas " + prato.getNomePrato() + " não.");
        novoPratoASerAdicionado[0] = prato;
        novoPratoASerAdicionado[1] = new Cardapio(categoria, novoPrato);
        return novoPratoASerAdicionado;
    }

    public boolean mensagemAcertei(){
        JOptionPane.showMessageDialog(null, "Acertei de novo!",
                "Jogo Gourmet",JOptionPane.PLAIN_MESSAGE);
        return true;
    }

    public int penseEmUmPrato(){
        Object[] option = {"OK"};
        return JOptionPane.showOptionDialog(null, "Pense em um prato que gosta",
                "Jogo Gourmet", JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, option, null);
    }


}
