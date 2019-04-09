package br.com.digitalhouse;

public class Clientes {

    private Integer numeroCliente;
    private String sobrenome;
    private String numeroRg;
    private Integer numeroCpf;

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer novoNumeroCliente) {
        numeroCliente = novoNumeroCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String novoSobrenome) {
        sobrenome = novoSobrenome;
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String novoNumeroRg) {
        numeroRg = novoNumeroRg;
    }

    public Integer getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(Integer novoNumeroCpf) {
        numeroCpf = novoNumeroCpf;
    }
}
