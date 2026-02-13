public class ContaBancaria {
    private double saldo;
    private double chequeLimiteEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;

        if(saldoInicial <= 500) {
            this.chequeLimiteEspecial = 50;
        } else {
            this.chequeLimiteEspecial = saldoInicial*0.5;
        }

        this.valorUsadoChequeEspecial = 0;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public double consultarLimiteChequeEspecial(){
        return this.chequeLimiteEspecial;
    }

    public double consultarValorUsadoLimite(){
        return this.valorUsadoChequeEspecial;
    }

    public boolean sacarValor(double valor){

        if (valor <= this.saldo) { 
            this.saldo -= valor;
            return true; 
        }
            double valorDisponivel = this.saldo + (this.chequeLimiteEspecial - this.valorUsadoChequeEspecial);
        
        if (valor <= valorDisponivel){
            double usadoDoCheque = valor - this.saldo;

            this.valorUsadoChequeEspecial += usadoDoCheque;

            this.saldo = 0;

            return true;
        } else {
            return false;
        }

    }

    public boolean depositarValor(double valor){
        if (valor <= 0) return false;

        double valorParaCheque = Math.min(valor, this.valorUsadoChequeEspecial);
        double taxa = 0.2 * valorParaCheque;

        this.valorUsadoChequeEspecial -= valorParaCheque;

        double restante = valor - (valorParaCheque + taxa);

        if (restante > 0) {
            this.saldo += restante;
    }
    return true;
}

    public boolean pagarBoleto(double valor){
        return sacarValor(valor);
    }
}