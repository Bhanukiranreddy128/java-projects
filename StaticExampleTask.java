package Bhanu128;

import java.util.Stack;

public class StaticExampleTask {

	public static void main(String[] args) {
		Stack<String> Features=new Stack<String>();
		Features.push("writen");
		Features.push("Delete");
		Features.push("Insert");
		System.out.println(Features.peek());
		System.out.println(Features.pop());
		System.out.println(Features.pop());

		System.out.println(Features);
		
	}

}
