public class Moeda{
    private NomeMoeda nome; 

    public Moeda(NomeMoeda nome){
        this.nome=nome;
    }

    public NomeMoeda getNomeMoeda(){
        return nome;
    }

    public int getValorCentavos(){
        switch(nome){
            case getUmReal(): return 100;

        }
    }

}