
class Persona {
    private String nombre;
    private byte edad;
    private final LocalDate fechaNacimiento;

    private Persona(String nombre, byte edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
}

class Empleado extends Persona {
    private float salario;

    private Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }
}

class Programador extends Empleado {
    private String lenguajePrincipal;
    private String herramientaConsultas;

    private Programador(String nombre, byte edad, LocalDate fechaNacimiento, float salario,
                        String lenguajePrincipal, String herramientaConsultas) {
        super(nombre, edad, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
        this.herramientaConsultas = herramientaConsultas;
    }
}

class DBA extends Empleado {
    private String herramientaAdminDB;

    private DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientaAdminDB) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientaAdminDB = herramientaAdminDB;
    }
}

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador("NombreProgramador", (byte) 30, LocalDate.of(1990, 1, 1),
                50000.0f, "Java", "SQL");
        
        DBA dba = new DBA("NombreDBA", (byte) 35, LocalDate.of(1985, 5, 15), 55000.0f, "Oracle");

        // Mostrar propiedades (puedes implementar un método toString en cada clase para facilitar esto)
    }
}