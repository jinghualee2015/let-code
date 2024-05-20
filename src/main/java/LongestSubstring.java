import java.util.HashSet;
import java.util.Set;

/**
  * Copyright (C), 2022 ~ 2024, NyquistAi.inc
  * @author: Nyquist Data Tech Team
  * @version: 
  * @date: 2024/5/20
  * @description: 
  */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length<=1){
            return length;
        }
        int maxSubStr=1;
        for (int i=0;i<length;i++){
            int tmpLen = 1;
            Set<Character> memo = new HashSet<>();
            memo.add(s.charAt(i));
            for (int j=i+1;j< length;j++){
                Character val = s.charAt(j);
                if (!memo.contains(val)){
                    tmpLen ++;
                    memo.add(val);
                }else {
                    break;
                }

            }
            maxSubStr = Math.max(maxSubStr,tmpLen);
        }
        return maxSubStr;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcaaa"));
    }
}
