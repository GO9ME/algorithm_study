import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int N = sc.nextInt();
		int result = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if(x == 0) {
				stack.pop();
			}else {
				stack.push(x);
			}
		}
		
		while(!stack.isEmpty()) {
			result += stack.peek();
			stack.pop();
		}
		System.out.println(result);
	}
}