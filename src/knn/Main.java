package knn;
import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter the value of k : ");
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		KNN knn=new KNN(k);
		knn.knnAlgorithm();
	}
}
