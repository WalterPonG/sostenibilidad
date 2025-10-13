# 🌱 Lectura de Ficheros CSV en Java — Proyecto de Sostenibilidad

> Proyecto desarrollado en **Java** dentro de **Visual Studio Code**, cuyo objetivo es **leer, interpretar y estructurar datos reales sobre territorios y viviendas** a partir de un fichero CSV.

---

## 🧠 Problema a Resolver
El fichero CSV contiene información territorial (nombre, código y mediana de consumo anual de viviendas).  
La meta es:
- Leer el fichero CSV correctamente.  
- Representar cada línea como un objeto `Territorio`.  
- Almacenar todos los territorios en una estructura central (`Viviendas`) que permita manipular y mostrar los datos.  
- Ordenar automáticamente los territorios por su **valor de mediana** y obtener los **tres con mejores valores**.

---

## 🛠️ Tecnologías y Herramientas
- ☕ **Java**  
- 🧰 **Visual Studio Code** como entorno de desarrollo  
- 🗂️ **Ficheros CSV** como fuente de datos

---

## 🧾 Estructura del Código

- `Territorio.java`  
  - Define la **clase Territorio**, con atributos `nombre`, `codigo` y `mediana`.  
  - Implementa la interfaz `Comparable<Territorio>` para poder **ordenar automáticamente** los objetos por mediana de forma descendente.  
  - Incluye métodos `get/set` y `toString()` para mostrar la información de forma clara.

- `Viviendas.java`  
  - Lee el fichero CSV con `BufferedReader`.  
  - Ignora la cabecera y procesa línea por línea usando `split(";")`.  
  - Controla valores vacíos o “-” asignándoles 0.  
  - Crea objetos `Territorio` y los almacena en un `ArrayList`.  
  - Ordena la lista con `Collections.sort(lista)` gracias a la lógica de `compareTo()`.  
  - Muestra:
    - Los **3 territorios con mejor mediana**.  
    - La **lista completa ordenada** de mayor a menor.

- `viviendas-por-intensidad-de-uso-a-partir-del-consumo-electrico.-mediana-consumo-anual.csv`  
  - Contiene los datos territoriales reales (Comunidad de Madrid, municipios y valores de consumo).

---

## 🔍 Lo que Destaco

Este proyecto refleja mi forma de trabajar:

-  **Estructuro los datos** en objetos Java claros y reutilizables.  
-  Cuido detalles como valores vacíos y tipos numéricos.  
-  Uso las herramientas básicas de Java para tareas de procesamiento de datos reales.  
-  Integro ordenación personalizada mediante `Comparable` y `Collections.sort()` para obtener resultados útiles.

---

## 🏁 Cómo Ejecutarlo

1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/WalterPonG/sostenibilidad.git
2. Abrir la carpeta Lectura-Ficheros en Visual Studio Code.

3. Compilar y ejecutar:


```bash 
  javac *.java
  java Viviendas
```
