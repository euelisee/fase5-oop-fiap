package aula04;

public class MainPersonagem {
        public static void main(String[] args) {
            Personagem p1 = new Personagem("Guerreiro", 10);
            PersonagemMagico p2 = new PersonagemMagico("Maga", 8, 5);

            p1.imprimirStatus();
            p2.imprimirStatus();

            System.out.println("\n-- Turno 1 --");
            p1.atacar(p2);
            p2.imprimirStatus();

            System.out.println("\n-- Turno 2: magia --");
            p2.lancarFeitico(p1);
            p1.imprimirStatus();

            System.out.println("\n-- Polimorfismo: referência como Personagem --");
            Personagem ref = p2; // PersonagemMagico referenciado por Personagem
            ref.imprimirStatus(); // chama o método sobrescrito em PersonagemMagico
        }
}
