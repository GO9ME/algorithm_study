import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sizeOfStack = 4;
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(sc.next()));
        }

        List<Stack<Integer>> stacks = new ArrayList<>();

        // 스텍 초기화
        for ( int i = 0 ; i < sizeOfStack; i ++ ) {
            stacks.add(new Stack<>());
            stacks.get(i).push(0);
        }

        String result = getResult(N, nums, sizeOfStack, stacks);
        System.out.println(result);

    }

    private static String getResult(int N, List<Integer> nums, int sizeOfStack, List<Stack<Integer>> stacks) {
        String result = "YES";
        int num;
        for ( int i = 0 ; i < N ; i ++ ) {
            num = nums.get(i);
            for ( int j = 0 ; j< sizeOfStack ; j ++ ) {
                if ( stacks.get(j).peek() < num){
                    stacks.get(j).push(num);
                    num = 0;
                    break;
                }
            }
            if ( num != 0 ){
                result = "NO";
            }
        }
        return result;
    }
}
