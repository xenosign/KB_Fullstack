import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int N, M, count;
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        // 입력구간
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        // 입력구간
        count = -1;


        //<1. stack으로 구현하기>
        //1.stack을 선언한다
        //2.stack의 시작값을 넣는다.
        //3.<스택구간>
        //스택에 원소가 있으면 계속 반복한다.
        //스택에서 제일 위 원소하나를 꺼낸다.
        //꺼낸 원소가 방문한 원소인지 확인한다.
        //방문하지 않은 원소라면, 방문했다고 표시한다.
        //방문하지 않은 원소라면, 그 개수를 세준다.
        //방문하지 않은 원소라면, 해당 원소와 연결된 원소를 탐색하고,
        // 만약 그 원소가 방문하지 않았다면 그 원소를 스택에 추가한다.
        //4. 센 개수를 확인하고, 출력한다.

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        while(!stack.isEmpty()){
//            int top = stack.pop();
//            if(!visited[top]){
//                visited[top] = true;
//                sb.append(top + " ");
//                count++;
//
//                for(int i=N; i>=1; i--){
//                    if(graph[top][i] == 1 && !visited[i]) {
//                        stack.push(i);
//                    }
//                }
//            }
//        }

        //재귀로 구현하기
            dfs(1);

        System.out.println(count);
        System.out.println(sb);
    }

        public static void dfs(int start){
            //1. start를 방문하지 않았을 경우에 작동한다
            //2. 개수를 세준다
            //3. start를 방문하였다고 표시해준다.
            //4. start와 연결되어있고 방문하지 않았다면, 해당 원소를
            // dfs()를 통해 재귀호출한다.

            if(!visited[start]){
                count++;
                sb.append(start + " ");
                visited[start] = true;
                for(int i=1; i<=N; i++){
                    if(graph[start][i] == 1 && !visited[i]){
                        dfs(i);
                    }
                }
            }
        }

}