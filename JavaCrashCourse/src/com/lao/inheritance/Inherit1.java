package com.lao.inheritance;

class son extends dad {
	
}

class grandson extends son{
	
}


public class Inherit1 {
	public static void main(String[] args) {
		grandson dobj = new grandson();
		System.out.println(dobj.money);	
		
	}
}
