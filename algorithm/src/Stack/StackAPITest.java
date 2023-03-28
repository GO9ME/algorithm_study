package Stack;

import java.util.Stack;

// Stack
// push -> 스텍에 데이터 input
// pull -> 스텍에서 데이터 output
// top -> 스텍의 가장 위에 있는 데이터 보기
// empty -> 스텍이 비어잇는지 유무를 확인
// size -> 스텍에 저장된 데이터의 size
public class StackAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		
		// 스텍에 데이터 넣기
		stack.push("java");
		stack.push("mysql");
		stack.push("jdbc");
		
		System.out.println("스텍에 저장된 요소의 개수->"+stack.size());
		System.out.println("스텍에 저장된 요소가 있는가->"+stack.empty());
		System.out.println("스텍에 마지막으로 저장된 요소를 확인->"+stack.peek());
		System.out.println("스텍에 데이터 꺼내기->"+stack.pop());
		System.out.println("스텍에 데이터 꺼내기->"+stack.pop());
		System.out.println("스텍에 데이터 꺼내기->"+stack.pop());
		
		System.out.println("스텍에 저장된 요소의 개수->"+stack.size());
		System.out.println("스텍에 저장된 요소가 있는가->"+stack.empty());
		// 스택이 비어있는데 peek()이나 pop()을 호출하면 Exception을 발생
//		System.out.println("스텍에 마지막으로 저장된 요소를 확인->"+stack.peek());
		
	}

}
