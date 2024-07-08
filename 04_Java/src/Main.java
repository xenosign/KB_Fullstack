import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] visited;
    public static int[][] graph;
    public static int targetX, targetY;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        targetY = Integer.parseInt(st.nextToken());
        targetX = Integer.parseInt(st.nextToken());

        int startX = 1, startY = 1;
        visited = new boolean[targetY + 1][targetX + 1];
        graph = new int[targetY + 1][targetX + 1];

        for (int i = 1; i <= targetY; i++) {
            String l = br.readLine();
            for (int j = 1; j <= targetX; j++) {
                if (l.charAt(j - 1) == '1') {
                    graph[i][j] = 1;
                }
            }
        }

        bfs(startX, startY);

        for (int i = 1; i <= targetY; i++) {
            for (int j = 1; j <= targetX; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(graph[targetY][targetX]);
    }

    private static void bfs(int startX, int startY) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY));
        visited[startY][startX] = true;
        graph[startY][startX] = 1;

        while (!queue.isEmpty()) {
            Point nowPoint = queue.poll();
            int x = nowPoint.x;
            int y = nowPoint.y;
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX >= 1 && nextX <= targetX && nextY >= 1 && nextY <= targetY
                        && graph[nextY][nextX] == 1
                        && !visited[nextY][nextX]) {
                    queue.offer(new Point(nextX, nextY));
                    visited[nextY][nextX] = true;
                    graph[nextY][nextX] = graph[nowPoint.y][nowPoint.x] + 1;
                }
            }
        }
    }
}