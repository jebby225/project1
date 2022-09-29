package org.example;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

    public static boolean isMatchingPaenthesese(String input) {

        LinkedList<Character> queue = new LinkedList<Character>();

        for(int i = 0; i < input.length(); i++) {

            switch (input.charAt(i)) {
                case '[':
                case '(':
                case '{':
                    queue.add(input.charAt(i));
                    break;
                case ']':
                    if(queue.peek() == null ||  !queue.peek().equals('['))
                        return false;
                    else
                        queue.pop();
                    break;
                case ')':
                    if(queue.peek() == null || !queue.peek().equals('('))
                        return false;
                    else
                        queue.pop();
                    break;
                case '}':
                    if(queue.peek() == null || !queue.peek().equals('{'))
                        return false;
                    else
                        queue.pop();
                    break;
                default:
                    break;
            }
        }
        if(queue.size() > 0)  return false;
        return true;
    }
}