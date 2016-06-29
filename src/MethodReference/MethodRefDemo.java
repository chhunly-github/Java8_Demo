package MethodReference;

import Interfaces.IOperation;
import Model.Substraction;

public class MethodRefDemo {
	public static void main(String[] args) {
		IOperation substract=Substraction::substract;
		
		double n1=70, n2=9.9;
		double result=substract.operate(n1, n2);
		System.out.println("result: "+result);
	}
}
