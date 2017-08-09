package com.balanceBall;

import java.util.ArrayList;
import java.util.Scanner;

import com.balls.Balls;

public class Balance {
	public static void main(String[] args) {
		BallGroup<Ball> BallGroup = new BallGroup<>();
		for (int i = 1; i <= 3; i++) {
			weigh(BallGroup);
		}

	}

	public static void weigh(BallGroup<Ball> BallGroup) {
		ArrayList<Ball> gA = new ArrayList<>();
		ArrayList<Ball> gB = new ArrayList<>();
		ArrayList<Ball> gC = new ArrayList<>();
		WeigthScale scale = new WeigthScale();
		
		gA.add(BallGroup.getBall(1));
		gA.add(BallGroup.getBall(2));
		gA.add(BallGroup.getBall(3));
		gA.add(BallGroup.getBall(4));
		
		gB.add(BallGroup.getBall(5));
		gB.add(BallGroup.getBall(6));
		gB.add(BallGroup.getBall(7));
		gB.add(BallGroup.getBall(8));

		gC.add(BallGroup.getBall(9));
		gC.add(BallGroup.getBall(10));
		gC.add(BallGroup.getBall(11));
		gC.add(BallGroup.getBall(12));


		System.out.println("Pick between Group A, Group B, Group C, to compare");
		Scanner s = new Scanner(System.in);
		String g1 = s.next();
		
		System.out.println("Pick between Group A, Group B, Group C, to compare");
		String g2 = s.next();
		
		if(g1 != g2) {
			if(g1.equals("Group A") || g1.equals("A") && g2.equals("Group B") || g2.equals("B")) {
				scale.weigh(gA, gB);
			 } else if(g1.equals("Group A") || g1.equals("A") && g2.equals("Group C") || g2.equals("C")) {
				 scale.weigh(gA, gC);
			 } else if(g1.equals("Group B") || g1.equals("B") && g2.equals("Group C") || g2.equals("C")) {
				 scale.weigh(gB, gC);
			 } else if(g1.equals("Group B") || g1.equals("B") && g2.equals("Group A") || g2.equals("A")) {
				 scale.weigh(gB, gA);
			 }
		}
		
		return;
	}

}
