package aula06;

public class MainCarro {
    public static void main(String[] args) {
        // Criando um carro
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.velocidade = 0;

        // Usando métodos
        meuCarro.acelerar(30);
        meuCarro.acelerar(20);
        meuCarro.frear(15);
    }
}
