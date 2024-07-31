public class Pessoa{

    private String cpf;
    private String nome;
    private String senha;
    private Pet pet;

    public Pessoa(String cpf, String nome, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    void botaPetParaDormir(){
        this.pet.dormir();
    }

    void acordarPet(){
        this.pet.acordar();
    }

    void adotarPet(Pet pet){
        this.pet = pet;
    }

    void darAguaParaPet(){
        this.pet.beberAgua();
    }



    void levarPetParaFazerNecessidades(){
        this.pet.fazerNecessidades();
    }

    void limparPet(){
        this.pet.limpar();
    }

    String avaliarPet(){
        if ( this.pet != null){
            return pet.toString();
        }
        return "Sem pet";
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", pet=" + pet +
                '}';
    }
}
