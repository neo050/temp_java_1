package mobility;
import java.lang.Math;
public abstract class Mobile implements Ilocatable {
	// Attributes
	private Point location; // Current location
	private double totalDistance; // Distance the object traveled, [>0]
	public Mobile()// Constructor(location)
	{
		totalDistance = 0;
		// CHECK with tamar if cacluate the first location distance
	}
	public Mobile(Point location)// Constructor(location)
	{
		if (Point.cheackBounderies(location))
				this.location=new Point(location);
		totalDistance = 0;
		// CHECK with tamar if cacluate the first location distance
	}
	// Ilocatable

	public Point getLocation() {
		return this.location;
	}
	public double getTotalDistance() {
		return this.totalDistance;
	}
	//seters&geters
	// Methods
	public boolean setLocation(Point point)
	{
		
		if (Point.cheackBounderies(	point)) {
			this.location=new Point(point);
			return true;
		}
		return false;
	}
	
	private void addTotalDistance(double vul)// increases td after movement
	{
		this.totalDistance += vul;
	}

	public double calcDistance(Point point)// same as HW1
	{
		return Math.pow(
				Math.pow(this.location.getx() - point.getx(), 2) + Math.pow(this.location.gety() - point.gety(), 2),
				0.5);
	}

	public double move(Point point)// returns distance traveled (0 if non)
	{
		if (Point.cheackBounderies(point)) {
			double temp = calcDistance(point);
			addTotalDistance(temp);
			this.location=point;
			return temp;
			// to do check double code factory
		}
		else
		{
			return 0.0;

		}
	}
}