package com.lao.conditionalStatements;

public class Forloops{

	int times = 1;
	
    public void forLoopCode() {
        for (; times <= 25; times++) {
            System.out.println("Line number is " + times);
        }
    }

    public static void main(String[] args) {
        Forloops loop = new Forloops();
        loop.forLoopCode();
    }
}
