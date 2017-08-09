package com.balanceBall;

import java.util.ArrayList;

public class WeigthScale {

	public WeigthScale() {
		
	}
	
	public void weigh(ArrayList<Ball> g1, ArrayList<Ball> g2) {
		int g1Weight = 0, g2Weight = 0;
		String g1Balls = "", g2Balls = "";
		for(int i = 0; i < g1.size(); i++) {
			g1Weight += g1.get(i).weight;
			g1Balls += g1.get(i).loc +" ";
			g2Weight += g2.get(i).weight;
			g2Balls += g2.get(i).loc +" ";
		}
		if (g1Weight > g2Weight)
			System.out.println("Group 1 ( " + g1Balls +") is heavier than Group 2 ( " + g2Balls +")");
		else if (g1Weight < g2Weight)
			System.out.println("Group 1 ( " + g1Balls +") is lighter than Group 2 ( " + g2Balls +")");
		else
			System.out.println("Group 1( " + g1Balls +") weight is equal to Group 2 ( " + g2Balls +")");
	}
	
}
