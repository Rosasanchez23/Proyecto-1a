# Problema 1: Módulo Financiero-Lógico de Impuestos

## 1. Enunciado y propósito del problema
Una tienda de equipos informáticos requiere automatizar el cálculo del impuesto aplicable y el costo final de venta para sus clientes. La política fiscal depende de dos condiciones lógicas: si el comprador es un estudiante acreditado ($p$) y si el equipo adquirido pertenece al catálogo educativo ($q$). 

El propósito del programa `Problema1.java` es evaluar estas proposiciones atómicas mediante operadores de lógica proposicional para determinar automáticamente la tasa de impuesto correspondiente (0%, 8% o 16%), calcular el monto del impuesto y mostrar el desglose financiero final.

---

## 2. Entradas y salidas

### Entradas
El programa solicita tres datos al usuario por consola:

| Variable | Tipo de dato | Descripción | Valores válidos |
| :--- | :--- | :--- | :--- |
| `precioBase` | `double` | Precio base del equipo informático en pesos ($). | Números reales positivos (`> 0`). |
| `inputP` | `int` | Indica si el comprador es estudiante acreditado. | `1` (Verdadero / Sí) o `0` (Falso / No). |
| `inputQ` | `int` | Indica si el equipo es de catálogo educativo. | `1` (Verdadero / Sí) o `0` (Falso / No). |

### Salidas
* **Mensaje de error (si aplica):** Si `inputP` o `inputQ` son distintos de `0` o `1`, muestra un aviso y detiene la ejecución.
* **Estado de proposiciones:** Traducción de $p$ y $q$ a `Verdadero (1)` o `Falso (0)`.
* **Política aplicada:** Regla lógica activada y porcentaje de impuesto asignado.
* **Desglose monetario:** Precio base, monto del impuesto y costo final formateados a dos decimales (`$0.00`).

---

## 3. Procedimiento de solución

### Reglas lógicas y tasas fiscales
A partir de las entradas `1` y `0`, se definen las proposiciones booleanas $p$ y $q$, evaluando tres casos mutuamente excluyentes:

1. **Exención Total ($p \land q$):** Si es estudiante acreditado **Y** el equipo es de catálogo educativo, la tasa es del **0%** (`0.00`).
2. **Impuesto Subvencionado ($p \oplus q$):** Si se cumple **únicamente una** de las dos condiciones (O exclusivo / XOR), la tasa es del **8%** (`0.08`).
3. **Impuesto General Estándar ($\neg p \land \neg q$):** Si **no** es estudiante **Y** el equipo **no** es de catálogo educativo, la tasa es del **16%** (`0.16`).

### Fórmulas de cálculo
$$\text{Monto de Impuesto} = \text{Precio Base} \times \text{Tasa de Impuesto}$$

$$\text{Costo Final} = \text{Precio Base} + \text{Monto de Impuesto}$$

---

## 4. Estructura y partes principales del programa
El código fuente en `src/Problema1.java` se organiza en cinco bloques secuenciales:

1. **Lectura de datos (`Scanner`):** Captura el precio base (`nextDouble()`) y los indicadores enteros `inputP` e `inputQ` (`nextInt()`).
2. **Validación de entradas:** Verifica mediante una estructura condicional `if` que `inputP` e `inputQ` contengan exclusivamente `0` o `1`. En caso contrario, cierra el flujo y finaliza el programa con `return`.
3. **Conversión a valores booleanos:** Transforma los enteros `1`/`0` en variables lógicas `boolean p` y `boolean q`.
4. **Evaluación de políticas fiscales (`if / else if`):**
   * `if (p && q)` aplica la conjunción lógica para la tasa del 0%.
   * `else if (p ^ q)` utiliza el operador XOR (`^`) de Java para la tasa reducida del 8%.
   * `else if (!p && !q)` evalúa la negación de ambas proposiciones para aplicar la tasa estándar del 16%.
5. **Cálculo y salida formateada:** Calcula el impuesto y total a pagar, imprimiendo los resultados alineados mediante `System.out.printf`.

---

## 5. Instrucciones de compilación, ejecución y ejemplo

### Compilación y ejecución
Desde la raíz del repositorio (`Proyecto-1a`), abre una terminal (como Git Bash) y ejecuta los siguientes comandos:

```bash
# 1. Compilar el código fuente
javac problemas/problema-1/src/Problema1.java

# 2. Ejecutar el programa
java -cp problemas/problema-1/src Problema1