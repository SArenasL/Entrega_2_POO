public class Persona {

    String nombre;
    String apellidos;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String paísNacimiento;
    char género;

    Persona(String nombre, String apellidos, String númeroDocumentoIdentidad,
            int añoNacimiento, String paísNacimiento, char género) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paísNacimiento = paísNacimiento;
        this.género = género;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de nacimiento = " + paísNacimiento);
        System.out.println("Género = " + género);
        System.out.println();
    }

    public static void main(String args[]) {

        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Colombia", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Colombia", 'H');

        p1.imprimir();
        p2.imprimir();
    }
}