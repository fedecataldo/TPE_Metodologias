# Investigación sobre bases de datos

La necesidad de una base de datos para nuestra aplicación es de suma importancia ya que necesitaremos que se puedan almacenar los datos que el usuarios ingreso para su registración. Cuando el usuario quiera realizar una acción en la aplicación deberá de loguearse antes y si el usuario existe lo encontrará en la base de dato de lo contrario se le pedirá que se registre para poder almacenar sus datos en nuestra base.

A su vez también deberemos de almacenar las coordenadas de los planes que tiene cada viaje para que cuando un usuario quiera ver las ubicaciones de los planes reservados, se puedan visualizar en el mapa con las coordenadas guardadas en la base.

A continuación se verán dos tipo de base de datos(SQL y NoSQL) con su características, ventajas y desventajas de cada uno.

# característica, ventajas y desventajas

## Mysql

Lleva en el mercado desde 1995 ahora propiedad de Oracle. Es de código abierto escrito tanto en C como en C++, es compatible con prácticamente cualquier sistema operativo. Esta solución es ideal para usuarios internacionales, ya que el servidor puede ofrecer a los clientes mensajes de error en múltiples idiomas y cuenta con soporte para distintos conjuntos de caracteres.

### Ventajas:

- Verificación basada en host (analiza diferentes áreas para determinar el uso incorrecto como actividades maliciosas o abusivas dentro de la red) o algunas intrusión (violaciones desde afuera).
- Puede usarse aunque no haya ninguna red disponible.
- Sistema flexible de privilegios y contraseñas.
- Cifrado de seguridad de todo el tráfico de contraseñas.
- La biblioteca se puede integrar en aplicaciones independientes.
- Ofrece el servidor por separado para entornos con redes de cliente/servidor.
- Rapido procesos de selección, inserción y actualización.

### Desventajas:

- Un gran porcentaje de las utilidades de MySQL no están documentado.
- Difícil de escalar.
- Problemas de estabilidad.
- No es un desarrollo impulsado por la comunidad.

## MongoDB

Es un sistema de base de datos noSql, orientado a documentos y código abierto. En lugar de guardar los datos en tablas, tal y como se hace en las bases de datos relacionales, este guarda estructuras de datos con un esquema dinámico, haciendo que la la integración de los datos en ciertas aplicaciones sea mas rapido y facil.

###


### **Ventajas:**

- Validación de documentos.
- Motores de almacenamiento integrado.
- Menor tiempo de recuperación ante fallas.

### **Desventajas:**

- No es una solución adecuada para aplicaciones con transacciones complejas.
- No tiene un reemplazo para las soluciones de herencia.
- Aún es una tecnología joven.

Si bien ambas bases de datos son compatible con aplicaciones para android se va a optar por mongoDB por encima de MySQL ya que la aplicación está enfocada a los usuarios que son dueños de empresas de viajes que pueden tener transporte nacionales como internacionales, eso quiere decir que se estará manejando grandes cantidades datos que deberán de tener una velocidad rápida de escritura/lectura que se pueden manejar mejor en mongoDB .