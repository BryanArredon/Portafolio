public class PruebaTriangulo {
    public static void (String[] args){
        Triangulo triangulo = new Triangulo(5.0, 4.0, "color pastel");
        System.out.println("info de triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("su area es: "+triangulo.area());
    }
}