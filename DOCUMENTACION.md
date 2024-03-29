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

Hay varias licencias en el mundo del software.

Las licencias sirven para controlar el uso que se le da al software. 

La licencia MIT (Massachusetts Institute of Technology) garantiza, a cualquier persona que consiga una copia del software, usarlo, modificarlo, publicarlo, distribuirlo, sublicenciarlo y venderlo.

La licencia GNU GPL garantiza al usuario final la libre ejecución, estudio, modificación y distribución del software. Todas las copias de un software bajo esta licencia, deberán pertenecer también a la misma.

La diferencia entre la licencia MIT y la GNU GPL es que la MIT no restringe el uso comercial, mientras que la GPL garantiza que cualquier software que use código, que pertenezca a una licencia GPL, debe ser también código abierto.

La licencia Apache permite el uso comercial, la modificación, distribución, sublicenciamiento, uso privado y uso de patentes sobre el software.

Con esto surge una pregunta: ¿Qué pasa si no le asigno una licencia a mi software?

Cuando creas un programa, éste se encuentra bajo copyright exclusivo por defecto. Esto significa que a menos que incluyas una licencia que lo niegue, nadie puede copiar, distribuir o modificar tu programa sin estar a riesgo de consecuencias legales.

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
# Parte 2

**Creación de ramas. Recuerda que en la rama master/main sólo debería existir la versión acabada del producto.**

Podemos crear la branch con $ git branch nombrerama o crearla y hacerle checkout con $ git checkout -b nombrerama. Con esto creamos una rama en el git local. Cada uno de nosotros ha creado una rama en el repositorio remoto para demostrar participación

**Proceso de merge entre ramas.**

Para mergear dos ramas, ejecutamos el comando $ git merge en la rama a la que le queremos implementar la otra.

Ejemplo de Izan mergeando la rama valentine en la rama dio.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/d2f57e61-6ff8-44f1-9fb2-96b271618502)

**Resolución de conflictos en un merge**

Los conflictos en un merge aparecen cuando intentas hacer merge entre dos ramas que tienen contenido conflictivo. Por ejemplo, si quieres mergear main y dev: en la rama main tienes en el README.md la frase “Hola mundo” y en la rama dev tienes la frase “Hola planeta” el comando merge no sabrá cuál quieres conservar, por lo que te saltará un mensaje que te pedirá elegir manualmente con cuál quedarte.

Te saldrá una rama temporal llamada (main/MERGE). En su README.md tendremos lo siguiente:

<<<<<<< main

Hola mundo

=======

Hola planeta

\>>>>>>> dev;

Una vez borremos la parte que no queremos conservar, guardamos. Hacemos un $ git add y un $ git merge y ya podríamos hacer el merge sin problemas.

Nota: Los conflictos en un merge solo ocurren cuando se mergean dos ramas con líneas evolutivas distintas, es decir, que si el merge (fast-forward) sólo añade cosas a la rama objetivo, no hay posibilidad de conflicto. 

**Diferencias entre un pull y un fetch.**

El pull descarga el repositorio y hace un merge directamente.

El fetch en cambio no es tan radical. Sólo te muestra los cambios que han habido en el remoto.

**¿Cómo podríamos volver a una versión anterior del proyecto?**

Los commits no son más que snapshots del repositorio en un cierto momento. Con git revert se pueden eliminar los cambios en el repositorio realizados en el commit indicado. Para ello usamos $ git revert id_commit siendo id_commit el identificador que se le atribuye al commit que queremos revertir.

Ejemplo de identificador del commit en el que corrigo un typo en el archivo DOCUMENTACION.md:

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/6c9df6d8-3be2-47d3-a655-d8e644c82d68)

**¿Podemos añadir seguridad de alguna forma a nuestro repositorio remoto?**

Podemos crear un SECURITY.md que explique como reportar vulnerabilidades a los contribuidores del proyecto. Esto se hace desde Security y Policy dándole a Start setup.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/2fdbbc93-9b6e-4c87-ae3f-b6305bd0a13b)

Una vez dentro, escribimos las instrucciones para reportar vulnerabilidades y hacemos un commit para guardar cambios.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/5685c581-f7ac-490f-a9f4-a4533c183a11)

Otra cosa que podemos hacer es añadir reglas de protección de ramas.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/5802f002-186e-4d07-957f-611f477271d5)

Tras darle a añadir reglas de protección, podremos elegir qué requisitos y protecciones aplicar a cada rama.

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/bc57d5df-5194-4b99-b790-3ba9a1beefb5)


***

# Parte 3

**¿Qué es una Pull Request? ¿Cómo podriamos realizar una? ¿Qué utilidad tiene?**

Es una propuesta para mergear una serie de cambios de una rama a otra. En las pull request se ven las diffs entre las ramas.

La pull request sirve para revisar qué es lo que se ha cambiado en la rama y revisarlo antes de mergearlo con la rama base.

Las pull request se pueden realizar desde Github en el apartado Pull requests del repositorio. 

![image](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/3c1b2765-dbbb-49dd-ab86-59e9752f1a1d)

Luego se le da a New pull requests y se comenta los cambios que ofrece la pull request y se discute la posibilidad de hacer un merge con el encargado de los pull request.



Para aceptar la pull request, uno tiene que ser colaborador del proyecto y cumplir con las Rulesets, si es que hay alguna. 

![Captura desde 2024-01-09 18-58-39](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/dd98e739-f8ca-47e2-829d-28b59bbb4792)

Después de darle a Merge pull request se te pide una confirmación.

Una vez confirmada, Github te informará de que se han mergeado

![Captura desde 2024-01-09 19-03-58](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153014626/bde71fd1-1500-4c0d-b1f9-376f5c4d7ae0)

Tras el mergeo, tendrás la elección de borrar la branch usada o conservarla. 

## GUI GitKraken ejemplos

Clonamos nuestro repositorio en gitkraken después de iniciar sesión con mi cuenta de GitHub (Izan)

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/1909fc71-88a7-42ed-a21b-11a8f534bd6a)

Para hacer un commit en gitkraken, he entrado a un archivo que teníamos creado en la rama “dio” y he añadido texto a lo que ya había antes:

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/41ea7d06-a45d-454e-9083-588ed16f1b92)

Después le he dado al botón de “Stage File” de arriba a la derecha para guardar los cambios, después he añadido el mensaje del commit abajo a la derecha y le he dado a commit changes to 1 file: 

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/a5261c39-c494-44d9-9bcd-92a5d23087ce)

Para hacer un push Leo ha modificado lo que había dentro del README de su rama, ha hecho el respectivo commit y le ha dado al botón de push

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/88675db0-236f-46f2-afac-994cb3d349b2)

Los push se hacen desde Local

Para hacer el pull, es tan simple como darle al botón de pull arriba, lo hemos hecho en la rama “valentine”

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/de05a033-650c-4165-ae93-07cc737b9c70)

### Gestión de ramas:

Mergear:

Leo Mergeó la rama dio con la rama ChaniBranch, se hace clickeando una rama y arrastrándola hacia la rama con la que deseemos hacer el merge, sin embargo, hubo un conflicto a la hora de mergear.

Resolución de conflictos:

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/98eb1441-8576-4432-8c1d-f691b1673164)

Clickeando el botón de mark all resolved nos manda al archivo con todo solucionado

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/ae2f18a0-456d-48dd-aa2b-4efdf22cbb6d)

por lo tanto, el merge se ha conseguido realizar.

Eliminar:

Para eliminar una rama, le damos click derecho y delete (en este caso) “valentine”

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/a2f14889-9702-43bb-9605-e7f0c55124bd)

Creación:

para crear una rama desde gitkraken seleccionamos la rama base desde la que crearemos la nueva rama, después le damos al botón “branch” de arriba

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/16713a9d-dbeb-4ac3-9c53-c38c1b6265f0)

después introducimos un nombre y ya tendríamos la rama creada

![imagen](https://github.com/FranciscoKeiji/PajarraCrusaders/assets/153659311/e71a1709-6475-4d60-93b4-383be26938c3)

**Pon ejemplos de conflictos que te hayan surgido durante la resolución de este proyecto.**

Cuando estabamos creando las ramas de cada uno para demostrar que hemos participado entre todos en el proyecto, se nos olvidó crear la rama dev antes de empezar. Así que la hemos creado después.

También he tenido que ver varios tutoriales para entender de verdad lo visto en clase. Al final sigo sin entender algunas cosas, pero bueno.

