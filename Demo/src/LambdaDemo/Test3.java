package LambdaDemo;

interface interf3{
	public int m1(String s);
	
}

//class Demo implements interf3{
//	public int m1(String s) {
//		return s.length();
//	}
//}
//
//public class Test3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		interf3 i = new Demo();
//		System.out.println(i.m1("Hello"));
//		System.out.println(i.m1("Prerana"));
//
//	}
//
//}

class Test3{
	public static void main(String[] args) {
		interf3 i = s->s.length();
		System.out.println(i.m1("Hello"));
	}
}
