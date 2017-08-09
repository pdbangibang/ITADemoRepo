package com.balls;

import java.util.ArrayList;

class TeamA extends Balls{
	
	ArrayList<Integer> teamA = new ArrayList<Integer>();
	public ArrayList<Integer> getTeamA() {
		return teamA;
	}
	public void setTeamA(ArrayList<Integer> teamA) {
		this.teamA = teamA;
	}
}

class TeamB extends Balls{
	
	ArrayList<Integer> teamB = new ArrayList<Integer>();
	public ArrayList<Integer> getTeamA() {
		return teamB;
	}
	public void setTeamA(ArrayList<Integer> teamB) {
		this.teamB = teamB;
	}
}

class TeamC extends Balls{
	
	ArrayList<Integer> teamC = new ArrayList<Integer>();
	public ArrayList<Integer> getTeamA() {
		return teamC;
	}
	public void setTeamA(ArrayList<Integer> teamC) {
		this.teamC = teamC;
	}
}

public class Balls extends WeighScale{

	
	ArrayList<Integer> balls = new ArrayList<Integer>();
	
	public ArrayList<Integer> getTeamB() {
		return balls;
	}
	public void setTeamB(ArrayList<Integer> balls) {
		this.balls = balls;
	}

	

}
