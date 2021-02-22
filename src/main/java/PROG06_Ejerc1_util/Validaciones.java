/**
 *Clase para validar los datos introducidos en la clase Principal. 
 */
package PROG06_Ejerc1_util;

import java.time.LocalDate;
import java.util.regex.*;

/**
 *
 * @author Laura
 */
public class Validaciones {
    
    /**
     * Método para validar matrícula.  Es correcta si cumple el formato estándar:
     * 4 números + 3 letras mayúsculas.
     * @param matricula: número de matrícula del vehículo.
     * @return  true si la matrícula es correcta, false en caso contrario.
     */
    public static boolean validarMatricula (String matricula){
        
        boolean validarMatricula=true;

        Pattern a=Pattern.compile("[0-9]{4}[A-Z]{3}");//expresión regular que determina el formato que ha de cumplir
                    
        Matcher b=a.matcher(matricula);//se compara la matrícula con el patrón.
                    
        if (b.matches()){ //si la matricula cumple el patron, se válida, en caso contrario, no lo es y se muestra un mensaje de error.
                        
            return validarMatricula;
                    
        }else{ 
                    
            validarMatricula=false;
                    
            System.out.println("Error: matrícula incorrecta.");}
                    
            return validarMatricula;
    }

    
    /**
     * Método para validar que el número de kilómetros no es inferior a 0
     * @param numKilom: valor recibido con el número de kilómtros del vehículo
     * @return <code>true</code> si el valor es mayor de 0; <code>false</code> si no lo es. 
     */
    public static boolean validarKilom (int numKilom ){
        
        boolean validarKilom= true;
        
        if (numKilom < 0){
            
            validarKilom=false;
            
            System.out.println("Error: introduce un valor mayor de 0");
        }
        
        return validarKilom;
    }
    
    
    /**
     * Método para validar que la fecha de matriculación es anterior a la actual
     * @param fecha: fecha de matriculación del vehículo
     * @return <code>true</code>si la fecha es anterior a la actual;<code>false</code>si no lo es.
     */
    public static boolean validarFecha (LocalDate fecha){
        
        boolean validarFecha;
        
        LocalDate hoy=LocalDate.now();
        
        if (fecha.isAfter(hoy)){
            
            validarFecha=false;
        
            System.out.println("Fecha incorrecta");
        
        }else {
            
            validarFecha=true;     
        }
                      
        return validarFecha;
    }
    
    
    /**
     * Método que valida que el formato del DNI es correcto.
     * @param numDni: número de DNI introducido al crear el vehículo
     * @return true si es válido, false en caso contrario.
     */
    public static boolean validarDni (String numDni){
        
        boolean validarDni;
        
            Pattern p=Pattern.compile("[XYxy]?[0-9]{1,9}[A-Za-z]"); //expresión regular que determina el formato.
                    
            Matcher m=p.matcher(numDni);//se compara el valor introducido con el patrón.
                    
                if (m.matches()){ 
                        
                    validarDni=true;
                    
                }else{ 
                    
                    validarDni=false;
                            
                    System.out.println("Error: DNI incorrecto.");
                }
                
            return validarDni;
    }
    
    /**
     * Método para validar que el nombre contenga al menos un nombre y dos apellidos
     * y su longitud no excede de 40 carácteres.
     * @param nombre: nombre introducido
     * @return true si el nombre es válido, false en caso contrario.
     */
    public static boolean validarNombre (String nombre){
        
        boolean validarNombre=true;
        
        int espacios=0;//variable para contar los espacios del nombre.
        
        int n;
        
        for(n=0;n<nombre.length();n++){//se recorren todos los carácteres del nombre
            
            if (nombre.charAt(n)==' '){//si algún carácter es un espacio, se añade uno al contador de espacios.
                
                espacios++;
            }
        }
            
            if (espacios !=2){//si el nombre no contiene dos espacios, se muestra mensaje de error y la variable toma valor false.
                
                System.out.println("Error, introduzca nombre y apellidos.");
                
                validarNombre=false;
            }
            
            if (nombre.length() - espacios > 40){ //si el nombre contiene más de 40 carácteres se muestra mensaje de error y el valor es false.
                
                System.out.println("Error, el nombre no puede superar los 40 carácteres.");
                
                validarNombre=false;
            }
        
        return validarNombre;
    }
}
