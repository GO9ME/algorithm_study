package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class test_10828 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			sb.append(fn(br.readLine())+"\n");
		}

		System.out.println(sb);
	}

	public static String fn(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c == '(') {
				stack.push(c);
			} else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}