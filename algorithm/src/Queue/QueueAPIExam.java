package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPIExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		int sum = 0 ;
		for ( int i = 1 ; i <= 10 ; i ++ ) {
			queue.add(i);
		}
		
		for (int i : queue) {
			System.out.println("큐:"+i);
			sum += i;
		}
		System.out.println("총합 : "+sum);
		
	}

}
