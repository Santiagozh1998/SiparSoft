package Vista;

public class Main {
    
    public static void main (String args[]){
        VentanaInicioSesion ventanaInicio; 
        
        if(args.length==0) {
        	ventanaInicio= new VentanaInicioSesion("127.0.0.1",4545);
        }else {
        	ventanaInicio= new VentanaInicioSesion(args[0], 4545); 
        }
         
           
    }    
    
}
