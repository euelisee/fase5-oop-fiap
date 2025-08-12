package aula04;

public class Personagem {
        private String nome;
        private int vida;

        public Personagem(String nome, int vida) {
            this.nome = nome;
            this.vida = vida;
        }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public int getVida() { return vida; }
        public void setVida(int vida) { this.vida = vida; }

        public void atacar(Personagem alvo) {
            System.out.println(nome + " ataca " + alvo.getNome() + " e causa 1 de dano.");
            alvo.setVida(alvo.getVida() - 1);
        }

        public void imprimirStatus() {
            System.out.println("[" + nome + "] Vida: " + vida);
        }
}
