public class Pet {

    private static int geradorCodigo = 0;
    private int codigo;
    private String nome;
    private boolean vivo = true;
    private boolean acordado = true;
    private int sede;
    private int fome;
    private int energia;
    private int diversao;
    private int higiene;
    private int vontadeBanheiro;

    public Pet(String nome) {
        this.codigo = geradorCodigo++;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    void beberAgua(){
        this.sede += 50;
        this.vontadeBanheiro -= 25;
        if ( this.vontadeBanheiro == 0){
            this.higiene = 0;
            this.vontadeBanheiro = 100;
        }
    }

    void brincar (Brincadeira brincadeira){
        this.energia -= brincadeira.getCansaco();
        this.fome -= brincadeira.getFome();
        this.sede -= brincadeira.getSede();
        this.higiene -= brincadeira.getSujeira();
        if (this.energia == 0 || this.fome == 0 || this.sede == 0 || this.higiene == 0){
            this.vivo = false;
        }
    }

    void comer(Alimento alimento){
        this.fome += alimento.getNutricao();
        this.vontadeBanheiro -= alimento.getNutricao()/2;
        if(vontadeBanheiro <= 0 ){
            this.higiene = 0;
            this.vontadeBanheiro = 100;
        }
    }



    void dormir(){
        this.energia += 25;
    }
    void acordar(){
        this.energia += 25;
    }

    void limpar(){
        this.higiene = 100;
    }

    void fazerNecessidades(){
        this.vontadeBanheiro = 100;
        this.higiene -= 25;
    }

    void morrer(){
        if( this.sede == 0 || this.fome == 0 || this.energia == 0){
            this.vivo = false;
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", vivo=" + vivo +
                ", acordado=" + acordado +
                ", sede=" + sede +
                ", fome=" + fome +
                ", energia=" + energia +
                ", diversao=" + diversao +
                ", higiene=" + higiene +
                ", vontadeBanheiro=" + vontadeBanheiro +
                '}';
    }

}
