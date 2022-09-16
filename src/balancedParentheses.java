public class balancedParentheses {
    public static void main(String[] args) {

        String test = "()()";

        System.out.println(balancedParentheses(test));

    }
        public static boolean balancedParentheses(String s) {
            int numUnclosedOpenParens = 0;
            for (int i = 0; i < s.length(); i += 1) {
                if (s.charAt(i) == '(') {
                    numUnclosedOpenParens += 1;
                }
                else if (s.charAt(i) == ')') {
                    numUnclosedOpenParens -= 1;
                }

                if (numUnclosedOpenParens < 0) {
                    return false;
                }
            }

            return numUnclosedOpenParens == 0;
        }
}
