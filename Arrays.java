package codeSignal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers  =  new ArrayList<Integer>();
		
	
		for(int k=0;k<5;k++) {
		int num,sort=0;
		System.out.println("enter a no.\n");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(int i=0;i<=9;i++)
		{
			int temp=num;
			while(temp>0)
			{
				int d=temp%10;
				
				if(d==i)
					sort=sort*10+d;
				
				temp=temp/10; 
				
			}
		}
		
		numbers.add(k,sort);
		
	}
		
		
		Collections.sort(numbers);
		System.out.println(numbers);
	}
}
