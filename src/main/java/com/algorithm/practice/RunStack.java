package com.algorithm.practice;

public class RunStack {

	public static void main(String[] args) {
		Stack st = new Stack(100);
		
		st.push(5);
		st.push(4);
		st.push(2);
		st.push(1);
		st.push(8);
		
		st.printStack();
		
		st.pop();
		st.pop();
		
		st.printStack();
		
		st.push(33);
		st.peek();
		
	}

}
