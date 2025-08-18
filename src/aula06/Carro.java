package aula06;

public class Carro {
    String modelo;
    int velocidade;

    // Método para acelerar
    public void acelerar(int valor) {
        velocidade = velocidade + valor;
        System.out.println(modelo + " acelerou! Velocidade atual: " + velocidade + " km/h");
    }

    // Método para frear
    public void frear(int valor) {
        velocidade -= valor;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println(modelo + " freou! Velocidade atual: " + velocidade + " km/h");
    }

    // += e -= são operadores de atribuição composta. Ele visa simplificar o código atribuindo o valor a direita e trazendo o resultado a variavel.
    //ex: x = x+y é igual a x += y | x = x-y é igual a x -= y
}

