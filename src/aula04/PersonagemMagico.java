package aula04;

public class PersonagemMagico extends Personagem{
        private int mana;

        public PersonagemMagico(String nome, int vida, int mana) {
            super(nome, vida);
            this.mana = mana;
        }

        public int getMana() { return mana; }
        public void setMana(int mana) { this.mana = mana; }

        public void lancarFeitico(Personagem alvo) {
            if (mana >= 2) {
                System.out.println(getNome() + " lança um feitiço em " + alvo.getNome() + " causando 3 de dano.");
                alvo.setVida(alvo.getVida() - 3);
                mana -= 2;
            } else {
                System.out.println(getNome() + " não tem mana suficiente.");
            }
        }

        @Override
        public void imprimirStatus() {
            System.out.println("[" + getNome() + "] Vida: " + getVida() + " | Mana: " + mana);
        }
}
