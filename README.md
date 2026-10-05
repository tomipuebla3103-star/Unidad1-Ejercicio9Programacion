<img width="832" height="216" alt="image" src="https://github.com/user-attachments/assets/d450fd01-94ca-4814-9f2c-a6288037b37b" />
 Gestión de Plan de Hosting Web

 Descripción

El programa utiliza una clase llamada `PlanHosting` para guardar la información de una cuenta de hosting y controlar el espacio de almacenamiento utilizado.

También permite subir archivos y comprobar que no se supere el espacio máximo disponible.

 Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos.
 Constructores.
 Métodos.
 Validación de datos.
 Control de límites.
 Uso de condiciones.

 Clase PlanHosting

La clase `PlanHosting` tiene los siguientes atributos:

 `nombreDominio`: nombre del dominio de la página web.
 `capacidadMaximaGB`: espacio máximo disponible en el plan.
 `espacioOcupadoGB`: espacio que se está utilizando actualmente.

 Constructor

El constructor recibe los datos necesarios para crear un plan de hosting.

También se realizan las validaciones necesarias para evitar valores incorrectos en la capacidad y en el espacio ocupado.

 Métodos

`subirArchivos(double pesoGB)`

Permite agregar espacio ocupado al hosting cuando se suben archivos.

Antes de agregar el archivo, se comprueba que el nuevo espacio ocupado no supere la capacidad máxima.

Si hay espacio suficiente, el archivo se agrega normalmente.

Si se supera el límite, se muestra una alerta por consola y el archivo no se agrega.

 Ejemplo

En el `main` se crea un plan de hosting con una capacidad determinada.

Después se intentan subir varios archivos, incluyendo algunos que hacen que se supere el límite disponible.

El programa muestra por consola si cada archivo pudo subirse o si se superó la capacidad máxima.
