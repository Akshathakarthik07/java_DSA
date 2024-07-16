package JPQP;
import java.util.*;

public class FindReachability {
    public static boolean bfsofGraph(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        if (src == dest) {
            return true;
        }
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited.add(src);

        while (!q.isEmpty()) {
            int node = q.poll();
            List<Integer> neighbors = adj.get(node);

            for (int neighbor : neighbors) {
                if (neighbor == dest) {
                    return true;
                }
                if (!visited.contains(neighbor)) {
                    q.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(4);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(3).add(1);
        adj.get(4).add(0);
        boolean ans = bfsofGraph(adj, 0, 3);
        System.out.println(ans);
    }
}
