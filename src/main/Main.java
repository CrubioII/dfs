package main;
import java.util.List;

import structures.vertex;
import structures.dfs;

public class  Main{
    public static void main(String[] args) {

        vertex<Integer> v0 = new vertex<>(0);
        vertex<Integer> v1 = new vertex<>(1);
        vertex<Integer> v2 = new vertex<>(2);
        vertex<Integer> v3 = new vertex<>(3);
        vertex<Integer> v4 = new vertex<>(4);
        vertex<Integer> v5 = new vertex<>(5);
        vertex<Integer> v6 = new vertex<>(6);

        v0.setNeighbors(List.of(v1, v5, v6));
        v1.setNeighbors(List.of(v3, v4, v5));
        v4.setNeighbors(List.of(v2, v6));
        v6.setNeighbors(List.of(v0));

        dfs<Integer> dfs = new dfs<>();
        dfs.traverse(v0);
        List<List<vertex<Integer>>> paths = dfs.findallPaths(v0, v6);

        System.out.println("All paths from vertex 0 to vertex 6:");

        for (List<vertex<Integer>> path : paths) {
            System.out.println(path); }
    }
}