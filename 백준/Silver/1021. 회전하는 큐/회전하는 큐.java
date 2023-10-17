import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> qList = new LinkedList<>();
        Queue<Integer> findList = new LinkedList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        for ( int i = 1 ; i <= N ; i ++ ) {
            qList.add(i);
        }
        for ( int i = 0 ; i < M ; i ++ ){
            int val= sc.nextInt();
            findList.add(val);
        }

        while( !findList.isEmpty() ){
            int val = findList.poll();
            int cnt = 0 ;
            while( val != qList.peek()){
                int first = qList.poll();
                qList.add(first);
                cnt ++;
            }
            result += Math.min(cnt, qList.size() - cnt );
            qList.poll();
        }
        System.out.println(result);




    }
}