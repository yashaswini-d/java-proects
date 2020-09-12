package demo;

public class ThisMethodDemo2 extends Demo {
	
	static int a;
	static int b;
	static int c;
	
	ThisMethodDemo2(){
		
		this(a);
		b=b;
		c=c;
		System.out.println(a + " " + b +"" + c);
	}
	
ThisMethodDemo2(int a){
		
		this(a,b);
		c=c;
		System.out.println(a + " " + b +"" + c);
	}
	
ThisMethodDemo2(int a,int b){
	
	this(a,b,c);
	System.out.println("2 parameterized const :"+a + " " + b +"" + c);
}

ThisMethodDemo2(int a,int b, int c ){
	super(a);
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println(a + " " + b +"" + c);
}
}
