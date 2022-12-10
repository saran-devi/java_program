package javatraining;

public class Main {

	public static void main(String[] args) {

		EncapsulatedFile e = new EncapsulatedFile();
		System.out.println(e.getAge());
		e.setAge(20);
		System.out.println(e.getAge());
		e.setAge(15);
	    System.out.println(e.getName());
		e.setName("saranya");

	}

}
