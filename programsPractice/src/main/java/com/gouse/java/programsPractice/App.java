package com.gouse.java.programsPractice;


public class App 
{
    public static void main( String[] args )
    {
        int x[] = {10,8,1,4,7,9};
        int min=x[0];
        for (int i = 0; i < x.length; i++) {
        	if(x[i]>min) {
        		min=x[i];
        	}
        	  
		}
        System.out.println(min);
    }
}
