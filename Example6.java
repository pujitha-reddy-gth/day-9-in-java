package com.blc.elc;

public class Example6 {
	public void reverseMultiply(int num){
	    for (int i=10;i>=1;i--){
	      int result=num*i;
	      System.out.println(num+"*"+i+"="+result);
	    }
	  }
	  public static void main(String[] args) {
		  Example6 reverseMult=new Example6();
	    reverseMult.reverseMultiply(6);
	  }
	}
	