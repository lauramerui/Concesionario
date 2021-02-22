package PROG06_Ejerc1;

/**
 *Clase para implementar la funcionalidad necesaria. Contiene la estructura de datos
 *necesaria para almacenar los vehículos, con un tamaño máximo de 50.
 */

/**
 *
 * @author Laura
 */

public class Concesionario {

    Vehiculo[] coches=new Vehiculo[50]; //estructura de datos de la clase Vehiculo que contendrá un máximo de 50 objetos.
     
    static private int i=0; //variable para contabilizar el número de vehículos existentes.
     

    /**
     * Método constructor.
     */
    public Concesionario(){
        
        coches [i]=new Vehiculo(); //se inicializa la estructura de datos.    
    } 
   
    /**
     * Método para añadir nuevos vehículos.Recibe todos los datos de un vehículo 
 y trata de insertarlo.
     * @param marca: marca del vehículo.
     * @param matricula: número de matrícula del vehículo.
     * @param numKilom: número de kilómetros de vehículo.
     * @param dia: día de la fecha de matriculación.
     * @param mes: mes de la fecha de matriculación.
     * @param anio: año de la fecha de matriculación.
     * @param precio: precio del vehículo.
     * @param descripcion: descripción del vehículo.
     * @param nomPropietario: nombre del propietario del vehículo.
     * @param numDni: DNI del propietario.
     * @return 0 si se inserta el vehículo, -1 si no se puede insertar porque ya 
     * él concesionario está lleno y -2 si la matricula ya existe.
     */
    public int insertarVehiculo(String marca, String matricula, int numKilom, 
            int dia, int mes, int anio, double precio, String descripcion, String nomPropietario, String numDni){

        int indicador=0; //se inicia a 0 el contador.
        
            if(i==50){ //si el contador marca 50, el concesionario está lleno, y por tanto el indicador tomará el valor -1.
            
                indicador=-1;
            }
                    
            for(int v=0; v<i; v++){ //bucle para buscar si la matrícula introducida existe ya, si es así el indicador toma el valor -2.
               
                if(matricula.equals(coches[v].getMatricula())){
            
                    indicador=-2;
                }
            }
               
            if (indicador==0){ //si no se ha cumplido ninguna de las condiciones anteriores, el contador marca 0, y por tanto se añade el nuevo objeto.
                   
                coches[i]=new Vehiculo(marca, matricula, numKilom, dia, mes, anio, precio, descripcion, nomPropietario, numDni);

                i++; //por cada nuevo objeto al contador se le suma 1.
            }        
             
        return indicador;
    }
     
    /**
     * Método que lista por pantalla los datos de todos los vehículos del concesionario.
     */
    public void listaVehiculos(){

        for (int j = 0; j < i; j++) { //bucle para asignar a cada método getter el número de objeto existente para listar todos los vehículos.
            
            System.out.println("Vehículo número: " + (j+1));
            System.out.println("Marca: "+ coches[j].getMarca());
            System.out.println("Matricula: "+  coches[j].getMatricula());
            System.out.println("Precio: " + coches[j].getPrecio() + "€");
            System.out.println("Número de kilómetros: " + coches[j].getNumKilom());
            System.out.println("Descripción: " + coches[j].getDescripcion()+"\n");
        }
    }

    /**
     * Busca el vehículo en el concesionario a partir de una matrícula, devuelve sus datos si existe.
     * @param matricula: número de matrícula introducida para busca si existe un vehículo.
     * @return true si el coche es encontrado, false si no existe. 
     */   
    public boolean buscaVehiculo(String matricula){
           
        boolean buscaVehiculo=false;
           
        for(int b=0; b<i; b++){//bucle para recorrer todos los vehículos existentes
               
            if(matricula.equals(coches[b].getMatricula())){//si se encuentra una matrícula igual a alguna existente el valor se torna true y se devuelve los datos del vehículo encontrado.
            
                buscaVehiculo=true;
            
                System.out.println("Coche encontrado:");   
                System.out.println("Marca: "+ coches[b].getMarca());
                System.out.println("Matrícula: "+  coches[b].getMatricula());
                System.out.println("Precio: " + coches[b].getPrecio() + "€");
            
                break;
            
            }else{
                   
                buscaVehiculo=false;   
                   
                break;   
            }
        }
        
        return buscaVehiculo;     
    }
        
    /**
     * Busca el vehículo con la cuya matrícula coincida y actualiza sus kilómetros.
     * @param matricula: matrícula para buscar vehículo.
     * @param numKilom: número de kilómetros actualizados que se quiere introducir.
     * @return true si se hizo con éxito, false en caso contrario.
     */
    boolean actualizaKms (String matricula, int numKilom){
        
        boolean actualizaKms=false;
        
        for(int a=0; a<i; a++){//bucle para recorrer vehículos existentes.
        
            if(matricula.equals(coches[a].getMatricula())){//si se encuentra coincidencia de matrícula, se le asigna como número de kilómetros el valor introducido por parámetro.
                
                coches[a].setNumKilom(numKilom);
                
                actualizaKms=true;  
                
            }else{
                
                actualizaKms=false;
            }
        }
        
        return actualizaKms;
    }
}
    