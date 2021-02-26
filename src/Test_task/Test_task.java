package Test_task;

public class Test_task {
    public static String sameEnds(String str){
        int str_len = str.length(); //calculate length of str
        String result_str = ""; //create an empty string
        String tmp_str = ""; //create an empty string
        for (int i = 0; i < str_len; i++){
            tmp_str += str.charAt(i); //add a single char into string
            int tmp_str_len = tmp_str.length();
            if (i<str_len/2 && tmp_str.equals(str.substring(str_len - tmp_str_len, str_len))) // check if start and end equal
                result_str = tmp_str;
        }
        return result_str;
    }
}
