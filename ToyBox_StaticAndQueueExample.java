package Bhanu128;

import java.util.Stack;

public class ToyBox_StaticAndQueueExample {

	public static void main(String[] args) {
		Stack<String> toys=new Stack<String>();
		toys.push("Ball");
		toys.push("Blocks");
		toys.push("puzzle");
		System.out.println(toys);
		System.out.println(toys.pop() + " is being played");
		System.out.println(toys);

	}

}
