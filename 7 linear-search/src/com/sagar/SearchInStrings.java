package com.sagar;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Sagar";
        char target = 'u';
        System.out.println(searchInString(name, target));
    }

    public static boolean searchInString(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
                return true;
        }

        return false;
    }
}
