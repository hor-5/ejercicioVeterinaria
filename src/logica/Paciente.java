
package logica;

public class Paciente {
    
    private String id;
    private String nombre;
    private String raza;
    private String dimension;
    private String nombreDue;

   
    public Paciente(String id, String nombre, String raza, String dimension, String nombreDue){
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.dimension = dimension;
        this.nombreDue = nombreDue;
    }
    
    public String obtenerId(){
        return id;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerRaza(){
        return raza;
    }
        
    public String obtenerDimension(){
        return dimension;
    }
        
    public String obtenerNombreDue(){
        return nombreDue;
    }
    
    public double calcularCosto(double costo){
        double aumento;
        switch (dimension) {
            case "grande":                
                aumento = costo * 0.30;
                costo+=aumento;
                break;
            case "mediano":                
                aumento = costo * 0.20;
                costo+=aumento;
                        break;
            default:                
                aumento = costo *0.10;
                costo+=aumento;
                break;
        }
        return costo;
    }
    
   
}
