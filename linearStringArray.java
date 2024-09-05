import java.util.*;
class linearStringArray {
    public static int linearstring(String str, char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String str="Suvetha";
        int res = linearstring(str,'V');
        System.out.println(res);

    } 
    
}
