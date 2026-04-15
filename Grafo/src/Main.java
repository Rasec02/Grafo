public static void main(String[] args) {
    Grafo g = new Grafo();

    // Crear vértices (ajusta según el grafo del PDF)
    g.agregarVertice("A");
    g.agregarVertice("B");
    g.agregarVertice("C");
    g.agregarVertice("D");
    g.agregarVertice("E");

    // Agregar aristas (ejemplo)
    g.agregarArista("A", "B");
    g.agregarArista("A", "C");
    g.agregarArista("B", "D");
    g.agregarArista("C", "E");

    // Recorridos
    g.bfs("A");
    g.dfs("A");
}
