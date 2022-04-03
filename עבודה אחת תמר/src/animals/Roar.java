/**
 * 
 */
package animals;
import utilities.*;
/**
 * @author yaird&neoray
 *
 */
public abstract class Roar extends Animal {

	public Roar(String name2) {
		super(name2);

	}

	
	public void makeSound() {
		MessageUtility.logSound(this.getname(), "roar");
	}

	/// seters
	public String gettaype() {
		return "Roar";
	}
}
