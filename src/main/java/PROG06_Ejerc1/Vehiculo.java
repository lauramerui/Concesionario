package PROG06_Ejerc1;


import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Vehiculo {
    
        //atributos de la clase vehículo:
    
    String marca;
    
    String matricula;
    
    int numKilom;
    
    //fecha matricula:
    int dia=1;
    
    int mes=1;
    
    int anio=1;
    
    String descripcion;
    
    double precio;
    
    String nomPropietario;
    
    String numDni;
    
    LocalDate fecha=LocalDate.of(anio, mes, dia);
    
    LocalDate hoy=LocalDate.now();
    
    
    /**
     * Método constructor vacío
     */
    public Vehiculo(){    
    }

    /**
     * Método constructor para la clase vehiculo
     * @param marca: marca del vehiculo
     * @param matricula: matricula del vehiculo
     * @param numKilom: kilómetros del vehículo
     * @param dia: día de fecha de matriculación
     * @param mes: mes de fecha de matriculación
     * @param anio: año de fecha de matriculación
     * @param precio: precio de fecha de matriculación
     * @param descripcion: descripción del vehículo
     * @param nomPropietario: nombre del propietario del vehículo
     * @param numDni: dni del propietario
     */        
    public Vehiculo (String marca, String matricula, int numKilom, int dia, int mes, 
            int anio, double precio, String descripcion, String nomPropietario, String numDni){
        
        this.marca=marca;
        
        this.matricula=matricula;
        
        this.numKilom=numKilom;
        
        this.dia=dia;
        
        this.mes=mes;
        
        this.anio=anio;
        
        this.precio=precio;
        
        this.descripcion=descripcion;
        
        this.nomPropietario=nomPropietario;
        
        this.numDni=numDni;            
    }
    

    //MÉTODOS SET:
    
    /**
     * Método para establecer el valor del atributo marca.
     *@param marca: marca del vehículo.
     */
    public void setMarca(String marca){
     
    this.marca=marca;
    }

    /**
     * Método para establecer el valor del atributo  matrícula.
     *@param matricula: marca del vehículo.
     */
    public void setMatricula(String matricula){
     
    this.matricula=matricula;
    }    

    /**
     * Método para establecer el valor del atributo numKilom.
     * Cada vez que se actualice este valor, no podrá ser un valor inferior al anterior.
     *@param numKilom: número de kilómetros que tiene el vehículo
     */
    public void setNumKilom(int numKilom){
     
    this.numKilom=numKilom;
    }

    /**
     * Método para establecer el valor del atributo dia.
     *@param dia: dia de fecha de matriculación del vehículo.
     */
    public void setDia(int dia){
     
    this.dia=dia;
    }
        
    /**
     * Método para establecer el valor del atributo mes.
     *@param mes: mes de fecha de matriculación del vehículo.
     */
    public void setMes(int mes){
     
    this.mes=mes;
    }    
    
    /**
     * Método para establecer el valor del atributo anio.
     *@param anio: año de fecha de matriculación del vehículo.
     */
    public void setAnio(int anio){
     
    this.anio=anio;
    }      

    /**
     * Método para establecer el valor del atributo descripcion.
     *@param descripcion: descripción del vehículo.
     */
    public void setDescripcion(String descripcion){
     
    this.descripcion=descripcion;
    } 

    /**
     * Método para establecer el valor del atributo precio.
     *@param precio: precio del vehículo.
     */
    public void setPrecio(double precio){
     
    this.precio=precio;
    } 

    /**
     * Método para establecer el valor del atributo nomPropietario.
     *@param nomPropietario: propietario del vehículo.
     */
    public void setNomPropietario(String nomPropietario){
     
    this.nomPropietario=nomPropietario;
    }
    
    /**
     * Método para establecer el valor del atributo numDni.
     * Se validará para que se introduzca un valor correcto.
     *@param numDni: dni del propietario del vehículo.
     */
    public void setNumDni(String numDni) {
        
            this.numDni=numDni;}

    //MÉTODOS GET:
    
    /**
     * @return marca del coche
     */
    public String getMarca(){
        
        return marca;
    }
        
    /**
     * @return matricula del coche
     */
    public String getMatricula(){
        
        return matricula;
    }
    
    /**
     * @return número de kiómetros que tiene el coche 
     */
    public int getNumKilom(){
        
        return numKilom;
    }
      
    /**Calcula los años de antigüedad restando el año de la fecha actual al año 
     *introducido en la fecha de matriculación del coche
     *@return antiguedad del coche
     */
    public int get_Anios(){
              
        int antiguedad;
            
        antiguedad=hoy.getYear() - fecha.getYear();            
           
        return antiguedad;
    }
    
    /**
     * @return nombre del propietario
     */ 
    public String getNomPropietario(){
            
        return nomPropietario;
    }
             
    /**
     * @return DNI del propietario
     */        
    public  String getNumDni(){
            
            return numDni;
        }
        
    /**
     * @return descripción del vehículo
     */        
        public String getDescripcion(){
            
            return descripcion;
        }
        
    /**
     * @return precio del vehículo
     */
        public double getPrecio(){
            
            return precio;
        }
}
