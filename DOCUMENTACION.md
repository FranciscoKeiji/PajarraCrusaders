# Parte 1
**¿Cómo podemos crear un repositorio remoto?**

En el home de Github tenemos una sección para crear un nuevo repositorio remoto.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/416d9123-44d4-49b0-a2fa-5b68223b18fa)

**¿Qué es el README.md?**

El README.md es un archivo de texto en el que se explica el repositorio.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/590b160a-96a6-49aa-93e8-5ca55bfb8ce0)

**¿Qué es Markdown?**

Es un lenguaje de marcas ligero que puedes usar para formatear texto.

Esta documentación se está haciendo con el uso de Markdown

**¿Qué son y qué utilidad tienen las licencias?**

Las licencias sirven para controlar el uso que se le da al software. (p.e. La licencia GPL garantiza al usuario final la ejecución, estudio, modificación y distribución del software. El kernel de linux tiene licencia GPL)

**¿Qué es el fichero .gitignore?**

Es un fichero en el que indicamos cuáles de los archivos ignoramos en el repositorio. Los archivos que se incluyan en .gitignore no estarán incluidos en el repositorio.

**Explicar las tres formas de integrar el repo remoto en un repo local.**

Para integrar el repositorio remoto a uno local podemos utilizar tres herramientas.
git pull: realiza un git fetch en la rama local a la que apunta HEAD. Una vez descargado el contenido, ejecuta un git merge. Esta forma puede causar conflictos en el merge.

git clone: copia el repositorio remoto indicado en un repositorio local. 

git fetch: descarga commits, archivos y refs de un repositorio remoto a un repositorio local. Es un comando que te deja ver los cambios en el repositorio sin tener que hacer un merge.

**¿Cómo realizar un commit?**

Para realizar un commit usamos $ git commit -m “nombrecommit” o $ git commit y se abrirá el editor de texto para nombrar al commit.

Ejemplo de commit por parte de Leo tras editar el README.md:

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/e7c317f8-2965-489a-a750-fa650b7431ec)

**¿Cada cuanto hay que realizar un commit?**

Cuando quieras guardar el estado del repositorio. Cuando quieres guardar una versión del repositorio. 

**¿Cómo podríamos trabajar varias personas en el mismo proyecto?**

Primero hay que añadir colaboradores desde la página del repositorio en github.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/49b8325a-9319-4173-8cf9-8363e11c2027)

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/abbefa0c-d043-4b19-866d-62912b8b8be8)

Después cada colaborador tiene que clonar el repositorio remoto en su git local.

Esto se puede hacer con un $ git clone con el protocolo elegido (p.e. SSH). Podemos encontrar el comando en la página del repositorio remoto en la parte de < > Code

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/4cd2f9ee-d054-42ac-b50f-ecce7a944c63)

Y con eso, cada colaborador tendría el repositorio en su máquina. 

Ejemplo de Leo clonando el repositorio remoto al local.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/c8bf70ec-2730-4d92-8da4-c8ed7d43e479)


***

***

#Parte 3
**¿Qué es una Pull Request? ¿Cómo podriamos realizar una? ¿Qué utilidad tiene?**
Es una propuesta para mergear una serie de cambios de una rama a otra. En las pull request se ven las diffs entre las ramas.

La pull request sirve para revisar qué es lo que se ha cambiado en la rama y revisarlo antes de mergearlo con la rama base.

Las pull request se pueden realizar desde Github en el apartado Pull requests del repositorio. 

Luego se le da a New pull requests y se comenta los cambios que ofrece la pull request y se discute la posibilidad de hacer un merge con el encargado de los pull request.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/3c1b2765-dbbb-49dd-ab86-59e9752f1a1d)

**Pon ejemplos de conflictos que te hayan surgido durante la resolución de este proyecto.**

Cuando estabamos creando las ramas de cada uno para demostrar que hemos participado entre todos en el proyecto, se nos olvidó crear la rama dev antes de empezar.

También he tenido que ver varios tutoriales para entender de verdad lo visto en clase.

No hemos sabido hacer el pull request desde la terminal. Lo haremos desde github.

Siguen quedando dudas sobre las pull request así que preguntaremos de nuevo en clase.

