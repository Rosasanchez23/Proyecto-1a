# Problema 2: Módulo Geométrico de Distancia entre Dos Puntos



## 1. Enunciado y propósito del problema



Se requiere desarrollar un programa que permita calcular la distancia entre dos puntos en un plano cartesiano a partir de sus coordenadas.



El propósito del programa `Modulo_Geometrico.java` es recibir las coordenadas de dos puntos, validar que los datos ingresados tengan el formato correcto y calcular la distancia entre ellos mediante el teorema de Pitágoras.



Además, el programa identifica situaciones especiales, como el ingreso de dos puntos iguales o dos puntos que comparten la misma coordenada X.



---



## 2. Entradas y salidas



### Entradas



El programa solicita dos puntos mediante la consola. Cada punto debe ingresarse utilizando dos coordenadas separadas por una coma.



| Variable | Tipo de dato | Descripción | Valores válidos |

| :--- | :--- | :--- | :--- |

| `punto1` | `String` | Coordenadas del primer punto. | Dos valores numéricos separados por una coma. |

| `punto2` | `String` | Coordenadas del segundo punto. | Dos valores numéricos separados por una coma. |

| `x1`, `y1` | `float` | Coordenadas del primer punto. | Valores numéricos. |

| `x2`, `y2` | `float` | Coordenadas del segundo punto. | Valores numéricos. |



### Salidas



- **Mensaje de error de formato:** Si alguno de los puntos no contiene exactamente dos coordenadas separadas por una coma.

- **Mensaje de error numérico:** Si alguno de los valores ingresados no puede convertirse a un número.

- **Validación de puntos iguales:** Informa cuando ambos puntos tienen las mismas coordenadas.

- **Validación de recta vertical:** Informa cuando ambos puntos comparten la misma coordenada X.

- **Resultado:** Muestra la distancia calculada entre los dos puntos cuando se cumplen las condiciones necesarias.



---



## 3. Procedimiento de solución



### Validación de coordenadas



El programa utiliza el método `split(",")` para separar las coordenadas de cada punto.



Posteriormente, comprueba que cada punto contenga exactamente dos valores. Si el formato es incorrecto, solicita nuevamente las coordenadas.



Mediante `Float.parseFloat()` convierte los valores ingresados de texto a números de tipo `float`. También utiliza `trim()` para eliminar espacios innecesarios y un bloque `try-catch` para detectar errores durante la conversión.



### Comprobación de puntos



Una vez que las coordenadas son válidas, el programa comprueba dos condiciones:



1. **Puntos iguales:** Si ambas coordenadas X y Y son iguales, informa que no se pueden ingresar dos puntos iguales.

2. **Recta vertical:** Si las coordenadas X son iguales, informa que los puntos forman una recta vertical.



Si ninguna de estas condiciones se cumple, continúa con el cálculo de la distancia.



### Fórmula de distancia



La distancia entre dos puntos se obtiene mediante la siguiente fórmula:



$$d = \\sqrt{(x_2-x_1)^2+(y_2-y_1)^2}$$



Donde:



- $x_1$ y $y_1$ representan las coordenadas del primer punto.

- $x_2$ y $y_2$ representan las coordenadas del segundo punto.

- $d$ representa la distancia entre ambos puntos.



---



## 4. Estructura y partes principales del programa



El código fuente ubicado en `src/Modulo_Geometrico.java` se organiza en los siguientes bloques:



1. **Lectura de datos (`Scanner`):** Permite recibir las coordenadas de ambos puntos mediante el teclado.

2. **Separación de coordenadas (`split`):** Divide cada punto en dos valores utilizando la coma como separador.

3. **Validación de entradas:** Comprueba que cada punto contenga exactamente dos coordenadas.

4. **Conversión numérica (`Float.parseFloat`):** Convierte los valores ingresados a números de tipo `float`. Utiliza `try-catch` para detectar datos no numéricos.

5. **Comprobación de puntos:** Identifica si los puntos son iguales o si forman una recta vertical.

6. **Cálculo de distancia:** Obtiene las diferencias entre las coordenadas y aplica la fórmula de distancia mediante `Math.sqrt()` y `Math.pow()`.

7. **Salida de resultados:** Muestra en consola la distancia obtenida.



---



## 5. Instrucciones de compilación, ejecución y ejemplo



### Compilación y ejecución



Desde la raíz del repositorio (`Proyecto-1a`), abre una terminal, como Git Bash, y ejecuta los siguientes comandos:



```bash

# 1. Compilar el código fuente

javac -d build problemas/problema-2/src/Modulo_Geometrico.java



# 2. Ejecutar el programa

java -cp build com.mycompany.programas.Modulo_Geometrico

```



*(Nota: El parámetro `-d build` permite generar los archivos compilados respetando la estructura del paquete. Si compilas localmente, recuerda no subir los archivos `.class` al repositorio).*



### Ejemplo de ejecución



Supongamos que ingresamos los siguientes puntos:



- Primer punto: (7,4)

- Segundo punto: (9,7)



**Entrada en consola:**



```text

Ingresa la coordenada del punto 1 separadas por una coma (Ejemplo 7,4)

7,4

Ingresa la coordenada del punto 2 separadas por una coma (Ejemplo 9,7)

9,7

```



**Salida obtenida:**



```text

La distancia entre los dos puntos es de: 3.6055512

```



**Explicación del ejemplo:**



Se sustituyen las coordenadas en la fórmula de distancia:



$$d = \\sqrt{(9-7)^2+(7-4)^2}$$



$$d = \\sqrt{2^2+3^2}$$



$$d = \\sqrt{4+9}$$



$$d = \\sqrt{13}$$



El resultado aproximado es **3.6056 unidades**.



---



## 6. Casos de prueba



Para consultar los casos de prueba manuales, sus datos de entrada y la verificación de resultados, revisa el documento correspondiente dentro de la carpeta `pruebas` del problema 2.

