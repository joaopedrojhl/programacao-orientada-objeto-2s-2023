package polimorfismo.mercado.produtos;

public class Alho extends Produto implements ProdutoGranel{

    private Double peso;

    public Alho(String nome, Double preco, Double peso){
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public Double calcularPrecoGranel() {
        return this.preco * this.peso;
    }

    @Override
    public Double calcularValorTotal() {
        return calcularPrecoGranel();
    }

    @Override
    public String imprimirNotaFiscal() {
        return this.nome + this.preco + " - Un. " + this.peso + "R$ " + calcularPrecoGranel();
    }

    
}
