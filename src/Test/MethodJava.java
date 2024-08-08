package Test;

public class MethodJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   MethodJava d = new MethodJava();
	   d.getData();
	   String name = d.testData();
	   System.out.println(name);
	   DemoMethod s = new DemoMethod();
	     String names = s.testData2();
	     System.out.println(names);
          Demotest();
          System.out.println(Demotest());
	}
	
	// method is getData() and return type is void , if u want to print any string or name than return type should string. 
	public void getData()
	{ 
		System.out.println("Hellow Word");	
	}
	
	public String testData()
	{ 
		return "supriya"; 
	}
	
	// if declear any method as static than no need to create any object , u can call directly 
	public static  String Demotest()
	{
		return "supriys Latita bhosale";
	}

}
