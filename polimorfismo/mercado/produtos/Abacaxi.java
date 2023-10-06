package polimorfismo.mercado.produtos;

public class Abacaxi extends Produto implements ProdutoUnidade{

    private Integer unidades;
    
    public Abacaxi(String nome, Double preco, Integer unidades){
        super(nome, preco);
        this.unidades = unidades;
    }

    @Override
    public Double calcularPrecoUnidade() {
        return this.preco * this.unidades;
    }

    @Override
    public Double calcularValorTotal() {
        return this.preco * this.unidades;
    }

    @Override
    public String imprimirNotaFiscal() {
        return this.nome + this.preco + " - Un. " + this.unidades + "R$ " + calcularPrecoUnidade();
    }


    
    
}
