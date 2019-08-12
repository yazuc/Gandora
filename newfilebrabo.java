import java.util.ArrayList;

public class Cofre {
    private Moeda moeda;
    private ArrayList<Moeda> cofre = new ArrayList<Moeda>();

    public Cofre(Moeda moeda) {
        this.moeda = moeda;
    }

    public void insertCoin(Moeda m) {
        cofre.add(m);
    }

    public String moedas() {
        String nome = "";
        for (Moeda m : cofre) {
            nome += "Valor: " + m.getNomeMoeda() + ", " + m.getValorCentavos() + "\n";
        }
        return nome;
    }

    public Double reais() {
        double value = 0;
        for (Moeda m : cofre) {
            value += m.getValorReais();
        }
        return value;
    }

    public int centavos() {
        int value = 0;
        for (Moeda m : cofre) {
            value += m.getValorCentavos();
        }
        return value;
    }
}
