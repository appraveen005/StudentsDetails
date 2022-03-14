package org.stud;

import java.util.Scanner;

public class Studen {
	private void studId() {

	Scanner i = new Scanner(System.in);
	
	System.out.println("enter student id  "+i.nextLine());
	System.out.println(i);
	
	}
	public static void main(String[] args) {
		Studen s = new Studen();
		s.studId();
	}
}
