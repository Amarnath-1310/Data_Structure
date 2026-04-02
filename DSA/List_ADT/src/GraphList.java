import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphList {
    static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }

        // List implementation space complexity for directed Graph O(E)
        // List implementation space complexity for Undirected Graph O(2E)

//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();       // <!-- Undirected graph -->
//            list.get(u).add(v);
//            list.get(v).add(u);
//        }


//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();       // <!-- Directed graph -->
//            list.get(u).add(v);
//        }


        System.out.println(list);
    }
}
