//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10-1);
		
		System.out.println(randomNumber);

		
if (randomNumber==1) {JOptionPane.showMessageDialog(null, "you are beautiful");}
if (randomNumber==2) {JOptionPane.showMessageDialog(null, "you are amazeing");}
if (randomNumber==3) {JOptionPane.showMessageDialog(null, "you are wonderfull");}
if (randomNumber==4) {JOptionPane.showMessageDialog(null, "you are helpfull");}
if (randomNumber==5) {JOptionPane.showMessageDialog(null, "you are joyfull");}
if (randomNumber==6) {JOptionPane.showMessageDialog(null, "you are my best friend");}
if (randomNumber==7) {JOptionPane.showMessageDialog(null, "you are lovely");}
if (randomNumber==8) {JOptionPane.showMessageDialog(null, "you are adventurus");}
if (randomNumber==9) {JOptionPane.showMessageDialog(null, "you are brave");}
if (randomNumber==10) {JOptionPane.showMessageDialog(null, "you are awesome");}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
