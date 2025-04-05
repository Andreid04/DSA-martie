package _01_java_Basics;

public class ReverseString {
    public static void reverse(char[] s){// de obicei se folosesc char-uri nu stringuri
        int left = 0;
        int right = s.length-1;

        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }

        String string = String.valueOf(s);
        System.out.println(string);
    }

    public static void main(String[] args) {
        String s = "Ana are mere";
        reverse(s.toCharArray());
        
    }
}
