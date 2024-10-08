package planetas;

public class Planetas {

    private String nombre;
    private int satelites;
    private double masa;
    private int distanciaalsol;
    private double volumen;
    private int diametro;
    private TipodelPlaneta tipo;
    private boolean esObservable;

    enum TipodelPlaneta {
        GASEOSO, ENANO, TERRESTRE
    }

    public Planetas(String nombre) {
        this.nombre = nombre;
        this.iniciarplaneta();
    }

    private void iniciarplaneta() {
        switch (this.nombre.toLowerCase()) {
            case "tierra":
                this.satelites = 1;
                this.masa = 5.97E24;
                this.distanciaalsol = 228;
                this.volumen = 1.08332E12;
                this.diametro = 6779;
                this.tipo = TipodelPlaneta.TERRESTRE;
                this.esObservable = true;
                break;
            case "mercurio":
                this.satelites = 0;
                this.masa = 3.302E26;
                this.distanciaalsol = 58;
                this.volumen = 6.083E10;
                this.diametro = 4879;
                this.tipo = TipodelPlaneta.TERRESTRE;
                this.esObservable = true;
                break;

        }
    }

    public void brindarinformacion() {
        if (nombre != null) {
            System.out.println("El nombre del planeta es:" + nombre);
        }
        System.out.println("El numero de satelites es:" + satelites);
        System.out.println("La distancia al sol:" + distanciaalsol);
        System.out.println("Su volumen es de:" + volumen);
        System.out.println("El diametro de este es:" + diametro);
        System.out.println("Tipo de planeta:" + tipo);
        System.out.println("¿Puede visualizarse?:" + esObservable);
    }

    public double decifrarlaDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaeXterior() {

        double maximoLimite = 3.4 * 149597870;

        double distanciadePlaneta = distanciaalsol * 1_000_000;

        if (distanciadePlaneta > maximoLimite) {
            return true;
        } else {
            return false;
        }
    }
}
        