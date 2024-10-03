package LambdaDemo;

interface interf{
	public void m1();
}

// class Demo implements interf{
//	public void m1() {
//		System.out.println("LAmbda ");
//	}
//}
//
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		interf i = new Demo();
//		i.m1();
//
//	}
//
//}


public class Test{
	public static void main(String[] args) {
		interf i =()->System.out.println("M1 methos ipmplemetation");
		i.m1();
	}
}
