/**
 * 
 */

package mobility;

public class Point {
	
	// static methods
	static int uprangeX = 800;
	static int downrangeX = 0;
	static int uprangeY = 600;
	static int downrangeY = 0;
	
	private int x;
	private int y;
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	public Point()
	{
		
	}
	public boolean setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
		return cheackBounderies(this);
	}
	public Point(int x,int y)
	{
		this.x=(x);
		this.y=(y);
	}
	public Point(Point ob)
	{
		this.x=(ob.getx());
		this.y=(ob.gety());
	}
	public static boolean cheackBounderies(Point pointToCheck)
	{
		return downrangeX <= pointToCheck.getx()&&pointToCheck.getx() <=uprangeX&& downrangeY <= pointToCheck.gety()&&pointToCheck.gety() <=uprangeY;
			
	}
}
