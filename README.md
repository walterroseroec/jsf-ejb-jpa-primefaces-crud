# CRUD en Java Web con JSF (Jakarta Server Faces), PRIMEFACES y JPA (HIBERNATE) 

En este proyecto, te muestro cómo construir un CRUD en Java Web usando Jakarta Server Faces (JSF), PrimeFaces, y JPA con Hibernate. Ideal para quienes buscan mejorar sus habilidades y aprender buenas prácticas en sus proyectos Java..

## Explicación del proyecto

Puedes ver a detalle el proyecto directamente desde mi canal de YouTube [https://youtu.be/UfVNi1pkRTw](https://youtu.be/UfVNi1pkRTw)


##  Herramientas utilizadas:
- **Java [17 o Superior]** como lenguaje de programación.
- **PostgreSQL  [12 o Superior]** como motor de la base de datos.
- **Jakarta Server Faces [4.0]** para la creación de las vistas en XHTML.
- **PrimeFaces [14.0.0]**  para el uso de componentes.
- **WildFly [27.0.0.FINAL] - [34.0.0.FINAL]** para el despliegue de aplicaciones.


## Script de la base de datos

```
CREATE DATABASE "crud-jsf";
CREATE TABLE public.usuario (
    id_usuario serial PRIMARY KEY,
    nombre character varying(50) NOT NULL,
    nick_name character varying(50) NOT NULL
);
```


---
