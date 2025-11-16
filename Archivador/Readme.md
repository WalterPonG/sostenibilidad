# Albuaves

Albuaves es un pequeño proyecto mascota ( *pet-project* ) , que pretende
de una manera sencilla plantear al alumnado todas las partes implicadas
en una Solución Software basada en la arquitectura *Cliente-Servidor*.

Por una parte tendremos una base de datos en `SQLite` que editaremos de manera
sencilla con `sqlitebrowser` y que usaremos como persistencia en el lado 
del servidor.

Serviremos una API Rest, programada en PHP, por ahora se plantea con dos únicas
funciones: 

### Listar todas las aves

```java
LADO CLIENTE
cd ./java
javac -cp json-202517.jar SearchBirdsAPI.java
java -cp json-202517.jar SearchBirdsAPI.java
--------------------------------------------
LADO SERVIDOR
Desde la carpeta principal
run ./run-api-server.sh
en navegador: localhost:9191/api.php
```
### Listar un ave a partir de un `id_ave` dado
```bash
    Levantamos servidor, desde la carpeta principal
    run ./run-api-server.sh
    Buscamos un ave por id 1 (ejemplo)
    localhost:9191/api.php?bird_api=1
```


## Software Requerido

* sqlitebrowser
* php-sqlite3

### Comandos para la instalación en máquinas de desarrollo

```bash
sudo apt update; sudo apt install sqlitebrowser php-sqlite3
```

## URLs de interés

### JSON.org

Podemos encontrar más información acerca de JSON.org en la página de 
GitHub del desarrollador principal.

https://github.com/stleary/JSON-java
