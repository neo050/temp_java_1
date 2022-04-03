package animals;
import diet.*;
import mobility.Point;
public class Bear extends Roar {
	private String furColor;
	private String[] validfurColor = { "BLACK", "WHITE", "GRAY" };

	public Bear(String name, String furColor) {
		super(name);
		Point point = new Point(100, 5);
		Omnivore diet = new Omnivore();;
		super.setDiet(diet);
		super.setLocation(point);
		super.setWeight(308.2);
		setFurColor(furColor);
	}
	public Bear(String name, String furColor,Point point1) {
		super(name);
		if(!super.setLocation(point1))
		{
			super.setLocation(new Point(100, 5));
		}
		Omnivore diet = new Omnivore();
		super.setDiet(diet);
		super.setWeight(308.2);
		setFurColor(furColor);
	}
	public Bear(String name) {
		super(name);
		Point point = new Point(100, 5);
		Omnivore diet = new Omnivore();
		super.setDiet(diet);
		super.setLocation(point);
		furColor = new String("GRAY");
		super.setWeight(308.2);

	}
	public Bear(String name,Point point1) {
		super(name);
		if(!super.setLocation(point1))
		{
			super.setLocation(new Point(100, 5));
		}
		Omnivore diet = new Omnivore();
		super.setDiet(diet);
		furColor = new String("GRAY");
		super.setWeight(308.2);

	}

	public boolean setFurColor(String color) {
		for (int i = 0; i < validfurColor.length; ++i) {
			if (color.equals(validfurColor[i])) {
				this.furColor = color;
				return true;

			}
		}
		this.furColor = new String("GRAY");
		return false;
	}

	public String getFurColor() {
		return this.furColor;
	}

	public String gettaype() {
		return "Bear";
	}
}
