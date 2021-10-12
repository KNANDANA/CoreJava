package com.point;
public class Point2D 
{
	private int x,y;
	public Point2D(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
		// TODO Auto-generated method stub
		
	public String getDetails()
	{
		return "Point ("+x+","+y+")";
	}
	public boolean isEqual(Point2D that)
	{
		if(this.getDetails().equals(that.getDetails()))
		{
			return true;
		}
		return false;
	}
	public Point2D createNewPoint(int x, int y)
	{
		Point2D p = new Point2D(x,y);
		return p;
	}
	public double calDistance(Point2D that)
	{
		double dis;
		dis = Math.sqrt((this.x - that.x)*(this.x - that.x) + 
						(this.y - that.y)*(this.y - that.y));
		return dis;
	}
}
