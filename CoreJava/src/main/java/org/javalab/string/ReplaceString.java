package org.javalab.string;

public class ReplaceString {
    public static void main(String[] args) {
        String searchStr = " ? & | ! { } [ ] ( ) ^ ~ * : ' + -";
        searchStr = searchStr.
                replace("\\", "\\\\").
                replace("\"", "\\\"").
                replace("?", "\\?").
                replace("&", "\\&").
                replace("|", "\\|").
                replace("!", "\\!").
                replace("{", "\\{").
                replace("}", "\\}").
                replace("[", "\\[").
                replace("]", "\\]").
                replace("(", "\\(").
                replace(")", "\\)").
                replace("^", "\\^").
                replace("~", "\\~").
                replace("*", "\\*").
                replace(":", "\\:").
                replace("'", "\\'").
                replace("+", "\\+").
                replace("-", "\\-");
        System.out.println(searchStr);


    }
}
