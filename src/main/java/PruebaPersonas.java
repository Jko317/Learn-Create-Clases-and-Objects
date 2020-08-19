
public class PruebaPersonas {
    public static void main(String[] args) {
        
        //Creacion de un objeto de tipo persona
        //Definición de la variable persona
        Persona persona1;
        
        //Instanciando (creando) un objeto de la clase persona
        persona1=new Persona();
        
        //Accedemos al objeto persona y llamamos al metodo desplegar Nombres
        persona1.desplegarNombres();
        
        //Modificamos los valores de los atributos del objeto persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //Volvemos a imprimir  los valores
        System.out.println("");
        persona1.desplegarNombres();
        
        //Creación de segundo objeto de tipo persona
        Persona persona2 = new Persona();
        persona2.nombre ="Karla";
        persona2.apellido = "Gomez";
        
        //Volvemos a imprimir  los valores
        System.out.println("");
        persona2.desplegarNombres();
        
        
    
    
    }
}
