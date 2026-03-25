class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stk.push(c);
            }
            else{
                if(stk.isEmpty()) return false;
                char k=stk.pop();
                if(
                    c==')'&& k!='('||
                    c=='}'&& k!='{'||
                    c==']'&& k!='['){
                        return false;
                }
            }
        }
        return stk.isEmpty()? true:false;
    }
}
