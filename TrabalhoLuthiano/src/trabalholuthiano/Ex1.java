/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholuthiano;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Ex1 {
    public static void main(String[] args) {
        String equipeL, equipeV;
        equipeL = JOptionPane.showInputDialog("Digite o nome da equipe local: ");
        equipeV = JOptionPane.showInputDialog("Digite o nome da equipe visitante");
        Partida p = new Partida(equipeL,equipeV);
        int golsL = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de gols da equipe Local"));
        int golsV = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de gols da equipe Visitante"));
        p.setGols(golsL, golsV);
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:\n"
                + "1 - Ver os pontos da Equipe Local\n"
                + "2 - Ver os pontos da Equipe Visitante\n"
                + "3 - Ver saldo de Gols da Equipe Local\n"
                + "4 - Ver saldo de gols da Equipe Visitante\n"
                + "5 - Ver quem foi a equipe vitoriosa(ou se houve empate)\n"
                + "0 - Sair"));
        while(op!=0){
           switch(op){
               case 1:
                   JOptionPane.showMessageDialog(null, p.numeroPontos(1));
                   break;
               case 2:
                   JOptionPane.showMessageDialog(null, p.numeroPontos(2));
                   break;
               case 3:
                   JOptionPane.showMessageDialog(null, p.saldoDeGols(1));
                   break;
               case 4:
                   JOptionPane.showMessageDialog(null, p.saldoDeGols(2));
                   break;
               case 5:
                   JOptionPane.showMessageDialog(null, p.obtemResultado());
                   break;
           }
           op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:\n"
                + "1 - Ver os pontos da Equipe Local\n"
                + "2 - Ver os pontos da Equipe Visitante\n"
                + "3 - Ver saldo de Gols da Equipe Local\n"
                + "4 - Ver saldo de gols da Equipe Visitante\n"
                + "5 - Ver quem foi a equipe vitoriosa(ou se houve empate)\n"
                + "0 - Sair"));
           
        }
        
    }
}
