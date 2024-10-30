// Movimento.java
public interface Movimento {
    void executarMovimento();
}

// MovimentoEmL.java
public class MovimentoEmL implements Movimento {
    @Override
    public void executarMovimento() {
        System.out.println("Movimento em L");
    }
}

// MovimentoParaFrente.java
public class MovimentoParaFrente implements Movimento {
    @Override
    public void executarMovimento() {
        System.out.println("Movimento para frente");
    }
}

// MovimentoDiagonal.java
public class MovimentoDiagonal implements Movimento {
    @Override
    public void executarMovimento() {
        System.out.println("Movimento diagonal");
    }
}

// Peca.java
public abstract class Peca {
    protected Movimento movimento;

    public Peca(Movimento movimento) {
        this.movimento = movimento;
    }

    public void mover() {
        movimento.executarMovimento();
    }

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }
}

// Cavalo.java
public class Cavalo extends Peca {
    public Cavalo() {
        super(new MovimentoEmL());
    }
}

// Peao.java
public class Peao extends Peca {
    public Peao() {
        super(new MovimentoParaFrente());
    }
}

// Bispo.java
public class Bispo extends Peca {
    public Bispo() {
        super(new MovimentoDiagonal());
    }
}

// Lista05Exe01.java
public class Lista05Exe01 {
    public static void main(String[] args) {
        Peca cavalo = new Cavalo();
        Peca peao = new Peao();
        Peca bispo = new Bispo();

        System.out.println("Movimentos das peças:");
        cavalo.mover();
        peao.mover();
        bispo.mover();

        // Alterando o movimento do Peão
        System.out.println("\nAlterando o movimento do Peão:");
        peao.setMovimento(new MovimentoDiagonal());
        peao.mover();
    }
}
