class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String>  strStack = new Stack<>();
        String current = "";
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            }
            else if (c == '[') {
                numStack.push(k);
                strStack.push(current);
                current = "";
                k = 0;
            } 
            else if (c == ']') {
                int times    = numStack.pop();
                String prev  = strStack.pop();
                StringBuilder sb = new StringBuilder(prev);
                for (int i = 0; i < times; i++) {
                    sb.append(current);
                }
                current = sb.toString();
            }
            else {
                current += c;
            }
        }
        return current;
    }
}
