
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Angel",
           apellido_paterno = "Sánchez",
           apellido_materno = "García",
           semestre_que_cursas = "2";
    int numero_decuenta = 5;
    String materias_que_cursas = "Lunes y Miercoles:"
            +"7-8:30 Am Sistemas"
            +"9-10:30 Am Circuitos"
            +"11-12:30 Pm"
            +" "
            +"Martes y Jueves"
            +"7-9 Am Calculo"
            +"10-12:30 Am Programación";
    public void Informacion(){        
        System.out.println("El nombre completo es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("El semestre que cursa es: " + semestre_que_cursas);
        System.out.println("Su numero de cuenta es: " + numero_decuenta);
        System.out.println("Su horario es: " + materias_que_cursas);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
