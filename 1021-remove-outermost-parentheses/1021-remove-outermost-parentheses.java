class Solution {
    public String removeOuterParentheses(String s) {
          StringBuilder str=new StringBuilder();
      int balance=0;
      for(char ch:s.toCharArray())
      {
          if(ch=='(')
          {
              if(balance>0){
                  str.append(ch);
              }
              balance++;
          }
          else{
              balance--;
              if(balance>0)
              {
                  str.append(ch);
              }
          }
          
      }
      return str.toString();
  
        
    }
}