package com.learnJava.objectInjection;

public class A {
	
	private String var_from_A;
	
	B object1;

	public String getVar_from_A() {
		return var_from_A;
	}

	public void setVar_from_A(String var_from_A) {
		this.var_from_A = var_from_A;
	}

	public B getObject1() {
		return object1;
	}

	public void setObject1(B object1) {
		this.object1 = object1;
	}

	@Override
	public String toString() {
		return "A [var_from_A=" + var_from_A + ", object1=" + object1 + "]";
	}

	
	
	

}
