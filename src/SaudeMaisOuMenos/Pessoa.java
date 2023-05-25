package SaudeMaisOuMenos;

public abstract class Pessoa {
    public String nome;
    private String cpf;


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    

    
    public String setAndGetCpf(String cpf){
        this.cpf = cpf;
        return this.cpf;
    }
}
