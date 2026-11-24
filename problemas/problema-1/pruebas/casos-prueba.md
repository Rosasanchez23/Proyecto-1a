# Pruebas manuales del módulo financiero-lógico

| Caso | Entradas | Cálculo manual paso a paso | Resultado esperado | Resultado obtenido | Coincide |
|---|---|---|---|---|---|
| 1 | Precio: $1,000; p=1; q=1 | Tasa: 0%. Impuesto: $1,000 × 0 = $0. Total: $1,000 + $0 = $1,000. | Impuesto: $0.00. Total: $1,000.00 | Impuesto: $0.00. Total: $1,000.00 | Si |
| 2 | Precio: $2,500; p=1; q=0 | Tasa: 8%. Impuesto: $2,500 × 0.08 = $200. Total: $2,500 + $200 = $2,700. | Impuesto: $200.00. Total: $2,700.00 | Impuesto: $200.00. Total: $2,700.00 | Si |
| 3 | Precio: $500; p=0; q=1 | Tasa: 8%. Impuesto: $500 × 0.08 = $40. Total: $500 + $40 = $540. | Impuesto: $40.00. Total: $540.00 | Impuesto: $40.00. Total: $540.00 | Si |
| 4 | Precio: $1,000; p=0; q=0 | Tasa: 16%. Impuesto: $1,000 × 0.16 = $160. Total: $1,000 + $160 = $1,160. | Impuesto: $160.00. Total: $1,160.00 | Impuesto: $160.00. Total: $1,160.00 | Si |
| 5 | Precio: $0; p=1; q=1 | El programa no debería aceptar este valor| Valor rechazado |  Impuesto: $0.00. Total: $0.00  | No |
| 6 | Precio: $1,250.50; p=0; q=0 | Tasa: 16%. Impuesto: $1,250.50 × 0.16 = $200.08. Total: $1,250.50 + $200.08 = $1,450.58. | Impuesto: $200.08. Total: $1,450.58 | Impuesto: $200.08. Total: $1,450.58 | Si |
| 7 | Precio: $8,000; p=2; q=0 | El valor de p no es válido porque solo acepta 0 o 1. | Error: Debe ingresar solo 1 (Verdadero) o 0 (Falso). | Error: Debe ingresar solo 1 (Verdadero) o 0 (Falso). | Si |
| 8 | Precio: $15,000; p=1; q=5 | El valor de q no es válido porque solo acepta 0 o 1. | Error: Debe ingresar solo 1 (Verdadero) o 0 (Falso). | Error: Debe ingresar solo 1 (Verdadero) o 0 (Falso). | Si |
| 9 | Precio: -$500; p=1; q=0 | El valor no debería ser válido | El valor es rechazado | Impuesto: -$40.00. Total: -$540.00 | No |
| 10 | Precio: $999,999,999.99; p=0; q=0 | Tasa: 16%. Impuesto: $999,999,999.99 × 0.16 = $159,999,999.9984. Total: $1,159,999,999.9884. | Impuesto: $160,000,000.00. Total: $1159999999.99 | Impuesto: $160,000,000.00. Total: $1159999999.99 | Si |

## Criterio para los decimales

Se compararán los resultados con dos cifras decimales, porque el programa utiliza `printf("%.2f")` para mostrar los importes.

## Observaciones

- Se probaron las tres tasas de impuesto: 0%, 8% y 16%.
- Se incluyeron cantidades enteras, decimales y cero.
- Se probaron valores inválidos en las proposiciones p y q.
- Se debe comprobar si el programa acepta precios iguales a cero.
- Se debe verificar que los resultados monetarios se presenten con dos decimales.

## Errores

- El programa permite ingresar y evaluar valores negativos, aunque no debería permitirlos.
- El programa permite ingresar y evaluar el número cero.
