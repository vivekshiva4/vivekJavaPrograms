package com.abc.bank;

public class Array {
	int x[]={1,2,3,4,5,6,7,8,9,10};
	 int sum=x[0]+x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]+x[9];
	double avg=sum/10;
	
	void display(){
		System.out.println(sum);
		System.out.println(avg);
	
	}
	
	public static void main(String[] args) {
	Array a=new Array();
	a.display();
}
}
