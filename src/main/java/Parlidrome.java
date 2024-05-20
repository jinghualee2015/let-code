/**
 * Copyright (C), 2022 ~ 2024, NyquistAi.inc
 *
 * @author: Nyquist Data Tech Team
 * @version:
 * @date: 2024/5/20
 * @description:
 */
public class Parlidrome {
    public static boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        int len = xStr.length();
        int middle = len / 2;
        int left =-1;
        int right = -1;
        if (len % 2 == 0){
            left = middle-1;
            right = middle;
        }else {
            left = middle;
            right = middle;
        }
        for (int i=0, j=(len-1);(i<=left && j>=right);i++,j--){
            if (xStr.charAt(i) != xStr.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)+"");
        System.out.println(isPalindrome(-121)+"");
        System.out.println(isPalindrome(1111));
    }
}
