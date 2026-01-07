public class LongestCommonPrefix(String[] strs) {
   if(strs == null || str.length() == 0 ){
       return "";
    }

    String prefix = str[0];

   for(int i = 0; i<prefix.length(); i++){
       char ch = prefix.charAt(i);
       for(int j = 1; j<str.length(); j++){
           if(i== strs[j].length() || str[j].charAt(i) != ch){
               return prefix.substring(0,i);
           }
        }
    }
   return prefix;
}
