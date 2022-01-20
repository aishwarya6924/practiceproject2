package mainlis;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import lisdynamicprogramming.LisDynamicProgramming;
import lisrecursive.LisRecursive;

public class LisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sequenceLength = setLength();

		
		ArrayList<Integer> sequence = new ArrayList<>();
		sequence = generateSequence(sequenceLength);

		

		System.out.println("----------------------------------\n" 
						 + "Find LIS usng dynamic programming\n"
						 + "----------------------------------");
		new LisDynamicProgramming().lis(sequence);

		System.out.println("----------------------------------\n" 
						 + "Find LIS usng recursive\n"
						 + "----------------------------------");
		System.out.println("Length of lis is " + new LisRecursive().lis(sequence, sequenceLength) + "\n");

	}

	public static int setLength() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of the sequence: ");
		int length = scan.nextInt();
		scan.close();
		return length;
	}

	public static ArrayList<Integer> generateSequence(int sequenceLength) {
		
		ArrayList<Integer> sequence = new ArrayList<>();
		Random rand = new Random();
		int randNumber;
		for (int i = 0; i < sequenceLength; i++) {
			randNumber = rand.nextInt(101);
			sequence.add(randNumber);
		}
		System.out.println("Original sequence: ");
		System.out.println(sequence);
		return sequence;
		
	}

}
