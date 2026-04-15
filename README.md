Proyecto: Implementación de Grafos en Java
Descripción

Este proyecto implementa un grafo utilizando listas de adyacencia en Java. Incluye los algoritmos clásicos de recorrido:

Búsqueda en Anchura (BFS)
Búsqueda en Profundidad (DFS)

El objetivo es modelar relaciones no lineales entre nodos y recorrer el grafo mostrando el orden de visita.

Estructura del Programa:

El programa contiene una clase principal:

Grafo:
-Almacena los vértices y sus relaciones mediante una lista de adyacencia.
-Implementa los métodos:
 -agregarVertice
 -agregarArista
 -bfs
 -dfs

Representación del Grafo:

Se utiliza una estructura de tipo clave-valor:

-Clave: vértice (String)
-Valor: lista de vértices adyacentes

Esto permite representar eficientemente las conexiones entre nodos.

Funcionalidades:
-Crear vértices
-Crear aristas (grafo no dirigido)
-Recorrer el grafo con BFS (usa cola)
-Recorrer el grafo con DFS (usa recursividad)
-Evitar ciclos mediante control de nodos visitados

Cómo ejecutar:

1-Compilar el programa:
javac Grafo.java

2-Ejecutar:
java Grafo

Ejemplo de uso:

Si el grafo contiene las aristas:
A-B, A-C, B-D, C-E

Salida esperada:

BFS: A B C D E
DFS: A B D C E

Notas:
-El orden del recorrido depende del orden en que se agregan los vecinos.
-El grafo puede adaptarse fácilmente a dirigido modificando el método de inserción de aristas.
-Se utilizan estructuras estándar de Java para simplificar la implementación.
