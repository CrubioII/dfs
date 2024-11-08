package main;
import java.util.ArrayList;
import java.util.List;

import structures.vertex;
import structures.grafo;

public class  Main{
    public static void main(String[] args) {
        List<vertex> graph = new ArrayList<>() ;
        //acá se definen los vértices
        vertex<Integer> v0 = new vertex<>(0);
        graph.add(v0);
        vertex<Integer> v1 = new vertex<>(1);
        graph.add(v1);
        vertex<Integer> v2 = new vertex<>(2);
        graph.add(v2);
        vertex<Integer> v3 = new vertex<>(3);
        graph.add(v3);
        vertex<Integer> v4 = new vertex<>(4);
        graph.add(v4);
        vertex<Integer> v5 = new vertex<>(5);
        graph.add(v5);
        vertex<Integer> v6 = new vertex<>(6);
        graph.add(v6);
        //Acá se definen las direcciones de los vértices
        v0.setNeighbors(List.of(v1, v5, v6));
        v1.setNeighbors(List.of(v3, v4, v5));
        v4.setNeighbors(List.of(v2, v6));
        v6.setNeighbors(List.of(v0));

        grafo<Integer> dfs = new grafo<>();
        //recorrido por profundidad
        dfs.dfs(v0);


        List<List<vertex<Integer>>> paths1 = dfs.findallPaths(v0, v6);

        System.out.println("All paths from vertex 0 to vertex 6:");
        public int totalPaths ()
        for (List<vertex<Integer>> path : paths1) {
            int countP = 0;
            System.out.println(path);
            countP=+ countP;
            System.out.println("Total paths yet"+ countP);

        }



        List<List<vertex<Integer>>> pathss = dfs.findallPaths(v6, v0);



    }
}