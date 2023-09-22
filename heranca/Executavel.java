package heranca;

import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;

public class Executavel {

    public static void main(String[] args) {


        Engenheiro eng1 = new Engenheiro("Jota", 685, 354, "385", "Projeto Marte");
        Gerente ger1 = new Gerente("Pedro", 123,652,45);
        Diretor dir1 = new Diretor("Lucas", 122, 68532, 5312);
        System.out.println(ger1);
        System.out.println(eng1);
        System.out.println(dir1);

    }
    
}
