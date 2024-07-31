import java.util.ArrayList;

public class Banco {

    static ArrayList<Alimento> alimentos = new ArrayList<>();
    static ArrayList<Pet> pets = new ArrayList<>();
    static ArrayList<Brincadeira> brincadeiras = new ArrayList<>();
    static ArrayList<Pessoa> pessoas = new ArrayList<>();

    void cadastrarPet(Pet pet){
        this.pets.add(pet);
    }

    void cadastrarPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    void removerPet(Pet pet){
        this.pets.remove(pet);
    }

    void removerPessoa(Pessoa pessoa){
        this.pessoas.remove(pessoa);
    }

    public Alimento procurarAlimento(int codigo){
        for ( Alimento alimento : Banco.alimentos){
            if (alimento.getCodigo() == codigo){
                return alimento;
            }
        }
        return null;
    }
    public Brincadeira procurarBrincadeira(int codigo){
        for ( Brincadeira brincadeira : Banco.brincadeiras){
            if (brincadeira.getCodigo() == codigo){
                return brincadeira;
            }
        }
        return null;
    }
    public Pet procurarPet(int codigo){
        for ( Pet pet : Banco.pets){
            if (pet.getCodigo() == codigo){
                return pet;
            }
        }
        return null;
    }

    public static ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public static ArrayList<Pet> getPets() {
        return pets;
    }

    public static ArrayList<Brincadeira> getBrincadeiras() {
        return brincadeiras;
    }

    public Pessoa login(String cpf, String senha){
        for (Pessoa pessoa : Banco.pessoas){
            if (pessoa.getCpf() == cpf && pessoa.getSenha() == senha){
                return pessoa;
            }
        }
        return null;
    }
}
