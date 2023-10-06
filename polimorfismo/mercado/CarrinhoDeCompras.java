package polimorfismo.mercado;

import java.util.ArrayList;

import polimorfismo.mercado.produtos.Produto;


public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public String finalizarCompra(){
        String notaFiscal = "";
        Double precoTotal = 0.0;

        for (Produto p : produtos){
            precoTotal += p.calcularValorTotal();
            notaFiscal += p.imprimirNotaFiscal() + "\n";
        }
        notaFiscal += "\n Preço total: " + precoTotal;
        return notaFiscal;
        
    }
    
}
