package com.lao.javaLearning;

public class Draw {
	
	String Draw;
	
	Draw(){
		System.out.println("No Parameter Constructor is created or executed");
	}
	
	Draw (String todraw){
		Draw = todraw;
		System.out.println("Drawing " +todraw);
	}

	public static void main(String[] args) {

		Draw drw1 = new Draw();
		//drw1.Draw();
		//drw1.Draw("Circle")
		Draw drw2 = new Draw("Circle");

	}

}
