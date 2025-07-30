package lab1;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		float pi=3.14f;
		double volume;
		System.out.println("Enter the Radius of the sphere: ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		volume=4/3*pi*r*r;
		System.out.println("The volume of the sphere is : "+volume);

	}

}
