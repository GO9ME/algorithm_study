package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class test_2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i <= num; i++) {
			queue.add(i);
		}
		int result = fn(queue);
		System.out.println(result);
	}

	public static int fn(Queue<Integer> q) {
		int result = 0;
		int size = 0;
		while (true) {
			size = q.size();
			if (size == 1 ) {
				result = q.poll();
				break;
			} else {
				q.poll();
				int num = q.poll();
				q.add(num);
			}
		}
		return result;
	}

}
