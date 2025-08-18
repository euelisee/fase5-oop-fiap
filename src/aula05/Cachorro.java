package aula05;

import javax.xml.transform.Source;

public class Cachorro {
    String nome;
    int idade;

    void latir() {
        System.out.println(nome + "está latindo");
    }

    void aniversario() {
        System.out.println(nome + "fez aniversário! Agora tem: " + idade + "anos");
    }
}
