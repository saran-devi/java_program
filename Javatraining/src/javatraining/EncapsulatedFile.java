package javatraining;

public class EncapsulatedFile {

	/*	Date   : 09/30/2022
	 * Author : Hassain Basha
	 * Topic  : Encapsulation
	 * It prevents outer classes from accessing and changing fields and methods of a
	 * class. It helps to achieve data hiding
	 */

	private int age;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 18) {
			this.age = age;
		}
	}

}
