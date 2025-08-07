package aula03;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;

        // Operador AND lógico (&&)
        // Só retorna true se ambos os lados forem true
        System.out.println("AND (&&):");
        System.out.println("true && true = " + (verdadeiro && verdadeiro)); // true
        System.out.println("true && false = " + (verdadeiro && falso));   // false
        System.out.println("false && false = " + (falso && falso));        // false

        // Operador OR lógico (||)
        // Retorna true se pelo menos um dos lados for true
        System.out.println("\nOR (||):");
        System.out.println("true || true = " + (verdadeiro || verdadeiro)); // true
        System.out.println("true || false = " + (verdadeiro || falso));    // true
        System.out.println("false || false = " + (falso || falso));         // false

        // Operador NOT lógico (!)
        // Inverte o valor booleano, true vira false, false vira true
        System.out.println("\nNOT (!):");
        System.out.println("!true = " + (!verdadeiro)); // false
        System.out.println("!false = " + (!falso));     // true

        // Operador XOR lógico (^)
        // Retorna true se os dois valores forem diferentes, false se forem iguais
        System.out.println("\nXOR (^):");
        System.out.println("true ^ true = " + (verdadeiro ^ verdadeiro)); // false
        System.out.println("true ^ false = " + (verdadeiro ^ falso));    // true
        System.out.println("false ^ false = " + (falso ^ falso));         // false

        // Dica extra: operadores lógicos curtos
        // && e || param só avaliam o segundo operando se necessário (short-circuit)
        System.out.println("\nExemplo short-circuit:");
        boolean resultado = falso && metodoQueDaErro();
        System.out.println("falso && metodoQueDaErro() = " + resultado);
    }

    public static boolean metodoQueDaErro() {
        // Se esse método for chamado, quer dizer que o short-circuit falhou
        throw new RuntimeException("Esse método não deveria ser chamado");
    }
}
