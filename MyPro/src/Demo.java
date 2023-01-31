import pack1.MyInterface;

public class Demo {

	public static void main(String[] args) {
		MyInterface ref=()->{System.out.println("inside lambda disp");};
		ref.disp();




	}

}
