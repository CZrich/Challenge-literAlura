# API de Gestión de Libros - Challenge Alura Latam  

Este proyecto es una aplicación basada en consola que permite interactuar con datos de libros proporcionados por la API [Gutendex](https://gutendex.com/) y almacenarlos en una base de datos local. Forma parte de un challenge de Alura Latam.  

## Funcionalidades  

1. **Buscar un libro:**  
   - Permite buscar libros en la API de Gutendex.  
   - Si el libro ya existe en la base de datos, no se vuelve a agregar.  

2. **Mostrar todos los libros almacenados:**  
   - Lista todos los libros que han sido buscados y almacenados en la base de datos.  

3. **Estadísticas por idioma:**  
   - Muestra estadísticas de libros según el idioma (`en`, `es`, `fr`).  

4. **Autores vivos en un año específico:**  
   - Lista los autores vivos en un año determinado, basándose en los datos de los libros guardados.  

5. **Lista de todos los autores:**  
   - Muestra una lista de todos los autores de los libros almacenados.  

6. **Top 5 libros más descargados:**  
   - Muestra los cinco libros con más descargas dentro de la base de datos.  

7. **Salir:**  
   - Cierra la aplicación.  

## Tecnologías Utilizadas  

- **Java Spring Boot:** Desarrollo del backend.  
- **Spring Data JPA:** Gestión de la persistencia y consultas a la base de datos.  
- **PostgreSQL:** Base de datos utilizada para almacenar los libros y autores.  
- **Jackson:** Procesamiento de JSON para consumir la API de Gutendex.  
- **Driver de PostgreSQL:** Conexión entre la aplicación y la base de datos.  

## Requisitos Previos  

- JDK 17 o superior.  
- PostgreSQL instalado y configurado.  
- Maven para la gestión de dependencias.  

## Configuración  

1. **Clona este repositorio:**  
   ```bash
   git clone https://github.com/CZrich/Challenge-literAlura.git
   cd <NOMBRE_DEL_PROYECTO>
   ```
2. **Configura PostgreSQL:**

      Crea una base de datos llamada libros.
      Configura las credenciales de acceso en el archivo application.properties del proyecto:
  
      ```bash
      spring.datasource.url=jdbc:postgresql://localhost:5432/<NOMBRE_DE_BASE DE DATOS>
      spring.datasource.username=<TU_USUARIO>
      spring.datasource.password=<TU_PASSWORD>
      ```

3. **Ejecuta la aplicación:**
    ```bash
      mvn spring-boot:run
      ```
