package main.java.com.estoque.gestao;

import java.util.function.ToDoubleBiFunction;

public class Clientes extends Endereco {
    
    private int id_cliente;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;
    private String data;


    public Clientes() {super();}
    public Clientes(int id_cliente, String nomeFantasia, String razaoSocial, 
                    String cnpj, Endereco endereco,
                    String data) {
        super();               
        this.id_cliente = id_cliente;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.data = data;

    }


    public int getId_cliente() {
        return id_cliente;
    }


    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }


    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }


    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Clientes [id_cliente=" + id_cliente + ", nomeFantasia=" + nomeFantasia + 
                ", razaoSocial=" + razaoSocial
                + ", cnpj=" + cnpj + ", endereco=" + endereco + ", data=" + data + "]";
    }
  
   
}
