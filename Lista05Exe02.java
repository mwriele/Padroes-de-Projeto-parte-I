// Sanduiche.java
public interface Sanduiche {
    void preparar();
}

// SanduicheDeCarne.java
public class SanduicheDeCarne implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando sanduíche de carne");
    }
}

// SanduicheDeFrango.java
public class SanduicheDeFrango implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando sanduíche de frango");
    }
}

// SanduicheVegano.java
public class SanduicheVegano implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando sanduíche vegano");
    }
}

// Hamburgueria.java
public abstract class Hamburgueria {
    public void pedirSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        sanduiche.preparar();
    }

    protected abstract Sanduiche criarSanduiche();
}

// HamburgueriaDeCarne.java
public class HamburgueriaDeCarne extends Hamburgueria {
    @Override
    protected Sanduiche criarSanduiche() {
        return new SanduicheDeCarne();
    }
}

// HamburgueriaDeFrango.java
public class HamburgueriaDeFrango extends Hamburgueria {
    @Override
    protected Sanduiche criarSanduiche() {
        return new SanduicheDeFrango();
    }
}

// HamburgueriaVegana.java
public class HamburgueriaVegana extends Hamburgueria {
    @Override
    protected Sanduiche criarSanduiche() {
        return new SanduicheVegano();
    }
}

// Lista05Exe02.java
public class Lista05Exe02 {
    public static void main(String[] args) {
        Hamburgueria hamburgueriaDeCarne = new HamburgueriaDeCarne();
        Hamburgueria hamburgueriaDeFrango = new HamburgueriaDeFrango();
        Hamburgueria hamburgueriaVegana = new HamburgueriaVegana();

        System.out.println("Pedidos de sanduíches:");
        hamburgueriaDeCarne.pedirSanduiche();
        hamburgueriaDeFrango.pedirSanduiche();
        hamburgueriaVegana.pedirSanduiche();
    }
}
