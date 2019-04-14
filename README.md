# SiparSoft
## Descargar el proyecto en su computador
```
git clone https://github.com/Santiagozh1998/SiparSoft
```
## Configurar base de datos
1- Abrir pgAmin y crear una base de datos con el nombre 'inventario'
2- Importar la base de datos de nuestro proyecto
```
cd SiparSoft
psql -U postgres -W -h localhost inventario < inventario.sql
```
## Arrancar el proyecto
1- Abrir el servidor: este será el que permita que la aplicación corra en distintos computadores a la vez, además se comunicará con la base de datos.
```
cd EjecutableServidor
ServidorSipar.jar
```
2- Ingresar en el servidor usuario y contraseña de su configuración postgres 
3- Abrir uno o varios clientes para probar la aplicación
```
cd ..
cd EjecutableProyecto
SiparSoft.jar
```
4- Para probar la aplicación digite en el inicio de sesión
  Usuario: 1234
  Contraseña: 1234

