package main.java.com.estoque.gestao;

public class Vendedor extends Endereco{
    
    private String nome_completo;
    private String dataNascimento;
    private String cpf;
    private Endereco endereco;


    public Vendedor(){super();}
    public Vendedor(String nome_completo, String dataNascimento, String cpf) {
        super();
        this.nome_completo = nome_completo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        
    }
    public String getNome_completo() {
        return nome_completo;
    }
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    

    

    

}
