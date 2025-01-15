# LiterAlura - Catálogo de Libros

## Estado del Proyecto
![Badge Finalizado](https://img.shields.io/badge/Estado-en%20desarrollo-green)

![Portada del Proyecto](https://www.oracle.com/a/ocom/img/rh03-one-logo-with-slogan-lad.png)

## Índice
- [Descripción del Proyecto](#descripción-del-proyecto)
- [Objetivo](#objetivo)
- [Pasos para completar el desafio](#pasos-para-completar-el-desafío)
- [API utilizada para el proyecto](#api-utilizada-para-el-proyecto)
- [Funcionalidades](#funcionalidades)
- [Requisitos](#requisitos)
- [Configuración del proyecto](#configuración-del-proyecto)
- [Ejecución del proyecto](#ejecución-del-proyecto)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)
- [Personas Desarrolladoras del Proyecto](#personas-desarrolladoras-del-proyecto)
- [Conclusión](#conclusión)

## Descripción del Proyecto
Catálogo de Libros que ofrece interacción textual (vía consola) con los usuarios. Realizando solicitudes a una 
API de libros, manipular datos JSON, guardarlos en una base de datos para que finalmente, filtrar y mostrar los 
libros y autores de interés.

## Objetivo
Desarrollar un Catálogo de Libros que ofrezca interacción textual (vía consola) con los usuarios, proporcionando al 
menos 5 opciones de interacción. Los libros se buscarán a través de una API específica.

## Pasos para Completar el Desafío
-[x] **Configuración del Ambiente Java**
-[x] **Creación del Proyecto**
-[x] **Consumo de la API**
-[x] **Análisis de la Respuesta JSON**
-[ ] **Inserción y Consulta en la Base de Datos**
-[ ] **Exhibición de Resultados a los Usuarios**

## API utilizada para el proyecto
Para nuestro desafío actual, hemos elegido la API [Gutendex](https://gutendex.com/), la cual conserva datos de más de 70 mil libros
de la biblioteca en línea y gratuita conocida como Proyecto Gutenberg. Esta API no solo proporciona el título
y los autores, sino también información como idiomas, formato del texto y cantidad de descargas.

## Funcionalidades
1. **Buscar Libro por Título**: Permite a los usuarios buscar un libro por su nombre y registrar la información en la base de datos.
2. **Listar Libros Registrados**: Muestra todos los libros registrados en la base de datos.
3. **Listar Autores Registrados**: Muestra todos los autores registrados en la base de datos.
4. **Listar Autores Vivos en un Año Determinado**: Permite a los usuarios ver qué autores estaban vivos en un año específico.
5. **Listar Libros por Idioma**: Permite a los usuarios buscar libros por idioma (ES, EN, FR, PT).

## Requisitos
- Java 17
- Spring Boot 3.2.4
- Maven
- PostgreSQL

## Configuración del Proyecto
1. Ir a [Spring Initializer](https://start.spring.io/) y crear un proyecto Maven en lenguaje Java.
2. Seleccionar la versión de Spring Boot 3.2.4.
3. Añadir las dependencias: Spring Data JPA y PostgreSQL Driver.
4. Descargar y descomprimir el proyecto.

## Ejecución del Proyecto
1. Clonar el repositorio.
2. Configurar la base de datos PostgreSQL.
3. Ejecutar la aplicación desde la consola con el comando `mvn spring-boot:run`.

## Contribuciones
Las contribuciones son bienvenidas. Por favor, sigue los pasos a continuación para contribuir:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Personas Desarrolladoras del Proyecto
| [<img src="https://res.cloudinary.com/teepublic/image/private/s---nbI-rDU--/t_Preview/b_rgb:ffffff,c_lpad,f_jpg,h_630,q_90,w_1200/v1592797350/production/designs/11557717_0.jpg" style="pointer-events: none;" width=115><br><sub>Desarrollador</sub>](https://github.com/Fede6299) |  
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|

## Conclusión
¡Gracias por revisar este proyecto! Espero que encuentres útil este Conversor de Monedas.