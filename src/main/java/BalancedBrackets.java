import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(balancedParenthesis("()()"));
    }
    public static boolean balancedParenthesis(String string){
        Stack<Character> stack = new Stack<Character>();
        char[] ch = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            char currentChar = ch[i];
            if (currentChar == '('){
                stack.push(currentChar);
            }
            char popChar;
            if (currentChar == ')'){
                popChar = (char) stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public boolean balancedBrackets(String string){
        Stack<Character> stack = new Stack<Character>();
        char[] ch = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            char currentChar = ch[i];
            if (currentChar == '('||currentChar == '{'||currentChar == '['||currentChar == '<'){
                stack.push(currentChar);
            }
            if (stack.isEmpty()){
                return false;
            }
            char popChar;
            switch (currentChar){
                case ')':
                    popChar = (char) stack.pop();
                    if (popChar == '{'|| popChar == '['||popChar == '<'){
                        return false;
                    }
                    break;
                case '}':
                    popChar = (char) stack.pop();
                    if (popChar == '('|| popChar == '['||popChar == '<'){
                        return false;
                    }
                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if (popChar == '('|| popChar == '{'||popChar == '<'){
                        return false;
                    }
                    break;
                case '>':
                    popChar = (char) stack.pop();
                    if (popChar == '('|| popChar == '['||popChar == '{'){
                        return false;
                    }
                    break;

            }
        }
        return stack.isEmpty();
    }
}
//The runtime complexity is O(n) for both step 1 and 2
// The runtime complexity for solution 1 and 2 is also O(n)
//Both my solution and the provided solution are pretty similar since I already used a stack but I instead used a switch statement to make a seamless and so I wouldnt have to use a hashmap to keep track
// Not much would change other than having to keep track of the tail of the queue
