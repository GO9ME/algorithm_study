import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // N의 값을 입력받는다.
        int N = in.nextInt();
        // M의 값을 입력받는다.
        int M = in.nextInt();

        //입력받은 N만큼 배열 arr[]를 생성한다.
        int[] arr = new int[N];

        //N개마다 각각 값을 입력받는다.
        for (int i = 0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        int result = search(arr,N,M);
        System.out.println(result);
    }
    public static int search(int[] arr,int N,int M) {
        //결과값인 result 값 초기화
        int result =0;

        //첫번째 카드
        for (int i =0; i < N-2; i++) {
            //두번째 카드
            for(int j = i+1; j<N-1; j++) {
                //세번째 카드
                for(int k = j+1; k<N;k++) {

                    //세 수의 합 : sum
                    int sum = arr[i] + arr[j] + arr[k];

                    //딜러가 부른 숫자와 일치하면 sum return
                    if(M == sum) {
                        return sum;
                    }

                    //그렇지 않다면 최대한 근접하게 result 값에 넣어준다.
                    if((result < sum) && (sum < M)) {
                        result =sum;
                    }
                }
            }
        }
        return result;
    }
}