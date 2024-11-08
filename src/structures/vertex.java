package structures;

import java.util.ArrayList;
import java.util.List;

public class vertex<T> {
    private T data;
    private boolean visited;
    private List<vertex<T>> neighbors;

    public vertex(T data) {
        this.data = data;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
