package animals;

import utilities.*;

public abstract class Chew extends Animal {
	public Chew(String name2) {
		super(name2);

	}

	public void makeSound() {
		MessageUtility.logSound(this.getname(), "chew");
	}

	public String gettaype() {
		return "Cehw";
	}
}
