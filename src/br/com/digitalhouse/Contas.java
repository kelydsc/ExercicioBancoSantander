package br.com.digitalhouse;

public abstract class Contas {

    protected Clientes clientes;
    protected Double saldo;

    //construtor
    public Contas(){

    }

    //construtor especifico
    public Contas(Clientes novoCliente, Double novoSaldo){
        clientes = novoCliente;
        saldo = novoSaldo;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes novoCliente) {
        clientes = novoCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double novoSaldo) {
        saldo = novoSaldo;
    }

    public void fazerDeposito(Double valorDeposito){

        saldo = saldo + valorDeposito;

    }

    public Boolean sacarDinheiro(Double valorSaque){

        if(saldo > 0){
            saldo = saldo - valorSaque;
            return true;
        }else{
            return false;
        }
    }

    public Double consultarSaldo(){
        return saldo;
    }
}
