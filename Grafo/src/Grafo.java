import java.util.*;

public class Grafo {
    private Map<String, List<String>> listaAdyacencia;

    public Grafo() {
        listaAdyacencia = new HashMap<>();
    }

    public void agregarVertice(String vertice) {
        listaAdyacencia.putIfAbsent(vertice, new LinkedList<>());
    }

    public void agregarArista(String origen, String destino) {
        listaAdyacencia.get(origen).add(destino);
        listaAdyacencia.get(destino).add(origen);
    }

    public void bfs(String inicio) {
        Set<String> visitados = new HashSet<>();
        Queue<String> cola = new LinkedList<>();

        visitados.add(inicio);
        cola.add(inicio);

        System.out.print("BFS: ");

        while (!cola.isEmpty()) {
            String actual = cola.poll();
            System.out.print(actual + " ");

            for (String vecino : listaAdyacencia.get(actual)) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }
        System.out.println();
    }

    public void dfs(String inicio) {
        Set<String> visitados = new HashSet<>();
        System.out.print("DFS: ");
        dfsRecursivo(inicio, visitados);
        System.out.println();
    }

    private void dfsRecursivo(String vertice, Set<String> visitados) {
        visitados.add(vertice);
        System.out.print(vertice + " ");

        for (String vecino : listaAdyacencia.get(vertice)) {
            if (!visitados.contains(vecino)) {
                dfsRecursivo(vecino, visitados);
            }
        }
    }
}
