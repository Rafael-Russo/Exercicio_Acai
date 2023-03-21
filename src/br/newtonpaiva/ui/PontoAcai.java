package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Acai;

import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do Açaí: \n 1.300 \n 2.500 \n 3.700", "Informe o Pedido", JOptionPane.QUESTION_MESSAGE));
        boolean hasAcrescimo = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Vai ter acrescimo? ", "Tem Acrescimo?", JOptionPane.QUESTION_MESSAGE));

        Acai a1 = new Acai();

        switch (opcao){
            case 1:
               a1.tamanho = 300;
                break;
            case 2:
                a1.tamanho = 500;
                break;
            case 3:
                a1.tamanho = 700;
                break;
            default:
                throw new IllegalArgumentException("Tamanho Inválido");
        }
        a1.hasAcrescimo = hasAcrescimo;


        JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: " + a1.calcValor(), "Valor do Pedido", JOptionPane.INFORMATION_MESSAGE);

    }
}
