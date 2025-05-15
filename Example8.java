package com.blc.elc;
public class Example8{

	public void cudesOfNumber(int base){
	    int result=1;
	    for (int i=1;i<=base;i++){
	      result=i*i*i;
	      System.out.println("The cube of "+i+" is: "+result);
	    }
	  }
	  public static void main(String[] args) {
		  Example8 cubes=new Example8();
	    cubes.cudesOfNumber(10);
	  }
	}