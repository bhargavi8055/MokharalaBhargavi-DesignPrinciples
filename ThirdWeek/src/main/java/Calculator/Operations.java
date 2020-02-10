package Calculator;
import java.util.*;
import java.util.Scanner;

public class Operations {
	static Scanner scan=new Scanner(System.in);
	
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public double div(double a,double b) {
		return a/b;
	}
	public double mod(double a,double b) {
		return a%b;
	}
}
