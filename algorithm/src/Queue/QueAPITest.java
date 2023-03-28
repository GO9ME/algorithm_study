package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
	rear : 큐의 가장 끝쪽 데이터가 삽입된 위치
	front : 큐의 가장 앞쪽 데이터가 삽입된 위치	
	add : 큐의 rear에 데이터를 삽입
	poll : front 부분에 저장된 데이터를 삭제
	peek : 큐의 맨 앞 부분 즉 , front에 데이터를 확인
*/

public class QueAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue.add(1)); // 저장공간이 있으면 true, 없으면 exception을 발생
		System.out.println(queue.offer(2)); // 저장공간이 있으면 true, 없으면 false를 발생
		queue.offer(3);
		queue.offer(4);
		System.out.println("queue.peek() : " + queue.peek());
		System.out.println("queue.isEmpty() : " + queue.isEmpty());
		System.out.println("queue.size() : " + queue.size());
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.remove() : " + queue.remove());
		System.out.println("queue.size() : " + queue.size());
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.remove() : " + queue.remove());
		System.out.println("queue.size() : " + queue.size());
	}

}
