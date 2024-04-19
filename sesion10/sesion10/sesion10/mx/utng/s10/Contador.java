public class Contador{
    private static short contadorClase;
    private short contadorInstancia;
    public Contador(){
        contadorClase++;
        contadorInstancia++;

    }
    public static short getContadorClase(){
        return contadorClase;
    }
    public static short getContadorClase(){
        return contadorClase;
    
}
public static void setContadorClase(short contadorClase){
    Contador.contadorClase = contadorClase;
}
public static void setContadorInstancia(short contadorInstancia){
    this.contadorInstancia = contadorInstancia;
}