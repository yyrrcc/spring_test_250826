package com.mycompany.test;

public class MyCalculator {
	
	private int a;
	private int b;
	
	// 1번 Calculator 객체에게 의존하는 관계 성립
	Calculator calculator = new Calculator();
	
	
	// Calculator 생성자
	public MyCalculator() {
		super();
	}
	public MyCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	public MyCalculator(int a, int b, Calculator calculator) {
		super();
		this.a = a;
		this.b = b;
		this.calculator = calculator;
	}
	
	
	public void addition () {
		calculator.add(this.a, this.b);
	}
	
	public void substraction () {
		calculator.sub(this.a, this.b);
	}
	
	public void multiplication () {
		calculator.mul(this.a, this.b);
	}
	
	public void division () {
		calculator.div(this.a, this.b);
	}
	
	
	// setter
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

}
