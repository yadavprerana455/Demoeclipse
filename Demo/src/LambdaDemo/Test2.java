package LambdaDemo;

interface interf1{
	public void m1(int a, int b);
}
//class Demo implements interf1{
//	public void m1(int a,int b) {
//		System.out.println(a+b);
//	}
//}
//
//public class Test2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		interf1 i = new Demo();
//		i.m1(10, 20);
//		i.m1(30, 60);
//
//	}
//
//}

class Test2{
	public static void main(String[] args) {
		interf1 i =(a,b)->System.out.println(a+b);
		i.m1(20, 30);
		i.m1(30, 40);
		
	}
}
