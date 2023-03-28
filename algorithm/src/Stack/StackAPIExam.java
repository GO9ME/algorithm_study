package Stack;

import java.util.Stack;

// Stack에 1부터 10까지 데이터를 추가
// 꺼내서 합을 구해서 출력하기
// [출력형태]
// 스택 : 1
// 스택 : 2
// .....
// 총합 : 55
public class StackAPIExam {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		int sum = 0; // 합
		for ( int i = 1 ; i <= 10; i ++ ) {
			stack.push(i);
		}
		
		for (int i : stack) {
			System.out.println("스택:"+i);
			sum += i;
		}
		System.out.println("총합 : "+sum);
	}
}
