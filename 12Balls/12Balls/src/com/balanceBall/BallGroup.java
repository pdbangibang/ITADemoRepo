package com.balanceBall;

import java.util.ArrayList;
import java.util.Random;

public class BallGroup<T extends Ball> {

	public ArrayList<T> Balls = new ArrayList<>();
	public int defectiveBall = randInt(9,11);

	public int defectiveBallW = new int[]{1,3}[new Random().nextInt(2)];
	public BallGroup() {
		for(int i = 1; i <= 12; i++) {
			if (i == defectiveBall) {
				this.Balls.add((T) new Ball(i, defectiveBallW));
			}
			else {
				this.Balls.add((T) new Ball(i, 2));
			}
		}

}
	
	
	
	public T getBall(int id) {
		for (T ball : this.Balls) {
			if(ball.loc == id)
				return ball;
		}
		return null;
		
	}
	
	public int getDefectiveBall() {
		return this.defectiveBall;
	}
	
	 public static int randInt(int min, int max) {
		    
		    Random rand = new Random();

		    int randomNum = rand.nextInt((max - min) + 1) + min;
		    
		    return randomNum;
		  }
}
