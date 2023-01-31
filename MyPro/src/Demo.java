import pack1.MyInterface;
import pack1.MyInterfaceImpl;
import pack1.SomeClass;

public class Demo {

	public static void main(String[] args) {
		MyInterface ref=SomeClass.getMyInterface();
		ref.disp();



	}

}
