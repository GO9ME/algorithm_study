import java.util.*;

class Solution {
    public List solution(String myStr) {
        List<String> list = new ArrayList<String>();
        String[] splitArr = myStr.split("a|b|c");
        for ( int i = 0 ; i < splitArr.length; i++){
            if( splitArr[i].length() > 0) {
                list.add(splitArr[i]);
            }
        }
        if ( list.size() == 0 ) {
            list.add("EMPTY");
        }
        return list;
    }
}