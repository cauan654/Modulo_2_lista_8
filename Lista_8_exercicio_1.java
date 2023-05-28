class Heroi {
    private String nome;

    public Heroi(String nome) {
        this.nome = nome;
    }

}

class NomeRepetidoException extends Exception {
    public NomeRepetidoException(String mensagem) {
        super(mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        try {

            Heroi heroi1 = new Heroi("Marth");
            adicionarHeroi(heroi1);

            Heroi heroi2 = new Heroi("Chrom");
            adicionarHeroi(heroi2);

        } catch (NomeRepetidoException e) {
            System.out.println("Os heróis não podem ter nome repetido");
        }
    }

    public static void adicionarHeroi(Heroi heroi) throws NomeRepetidoException {

    }
}