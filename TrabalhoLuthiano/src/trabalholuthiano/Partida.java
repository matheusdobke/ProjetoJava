/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholuthiano;

/**
 *
 * @author Matheus D.
 */
public class Partida {

    /*
     * Atributos da Classe Partida
     */
    private String nomeTimeLocal;
    private String nomeTimeVisitante;
    private int golsTimeLocal;
    private int golsTimeVisitante;
    private boolean realizada;

    /*
     * Construtor que Recebe como argumento o nome dos dois times que
     * participaram da partida. Deve ser considerado que a partida ainda não foi
     * realizada.
     */
    public Partida(String tL, String tV) {
        this.nomeTimeLocal = tL;
        this.nomeTimeVisitante = tV;
        this.realizada = false;
    }

    /*
     * Metodos getter e setter do atributos da classe.
     */
    public int getGolsTimeLocal() {
        return golsTimeLocal;
    }

    public void setGolsTimeLocal(int golsTimeLocal) {
        this.golsTimeLocal = golsTimeLocal;
    }

    public int getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void setGolsTimeVisitante(int golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }

    public String getNomeTimeLocal() {
        return nomeTimeLocal;
    }

    public void setNomeTimeLocal(String nomeTimeLocal) {
        this.nomeTimeLocal = nomeTimeLocal;
    }

    public String getNomeTimeVisitante() {
        return nomeTimeVisitante;
    }

    public void setNomeTimeVisitante(String nomeTimeVisitante) {
        this.nomeTimeVisitante = nomeTimeVisitante;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    /*
     * Metodos da classe Partida
     */
    public void setGols(int gL, int gV) {
        this.golsTimeLocal = gL;
        this.golsTimeVisitante = gV;
        this.realizada = true;
    }

    public String exibePartida() {
        if (this.realizada == true) {
            return ""+this.nomeTimeLocal + " " + this.golsTimeLocal + " x " + golsTimeVisitante + " " + nomeTimeVisitante;
        } else {
           return ""+this.nomeTimeLocal + " x " + this.nomeTimeVisitante;
        }
    }

    public String obtemResultado() {
        if (this.realizada == true) {
            if (golsTimeLocal == golsTimeVisitante) {
                return "Empate";
            } else {
                if (golsTimeLocal > golsTimeVisitante) {
                    return this.nomeTimeLocal;
                } else {
                    return this.nomeTimeVisitante;
                }
            }
        } else {
            return "Partida não realizada";
        }
    }

    public int numeroPontos(int x) {
        int nPontos = 0;
        if (this.realizada == true) {
            switch (x) {
                case 1:
                    if (obtemResultado().equals(this.nomeTimeLocal)) {
                        nPontos = 3;
                    } else {
                        if ("Empate".equals(obtemResultado())) {
                            nPontos = 1;
                        } else {
                            if (obtemResultado().equals(this.nomeTimeVisitante)) {
                                nPontos = 0;
                            }
                        }
                    }
                    break;
                case 2:
                    if (obtemResultado().equals(this.nomeTimeVisitante)) {
                        nPontos = 3;
                    } else {
                        if ("Empate".equals(obtemResultado())) {
                            nPontos = 1;
                        } else {
                            if (obtemResultado().equals(this.nomeTimeLocal)) {
                                nPontos = 0;
                            }
                        }
                    }
                    break;
            }
            return nPontos;
        } else {
            return -1;
        }
    }
    
    
    public int saldoDeGols(int x){
        int saldo = 0;
        if(this.realizada==true){
            switch(x){
                case 1:
                    saldo = this.golsTimeLocal-this.golsTimeVisitante;
                    break;
                case 2:
                    saldo = this.golsTimeVisitante-this.golsTimeLocal;
                    break;
            }
            return saldo;
        }else{
            return 1000;
        }
    }
}
