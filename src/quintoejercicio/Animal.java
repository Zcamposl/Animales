package quintoejercicio;

abstract class Animal {
    protected String sonido;
    protected String alimentacion;
    protected String habitat;
    protected String nombreCientifico;

    public Animal(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        this.sonido = sonido;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    public abstract void mostrarDatos();
}

class Canido extends Animal {
    public Canido(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        super(sonido, alimentacion, habitat, nombreCientifico);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(nombreCientifico);
        System.out.println("Sonido: " + sonido);
        System.out.println("Alimentos: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        System.out.println();
    }
}

class Felino extends Animal {
    public Felino(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        super(sonido, alimentacion, habitat, nombreCientifico);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(nombreCientifico);
        System.out.println("Sonido: " + sonido);
        System.out.println("Alimentos: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        System.out.println();
    }
}

class Perro extends Canido {
    public Perro() {
        super("Ladrido", "Carnívoro", "Doméstico", "Canis lupus familiaris");
    }
}

class Lobo extends Canido {
    public Lobo() {
        super("Aullido", "Carnívoro", "Bosque", "Canis lupus");
    }
}

class Leon extends Felino {
    public Leon() {
        super("Rugido", "Carnívoro", "Pradera", "Panthera leo");
    }
}

class Gato extends Felino {
    public Gato() {
        super("Maullido", "Ratones", "Doméstico", "Felis silvestris catus");
    }
    
}
