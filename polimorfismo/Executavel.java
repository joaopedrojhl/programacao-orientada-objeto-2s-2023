package polimorfismo;

import polimorfismo.mercado.CarrinhoDeCompras;
import polimorfismo.mercado.produtos.Abacaxi;
import polimorfismo.mercado.produtos.Alho;

public class Executavel {
    
    public static void main(String[] args) {


    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    Abacaxi a1 = new Abacaxi("Abacaxi comum", 5.99, 2);
    Abacaxi a2 = new Abacaxi("Abacaxi premium", 8.99, 3);
    Alho a3 = new Alho("ALho", 12.99, 0.5);
   
    carrinho.adicionarProduto(a1);
    carrinho.adicionarProduto(a2);
    carrinho.adicionarProduto(a3);

    System.out.println(carrinho.finalizarCompra());
    }

}
