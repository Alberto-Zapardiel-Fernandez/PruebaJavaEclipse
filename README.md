# PruebaJavaEclipse
Proyecto de una centralita telefónica, la cual gestiona las llamadas entrantes.
Estas pueden ser Locales o Provinciales.
Las locales tienen un precio fijo de 15€ por segundo.
Las llamadas Provinciales tienen 3 franjas predefinidas:

<ol>
  <li>Franja 1 con un precio de 20€</li>
  <li>Franja 2 con un precio de 25€</li>
  <li>Franja 3 con un precio de 30€</li>
</ol>
Tiene un método para realizar la llamada, el cual comprueba el precio de la franja.
Además le suma la duración para obtener el precio total

La clase Llamada es una clase abstracta de la cual heredan Local y Provincial.

La clase CentralitaTest es el punto de inicio de la aplicación.
