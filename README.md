# Pila de Estudiantes - Spring Boot

## Descripción

Proyecto desarrollado en Java utilizando Spring Boot, Maven y Spring Web para implementar una estructura de datos tipo pila aplicada a la gestión de estudiantes.

La pila utiliza exclusivamente un arreglo para almacenar los estudiantes y permite realizar las operaciones:

* Agregar
* Quitar
* Mostrar
* Tamaño

## Tecnologías utilizadas

* Java 25
* Spring Boot
* Maven
* Spring Web
* HTML
* JavaScript
* Visual Studio Code

## Estructura del proyecto


src/
└── main/
    ├── java/
    │   └── com/pila/pila/
    │       ├── PilaApplication.java
    │       ├── controlador/
    │       ├── modelo/
    │       ├── servicio/
    │       └── estructura/
    │
    └── resources/
        ├── application.properties
        └── static/
            └── index.html


## Requisitos

Para ejecutar el proyecto se necesita:

* JDK 25
* Maven 3.9 o superior
* Visual Studio Code u otro IDE
* Navegador web

## Clonar el proyecto


git clone URL_DEL_REPOSITORIO


Ingresar a la carpeta:


cd pila


## Compilar

Ejecutar:


mvn clean package


## Ejecutar

Ejecutar:


mvn spring-boot:run


También se puede ejecutar el archivo JAR generado:


java -jar target/pila-0.0.1-SNAPSHOT.jar


## Acceso

Abrir en el navegador:


http://localhost:8080


## Funcionamiento

El sistema permite registrar estudiantes dentro de una pila. La estructura trabaja bajo el principio LIFO (Last In, First Out), por lo que el último estudiante agregado es el primero en ser retirado.

### Operaciones

Agregar: inserta un estudiante en el tope de la pila.

Quitar: elimina y devuelve el estudiante ubicado en el tope.

Mostrar: permite visualizar los estudiantes almacenados.

Tamaño: devuelve la cantidad actual de estudiantes.

## Autor

Proyecto académico desarrollado para la asignatura de Estructuras de Datos.
