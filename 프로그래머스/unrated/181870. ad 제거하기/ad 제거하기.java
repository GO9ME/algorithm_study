import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> strlist = new ArrayList<String>();
        
        for (String str : strArr) {
            if (!str.contains("ad")) {
                strlist.add(str);
            }
        }
        
        String[] answer = strlist.toArray(new String[strlist.size()]);
        return answer;
    }
}