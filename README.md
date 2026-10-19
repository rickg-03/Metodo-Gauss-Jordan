# Práctica: Método de Gauss-Jordan (Reutilización de Software)

Este proyecto implementa el método de eliminación de **Gauss-Jordan** en **Java** bajo un diseño modular y aplicando el principio de **reutilización de software**. Se aprovecha el módulo previo de Eliminación Gaussiana (`Gauss.eliminacionGaussiana`) para transformar la matriz en una matriz triangular superior, finalizando con la normalización de pivotes y barrido superior para obtener la matriz identidad y la lectura directa del vector de soluciones.

## 🛠️ Lenguaje y Requisitos

* **Lenguaje de programación:** Java (JDK 8 o superior).
* **Compilador:** `javac`
* **Entorno de ejecución:** Cualquier terminal o consola de comandos.

## 📁 Estructura Modular del Proyecto

El código fuente está estructurado de manera modular respetando el principio de separación de responsabilidades:

1. **`Gauss.java`**: Módulo base que ejecuta la eliminación gaussiana hacia adelante para obtener la matriz triangular superior.
2. **`GaussJordan.java`**: Módulo que invoca a `Gauss.eliminacionGaussiana(matriz)` y completa el proceso normalizando los pivotes a $1$ y realizando el barrido superior hacia atrás.
3. **`LectorDatos.java`**: Maneja la interacción por consola, la lectura de datos y la impresión de matrices y vectores de respuesta.
4. **`Main.java`**: Clase principal que coordina el flujo del programa.

## 💻 Ejemplo de Prueba y Salida por Consola

### Sistema de Ecuaciones
$$
\begin{cases} 
2x_1 + x_2 - x_3 = 8 \\ 
-3x_1 - x_2 + 2x_3 = -11 \\ 
-2x_1 + x_2 + 2x_3 = -3 
\end{cases}
$$

### Salida en Consola (Texto Plano)

```text
=== PROGRAMA: MÉTODO DE GAUSS-JORDAN ===
Ingrese el número de variables (ecuaciones): 3

Ingrese los elementos de la matriz aumentada [A | b]:
Elemento [1][1]: 2
Elemento [1][2]: 1
Elemento [1][3]: -1
Elemento [1][4]: 8
Elemento [2][1]: -3
Elemento [2][2]: -1
Elemento [2][3]: 2
Elemento [2][4]: -11
Elemento [3][1]: -2
Elemento [3][2]: 1
Elemento [3][3]: 2
Elemento [3][4]: -3

```
Se mostrara cada iteracion hasta llegar al resultado.
```text

--- Matriz Aumentada Inicial [A | b] ---
[   2.00   1.00  -1.00 |   8.00 ]
[  -3.00  -1.00   2.00 | -11.00 ]
[  -2.00   1.00   2.00 |  -3.00 ]

--- Matriz Identidad Resultante [I | x] ---
[   1.00   0.00   0.00 |   2.00 ]
[   0.00   1.00   0.00 |   3.00 ]
[   0.00   0.00   1.00 |  -1.00 ]

--- Vector de Soluciones (Lectura Directa) ---
x1 = 2.0000
x2 = 3.0000
x3 = -1.0000
```
