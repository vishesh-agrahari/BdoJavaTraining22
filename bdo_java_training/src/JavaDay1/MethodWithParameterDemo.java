package JavaDay1;



class AddDemoWithParameter {

	void Show(int number1,int numbr2) {

		int result = number1 + numbr2;
	    System.out.println("sum: "+result);
	}

}


//client prg
public class MethodWithParameterDemo {

	public static void main(String arg[]) {

		AddDemoWithParameter addDemo = new AddDemoWithParameter();
		addDemo.Show(30,20);
	}

}