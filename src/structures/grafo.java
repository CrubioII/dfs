package structures;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class grafo<T> {


        public void dfs(vertex<T> startVertex) {
            Deque<vertex<T>> stack = new LinkedList<>();
            stack.push(startVertex);
            while (!stack.isEmpty()) {
                vertex<T> current = stack.pop();
                if (!current.isVisited()) {
                    current.setVisited(true);
                    System.out.println(current);
                    current.getNeighbors().forEach(stack::push);
                }
            }
        }

        //Busca los paths, usando esto voy a encontrar los paths posibles
        public List<List<vertex<T>>>findallPaths(vertex<T> inicial, vertex<T> end){
            List<List<vertex<T>>> paths = new ArrayList<>();
            List<vertex<T>> currentPath = new ArrayList<>();
            helper(paths,currentPath,inicial,end);
            return paths;
        }
        //este método pa tran
        private void helper(List<List<vertex<T>>> paths, List<vertex<T>> currentPath,vertex<T> current, vertex<T> end ){
        currentPath.add(current);
        if (current.equals(end)){
            paths.add(new ArrayList<>(currentPath));
        }
        else {
            for(vertex<T> neighbor :current.getNeighbors() ){
                if (!currentPath.contains(neighbor)){
                    helper(paths,  currentPath, neighbor, end);
                }

            }
        }
        currentPath.remove(currentPath.removeLast());
        }

    }




