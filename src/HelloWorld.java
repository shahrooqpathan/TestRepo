
public class HelloWorld {

    public static void main(String[] args) {
	try {
	    // TODO Auto-generated method stub
	    System.out.println("Hello World");
	    if (args.length!=0) {
		System.out.println(args[0]);
	    } else {
		System.out.println("Enter Arguements To Print lol you idiot");
	    }

	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}
