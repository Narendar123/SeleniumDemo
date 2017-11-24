package com;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
       Stack<Integer> s=new Stack<Integer>();
       s.push(23);
       s.push(54);
       s.push(76);
       s.add(87);
       s.add(98);
       System.out.println("List:"+s);
       System.out.println(s.pop());
       System.out.println(s.peek());
       System.out.println("List:"+s);
	}

}
