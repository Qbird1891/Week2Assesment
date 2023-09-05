package controller;

/**
 * @author Itsal - Quinn Birdsley CIS175 - Fall 2021 Sep 4, 2023
 */
public class Human {
	public static void main(String[] args) {
		Human human = new Human();
		System.out.println(human.name("James"));
		System.out.println(human.age(50));
		System.out.println(human.weight(201.97));
	}

	public double weight(double weight) {
		// TODO Auto-generated method stub
		return weight;
	}

	public String name(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	public int age(int age) {
		// TODO Auto-generated method stub
		return age;
	}

	public boolean hasDuplicateValue(String name) {
		if (name.contains("j")) {
			return true;
		}
		return false;
	}

}
