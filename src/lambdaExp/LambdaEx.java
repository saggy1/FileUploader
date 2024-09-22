package lambdaExp;

@FunctionalInterface
interface Greeting{
	void sayHello();

}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting greeting = ()-> {System.out.println("Hello");};
		greeting.sayHello();
	}

}