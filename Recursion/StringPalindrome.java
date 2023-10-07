public class StringPalindrome {
    public static void main(String[] args) {
        //String[] str={"gooddad"};
        
        String[] str=new String[] {"gooddad"};
        StringPalindrome st=new StringPalindrome();

        boolean ans=st.checkSubstring(str, 4, 6);
        System.out.println(ans);
    }

     boolean checkSubstring(String[] str, int s, int e){
       if(s>e){
        return true;
       }
       if((str[s] == str[e]) && (checkSubstring(str, s+1, e-1))){
        return true;
       }
       return false;
    }
}