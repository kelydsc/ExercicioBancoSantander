package br.com.digitalhouse;

import java.util.Date;

public class Cheque {

    private Integer numeroCheque;
    private Double valorCheque;
    private String bancoEmissor;
    private Date dataDePagamento;

    public Integer getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(Integer numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public Double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(Double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public Date getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(Date dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }
}
