# Pruebas manuales del módulo geométrico-vectorial

Caso| Entradas| Cálculo manual paso a paso| Resultado esperado| Resultado obtenido| Coincide|
|---|---|---|---|---|---|
|1| P1: (1,2). P2: (4,6)| Δx = 4 - 1 = 3. Δy = 6 - 2 = 4. d = √(3² + 4²) = √25 = 5.| Distancia: 5.0| Distancia: 5.0 | Si |
|2| P1: (-3,-4). P2: (0,0)| Δx = 0 - (-3) = 3. Δy = 0 - (-4) = 4. d = √(3² + 4²) = 5.| Distancia: 5.0| Distancia: 5.0 | Si |
|3| P1: (1.5,2.5). P2: (4.5,6.5)| Δx = 4.5 - 1.5 = 3. Δy = 6.5 - 2.5 = 4. d = √(9 + 16) = 5.| Distancia: 5.0| Distancia: 5.0| Si |
|4| P1: (3,5). P2: (3,5)| x1 = x2 y y1 = y2. Los dos puntos son iguales. No se calcula distancia.| Mensaje: No puedes ingresar dos puntos iguales.| Mensaje: No puedes ingresar dos puntos iguales.| Si |
|5| P1: (2,3). P2: (2,8)| Δx = 2 - 2 = 0. Los puntos tienen la misma coordenada X.| Mensaje: Los puntos forman una recta vertical.| Mensaje: Los puntos forman una recta vertical.| Si |
|6| P1: (0,0). P2: (6,8)| Δx = 6 - 0 = 6. Δy = 8 - 0 = 8. d = √(36 + 64) = √100 = 10.| Distancia: 10.0| Distancia: 10.0| Si |
|7| P1: (2). P2: (3,4)| El primer punto contiene una sola coordenada. No se puede realizar el cálculo.| Mensaje de error por formato incorrecto y nueva solicitud de coordenadas.| Mensaje de error por formato incorrecto y nueva solicitud de coordenadas| Si |
|8| P1: (1,2,3). P2: (4,5)| El primer punto contiene tres coordenadas en lugar de dos. No se puede realizar el cálculo.| Mensaje de error por formato incorrecto y nueva solicitud de coordenadas.| Mensaje de error por formato incorrecto y nueva solicitud de coordenadas.| Si |
|9| P1: (a,2). P2: (3,4)| La coordenada "a" no puede convertirse a un valor numérico.| Mensaje de error por coordenadas no numéricas y nueva solicitud.| Mensaje de error por coordenadas no numéricas y nueva solicitud.| Si |
|10| P1: (100000000,100000000). P2: (100000024,100000032)| Δx = 24. Δy = 32. d = √(24² + 32²) = √(576 + 1024) = √1600 = 40.| Distancia: 40.0| Distancia: 40.0| Si|

# Criterio para los decimales

Se registrará el resultado tal como aparezca en consola, ya que el programa utiliza "System.out.println()" y no establece un límite de cifras decimales.

# Observaciones

- Se incluyen coordenadas positivas, negativas y decimales.
- Se comprueba el comportamiento con puntos iguales y rectas verticales.
- Se incluyen entradas con formato incorrecto.
- Se comprueba la conversión de coordenadas no numéricas.
- Se prueba el comportamiento con valores grandes.

# Errores detectados

- Cuando los puntos son iguales, el programa muestra un mensaje, pero no vuelve a solicitar coordenadas.
- Cuando los puntos forman una recta vertical, muestra un mensaje, pero tampoco vuelve a solicitar coordenadas.
- El programa no establece un formato fijo para mostrar los decimales.