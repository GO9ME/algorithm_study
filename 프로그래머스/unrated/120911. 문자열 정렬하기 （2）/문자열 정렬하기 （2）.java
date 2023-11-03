import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
		String answer = "";
		String arr[] = Arrays.stream(my_string.toLowerCase().split("")).sorted().toArray(String[]::new);
		for(String s : arr) {
			answer += s;
		}
		return answer;
	}
}