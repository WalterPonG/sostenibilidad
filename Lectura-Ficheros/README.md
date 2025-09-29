# Viviendas por Intensidad de Uso

Proyecto en **Java** que analiza un fichero CSV de consumo eléctrico en municipios de Madrid.

## Estructura

- **Territorio**  
  Representa cada municipio con su nombre, código y valor de mediana.  
  Permite compararlos entre sí para ordenarlos de mayor a menor.

- **Viviendas**  
  Lee el CSV, convierte los valores nulos en `0`, crea la lista de territorios, los ordena y muestra los 3 con mayor mediana.

## Ejemplo de salida
Territorio: Tielmes | Código: 1467 | Valor: 3741
Territorio: Nuevo Baztán | Código: 1006 | Valor: 3663
Territorio: Torres de la Alameda | Código: 1548 | Valor: 3607

