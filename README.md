
# Proyecto Semana 4


Este proyecto se basa en el desarrollo de un microservico con Sprinboot.
Desde este proyecto accederemos a nuestro microservico Book.
Con las dependencias de Spring Web.

Esta aplicación se ha hecho con la intención de ser ampliada a lo largo de las siguientes semanas.


## Authors

- [Sergio](https://www.github.com/sreturns)


## Tech Stack

 Java, SpringBoot, Maven


## API Reference

#### Get all Curso

```
  GET /curso
```


#### Get Curso

```
  GET /curso/{codCurso}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `codCurso`      | `Curso` | **Required**. codCurso of Curso to fetch 

#### Add Curso

```
  POST /curso
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Curso`      |  | **Required**. Type Curso object 

#### Update Curso

```
  PUT /curso
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Curso`      |  | **Required**. Type Curso object 

#### Delete Curso

```
  DELETE /curso/{codCurso}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `codCurso`      |  | **Required**. codCurso of Curso to fetch  

#### FindByPriceBetween Curso

```
  GET /curso/{minPrecio}/{maxPrecio}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `minPrecio, maxPrecio`      |  | **Required**. Type int minPrecio and maxPrecio 
