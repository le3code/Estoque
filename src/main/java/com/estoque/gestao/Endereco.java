package main.java.com.estoque.gestao;

public abstract  class Endereco {
    

    private String ruaAv;
    private String casa;
    private int numero;
    private int cep;
    private String apt;
    private String bairro;
    private String cidade;
    private String estado;


    public Endereco(){}
    public Endereco(String ruaAv, String casa, int numero, int cep, 
                    String apt, String bairro, String cidade,
                     String estado) {

        this.ruaAv = ruaAv;
        this.casa = casa;
        this.numero = numero;
        this.cep = cep;
        this.apt = apt;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;

    }

    public String getRuaAv() {
        return ruaAv;
    }
    
    public void setRuaAv(String ruaAv) {
        this.ruaAv = ruaAv;
    }

    public String getCasa() {
        return casa;
    }
    
    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    
}
