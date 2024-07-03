# Spring 1

Con el fin de seguir los paradigmas de responsabilidad única usaremos interfaces

- Evento: Es la interface que implementaemos en nuestros eventos según las condiciones

- Condición: Es la interface que usaremos para crear nuestras clases con las condiciones medio ambientales
![alt text](image-3.png)

- Condiciones ambientales:
    - lluvia fuerte --> Alerta lluvia intensa
    - vientoo fuerte --> Alerta viento fuerte
    - temperatura alta y humedad alta --> Activar sistema de riego
    - Viento fuerte y temperatura alta --> Cerrar persianas
    - Presion baja --> Notificacion a usuarios sobre poca presión

## Clases

La estructura de las clases es muy similar debido a que implementamos desde la interfaz.

- Atributos: 
    -  Umbrales: existen 2 umbrales, el Alto y bajo, haciendo referencia a los puntos criticos o limite para indicar un estado de la condición del ambiente
- Metodos:
    - Existen 2 métodos importantes, isFar que indica si es una medición muy superior y isnotEnough como una medición por debajo del estandar

- Lluvia 

![alt text](image-4.png)

- Presion 

![alt text](image-5.png)

- Humedad

![alt text](image-6.png)

- Viento 

![alt text](image-7.png)

- Temperatura 

![alt text](image-8.png)

### SistemaClima
Esta es la clase principal donde todas clases se utilizan y se relacionan

- Atributos: Existen 5 atributos referido a cada medición
![alt text](image-15.png)

- Método: Existe un método DefinirEventos que según nuestras mediciones cumplan o no condiciones se agregaran eventos al sistema
![alt text](image-14.png)
### Eventos 

En los siguientes eventos se define el estilo mensaje que se mostrará, los métodos son muy similares

- Automatico

![alt text](image-19.png)

- Alertas

![alt text](image-20.png)

- Notificaciones

![alt text](image-21.png)
## Tests

Se crearon Tests para cada clase, de las 5 condiciones.
Estos tests son básicos y prácticamente los mismos pero evalúan los rangos en los que nuestros parámetros. Como se puede apreciar pasan todos

- Lluvia 

![alt text](image-10.png)

- Presion 

![alt text](image-11.png)

- Humedad

![alt text](image-9.png)

- Viento 

![alt text](image-13.png)

- Temperatura 

![alt text](image-12.png)

### Stubs

Usaremos stubs en la clase principal, osea el SistemaClima

Como se definieron 5 escenarios para cada evento, con la ayuda de stubs verificaremos que eso se cumpla 
- Caso lluvia intensa, Caso Viento Intenso
Usaremos nuestros parámetros para simular los escenarios reales y de ser correcto nuestra clase debería de retornarnos un Array que contenga nuestro evento en particular
![alt text](image-16.png)

- Caso Alta Temperatura  y alta Humedad

De igual manera se testea estos escenarios
![alt text](image-17.png)

- Caso Notificación 

Finalmente testeamos el caso de la notificación
![alt text](image-18.png)

### Fakes

Se crea la clase FakeNotificaciones para simular el envio de notificaciones a usuarios

- Atributos: se tiene un mensaje y un array de usuarios
![alt text](image-23.png)

- Metodos : Se tiene getMensaje para agregar los usuarios al mensaje final
![alt text](image-22.png)

#### Test

Testeamos la correcta creación del mensaje con todos los usuarios ingresados, posteriormente verificamos con assertTrue la correcta ejecución
![alt text](image-24.png)


## Métricas de calidad

![alt text](image-2.png)

![alt text](image.png)

![alt text](image-1.png)