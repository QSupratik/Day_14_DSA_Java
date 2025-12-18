import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp;
        System.out.println("Enter the expression");
        exp = sc.nextLine();

        int n = exp.length();
        Stack<Character> st = new Stack<>();

        for (int i=0;i<n;i++) {
            if (exp.charAt(i) == '(') {
                st.push('(');
            }
            else if (exp.charAt(i) == ')') {
                if (st.isEmpty()) {
                    System.out.println("Expression unbalanced");
                    return;
                }
                else {
                    st.pop();
                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("Expression balanced");
        }
        else {
            System.out.println("Expression unbalanced");
        }
    }
}
