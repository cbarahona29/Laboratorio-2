package lab2;

import java.util.Scanner;

public class Garcia_Cesar_Notas {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de notas:");
        int cnotas = entrada.nextInt();
        int contador = 1;
        int sumaNotas = 0;
        int notamax = Integer.MIN_VALUE; 
        int notamin = Integer.MAX_VALUE; 
        
        while (contador <= cnotas) {
            int nota = -1;
            
            while (nota < 0 || nota > 100) {
                System.out.println("Ingresar nota #" + contador);
                nota = entrada.nextInt();
                
                if (nota < 0 || nota > 100) {
                    System.out.println("Ingrese valores entre 0 y 100");
                }
            }
            
            sumaNotas += nota; 
               if (nota > notamax) {
                notamax = nota;
            }
            if (nota < notamin) {
                notamin = nota;
            }
            contador++;
        }

       
        double promedio = sumaNotas / cnotas;
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("La nota mas alta es: " + notamax);
        System.out.println("La nota mas baja es: " + notamin);
         
   }
    
}

