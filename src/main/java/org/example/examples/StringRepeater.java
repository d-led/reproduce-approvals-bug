package org.example.examples;

public class StringRepeater {
    public String repeat(String what, int repeats) {
        String res = "";
        for (int i = 0; i < repeats; i++) {
            res += what;
        }
        return res;
    }
}
