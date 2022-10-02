class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < s.length(); i++){
            char temp = s.charAt(i);
            
            if(temp == '{' || temp == '[' || temp == '('){
                st.push(temp);
                continue;
            }
            
            if(st.isEmpty()) return false;
            
            char check;
            switch(temp){
                case ')': check = st.pop();
                    if(check == '{' || check == '[') return false;
                    break;
                
                case '}': check = st.pop();
                    if(check == '[' || check == '(') return false;
                    break;
                    
                case ']': check = st.pop();
                    if(check == '(' || check == '{') return false;
                    break;
            }
        }
        
        return (st.isEmpty());
    }
}
