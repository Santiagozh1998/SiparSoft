# SiparSoft

# Para iniciar la aplicación abriendo desde carpeta compartida:
1. Abrir pgAdminIII
2. Crear una base de datos que se llame 'inventario' y presionar createScript
3. Copiar y pegar lo que está en inventario.sql
4. Abrir el ejecutable del servidor
5. Digitar usuario y contraseña que tenga predeterminado en su computador
en nuestro caso es usuario: postgres, contraseña: 1234
6. Iniciar conexión
7. Abrir el ejecutable del cliente
8. Digitar 1234 en usuario y 1234 en contraseña, iniciar sesión
9. Tiene a la mano el menú con opciones abierto para navegar

# Para inciar aplicación descargando de github
## Descargar el proyecto en su computador
```
git clone https://github.com/Santiagozh1998/SiparSoft
```
## Configurar base de datos
1- Abrir pgAmin y crear una base de datos con el nombre 'inventario' e Importar la base de datos de nuestro proyecto
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
2- Ingresar en el servidor usuario y contraseña de su configuración postgres y abrir uno o varios clientes para probar la aplicación
```
cd ..
cd EjecutableProyecto
SiparSoft.jar
```
4- Para probar la aplicación digite en el inicio de sesión -> Usuario: 1234 | Contraseña: 1234

