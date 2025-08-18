package aula05;

public class MainAnimais {
    public static void main(String[] args) {
        // Aqui estou criando o objeto
        Cachorro dog1 = new Cachorro();
        dog1.nome = "Netuno ";
        dog1.idade = 4;

        // Usando os métodos
        dog1.latir();
        dog1.aniversario();

        // outro objeto
        Cachorro dog2 = new Cachorro();
        dog2.nome = "Fred ";
        dog2.idade = 7;

        //chamando o método de novo
        dog2.latir();
    }
}
