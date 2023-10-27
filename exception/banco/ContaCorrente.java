package exception.banco;

public class ContaCorrente {

    private Double saldo;
    private String nomeTitular;
    private Integer numero;

    private ContaCorrente(){};

    public ContaCorrente(String nomeTitular, Integer numero){
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = 0.0;

    }

    public Double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" +
            " saldo='" + getSaldo() + "'" +
            ", nomeTitular='" + getNomeTitular() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }

}
