public class Bloques {
    private static int valor;

    static {
        valor = 42; 
    }

    public static void mostrarValor() {
        System.out.println("El valor es: " + valor);
    }

    public static void main(String[] args) {
        Bloques bloques = new Bloques();
        mostrarValor(); 
}

//CECILIA AURORA ROBELO HERNÁNDEZ
//RETO 11