package LambdaDemo;

interface interf4{
	public int squareIt(int x);
}

//class Demo implements interf4{
//	public void squareIt(int i) {
//		System.out.println(i * i);
//	}
//}
//
//public class Test4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		interf4 i  = new Demo();
//		i.squareIt(3);
//		i.squareIt(5);
//
//	}
//
//}

class Test4{
	public static void main(String[] args) {
		interf4 i = x->x*x;
		System.out.println(i.squareIt(3));
	}
	
    
}
