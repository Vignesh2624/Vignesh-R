package P2;

public class ElectronicDevices {
	public static void main(String args[])
	{
	    Computer electronicDevice1 = new Computer();
		Laptop electronicDevice2 = new Laptop();
		MobilePhone electronicDevice3 = new MobilePhone();
	    TV electronicDevice4 = new TV();
		System.out.println(electronicDevice1.getPower());
		System.out.println(electronicDevice2.getPower());
		System.out.println(electronicDevice3.getPower());
		System.out.println(electronicDevice4.getPower());
		
		
	}

}