import java.util.Arrays;
import java.util.Scanner;

public class GraphMatrix {
    static void main(String[] args) {
        int n,m,u,v;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] adj = new int[n+1][n+1];

        // We can Implement of graph in two ways
        // 1) Adjacent Matrix (Worst approach O(n * n))
        // 2) List with Map (Best approach O(2E))

        // Space complexity for adjacent matrix
        // It's take both directed and undirected graph for O(n * n)

//        for (int i = 0; i < m; i++) {
//            u = sc.nextInt();
//            v = sc.nextInt();           // <!-- Undirected graph -->
//            adj[u][v] = 1;              // <!-- Default weight 1 -->
//            adj[v][u] = 1;
//        }


//        for (int i = 0; i < m; i++) {
//            u = sc.nextInt();
//            v = sc.nextInt();
//            int wt = sc.nextInt();     // <!-- Weighted Undirected graph -->
//            adj[u][v] = wt;
//            adj[v][u] = wt;
//        }

//        for (int i = 0; i < m; i++) {
//            u = sc.nextInt();
//            v = sc.nextInt();          // <!-- Directed graph -->
//            adj[u][v] = 1;
//        }

//        for (int i = 0; i < m; i++) {
//            u = sc.nextInt();
//            v = sc.nextInt();
//            int wt = sc.nextInt();     // <!-- Weighted directed graph -->
//            adj[u][v] = wt;
//        }

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(adj[i]));
        }
    }
}
