package JPQP;

public class Maximum_Weight_Node {
    public static void main(String[] args) {
        int N = 23;
        int[] edges = {4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            if (edges[i] != -1) {
                weights[edges[i]]++;
            }
        }
        int maxWeight = -1;
        int maxNode = -1;

        for (int j = 0; j < N; j++) {
            if (weights[j] > maxWeight) {
                maxWeight = weights[j];
                maxNode = j;
            }
        }

        System.out.println("Node with maximum weight: " + maxNode);
    }
}
