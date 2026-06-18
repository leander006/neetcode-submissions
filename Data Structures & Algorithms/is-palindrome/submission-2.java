class Solution {
    public boolean isPalindrome(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        for(int i=0,j=res.length()-1;i<j;i++,j--){
            if(Character.toLowerCase(res.charAt(i)) != Character.toLowerCase(res.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
