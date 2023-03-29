package TestGitHub;

public class Test {

	int a;
	int b;
	int c;
	void sum(){
		c=a=b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Test T = new Test();
		T.a=10;
		T.b=20;
		T.sum();
		

	}

}
