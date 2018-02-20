/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion.de.segundo.grado;

/**
 *
 * @author ASUS
 */
public class EcuacionDeSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a=4;
        double b=25;
        double c=30;
        double resultado;
        double x=0,x1,x2;
        
        resultado=Math.pow(b,2)-4*a*c;
        if(resultado<0){
            System.out.println("la ecuacion no tiene solucion en los numeros reales");
        }
        if(resultado==0){
            x=-b/(2*a);
        }
        else{
            x1=(-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
            x2=(-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
            
            System.out.println("x1= "+x1);
            System.out.println("x2= "+x2);
        }
    }
    }
    




