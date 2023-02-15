# Curso de microservicios BDG-TransUnion
Este repositorio contiene un ejemplo de implementación de microservicios con un servidor de eureka junto con _circuit braker_ para entregable del curso impartido por BDG y TransUnion.

## Tecnologias utilizadas
- Spring Boot
- Eureka
- Netlif Hystrix
- h2

## Descripción general de el proyecto
Se plantea un almacenamiento de datos sobre libros y puntuaciones de dichos libros, para esto se tiene un microservicio para interactuar con ambos casos, y se aplica hystrix para proteger el endpoint e libros, se omite el caso de punteos ya que se plantea el dejar evidente la diferencia entre tener un cortocircuito protegiendo un metodo y en otro no. 
