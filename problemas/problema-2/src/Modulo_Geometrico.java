package com.mycompany.programas;
//Importa "Scanner" para permitir la lectura de datos ingresados por el usuario.
import java.util.Scanner;
public class Modulo_Geometrico {
    public static void main(String[] args) {
        //Crea un objeto Scanner (owo) para leer las coordenadas ingresadas por el teclado.
    Scanner owo=new Scanner(System.in);
    //Variables que almacenan las coordenadas ingresadas por el usuario.
String punto1;
String punto2;
    //Variabes que almacenan las coordenadas numéricas de ambos puntos.
    float x1 = 0, y1 = 0, x2 = 0, y2 = 0;
//Variable booleana que controla si las coordenadas son válidas    
boolean valido = false;
//Repite la solicitud de coordenadas mientras no se hayan ingresado correctamente.
while (!valido) {
    //Solicita al usuario ingresar las coordenadas de ambos puntos
    System.out.println("Ingresa la coordenada del punto 1 separadas por una coma (Ejemplo 7,4)");
    punto1 = owo.nextLine();

    System.out.println("Ingresa la coordenada del punto 2 separadas por una coma (Ejemplo 9,7)");
    punto2 = owo.nextLine();
    
    //Separa las coordenadas de cada punto utilizando la coma como delimitador
    String [] separacion1=punto1.split(",");
    String [] separacion2=punto2.split(",");
    
//Comprueba que ambos puntos contengan exactamente dos coordenadas    
if (separacion1.length != 2 || separacion2.length != 2) {
    //Muestra un mensaje si alguno de los dos puntos tiene un formato incorrecto.
    System.out.println("Error: cada punto debe contener exactamente dos coordenadas separadas por una coma.");
    //Reinicia el ciclo para solicitar nuevamente las coordenadas
    continue;
}
//Intenta convertir las coordenadas ingresadas de texto a valores númericos.
try {
    //Convierte las coordenadas ingresadas de texto a valores númericos
    x1 = Float.parseFloat(separacion1[0].trim());
    y1 = Float.parseFloat(separacion1[1].trim());
    
    //Convierte las coordenadas del segundo punto a tipo float.
    x2 = Float.parseFloat(separacion2[0].trim());
    y2 = Float.parseFloat(separacion2[1].trim());

    //Indica que las coordenadas fueron ingresadas y convertidas correctamente.
    valido = true;
//Captura errores cuando el usuario introduce valores que no puedan convertirse a números.
} catch (NumberFormatException e) {
    //Informa al usuario que debe ingresar coordenadas númericas.
    System.out.println("Error: debes ingresar coordenadas numericas.");
}
}

//Comprueba si ambos puntos tienen las mismas coordenadas.
if (x1 == x2 && y1 == y2) {
    System.out.println("No puedes ingresar dos puntos iguales");
    
//Comprueba si ambos puntos tienen la misma coordenada X, formando una recta vertical.
} else if (x1 == x2) {
    System.out.println("Los puntos forman una recta vertical, ingrese nuevas coordenadas");
    
} else {
    //Calcula la diferencia entre las coordenadas X yY de ambos puntos.
    double delta_x,delta_y;
    delta_x=x2-x1;
    delta_y=y2-y1;
    
    //Calcula la distancia entre los dos puntos mediante el teorema de Pitágoras
    double d;
    d=Math.sqrt(Math.pow(delta_x,2)+Math.pow(delta_y,2));
    // Muestra en pantalla el resultado de la distancia calculada.
    System.out.println("La distancia entre los dos puntos es de: "+d);
    } 
    }
    }

