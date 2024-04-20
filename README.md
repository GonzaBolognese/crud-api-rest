# API REST de Gestión de Productos

Esta API REST desarrollada en Java con Spring Boot permite la gestión básica de productos. Utiliza Spring Boot, Hibernate y PostgreSQL para almacenar y manipular los datos de productos.

## Endpoints

### Obtener todos los productos

GET /productos/all

Este endpoint devuelve una lista de todos los productos almacenados en la base de datos.



### Obtener un producto por ID

GET /productos/{id}

Este endpoint devuelve un producto específico basado en su ID.



### Crear un nuevo producto

POST /productos/create

Este endpoint permite crear un nuevo producto enviando los datos en el cuerpo de la solicitud en formato JSON.



### Crear varios productos a la vez

POST /productos/createAll

Este endpoint permite crear múltiples productos a la vez enviando una lista de productos en formato JSON en el cuerpo de la solicitud.



### Actualizar un producto

PUT /productos/{id}

Este endpoint permite actualizar los detalles de un producto existente basado en su ID. Se deben proporcionar los nuevos datos del producto en formato JSON en el cuerpo de la solicitud.



### Eliminar un producto

DELETE /productos/{id}

Este endpoint permite eliminar un producto existente basado en su ID.



## Uso

Para utilizar esta API, asegúrate de tener instalado Java, Spring Boot y PostgreSQL en tu sistema. Además, necesitarás configurar adecuadamente la base de datos PostgreSQL y ajustar las configuraciones de conexión en el archivo `application.properties`.

Una vez configurado, puedes ejecutar la aplicación y acceder a los diferentes endpoints utilizando un cliente HTTP o un navegador web.



## Autor

Este proyecto fue desarrollado por Gonzalo Bolognese.
