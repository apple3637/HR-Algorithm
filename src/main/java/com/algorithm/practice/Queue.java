package com.algorithm.practice;

public class Queue {
	private int[] array;
	private int head;
	private int tail;
	
	public Queue(int size) {
		array = new int[size];
		head = -1;
		tail = -1;
	}
	
	public void enQueue(int number) {
		if(tail == array.length-1) {
			throw new RuntimeException("ť�� ��á���ϴ�.");
			
		}
		
		array[++tail] = number;
	}
	
	public int deQueue() {
		if(tail == -1) {
			throw new RuntimeException("ť�� �����Ͱ� �����ϴ�");
		}
		
		int temp = array[++head];
		array[head] = -1;
		
		if (head == tail) {
			head = -1;
			tail = -1;
		}
		
		return temp;
	}

}
