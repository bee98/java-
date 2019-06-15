/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author kaishin
 */
public class Arrow {
 

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public void Arrow(){

	};
	public void set(int x1,int y1,int x2,int y2){
		 this.x1 = x1;
		 this.y1 = y1;
		 this.x2 = x2;
		 this.y2 = y2;

	}
	public int getX1()
	{
		int x = this.x1;
		return x;
	}
	public int getY1()
	{
		int y = this.y1;
		return y;
	}
	public int getX2()
	{
		int x = this.x2;
		return x;
	}
	public int getY2()
	{
		int y = this.y2;
		return y;
	}
	
	public int getTX3()
	{
		int x = this.x2 - 1;
		return x;
	}
	public int getTY3()
	{
		int y = this.y2 - 1;
		return y;
		
	}
	public int getTX4()
	{
		int x = this.x2 + 1;
		return x;
	}
	public int getTY4()
	{
		int y = this.y2 - 1;
		return y;
		
	}
	public int getHX3()
	{
		int x = this.x2 - 1;
		return x;
	}
	public int getHY3()
	{
		int y = this.y2 - 1;
		return y;
		
	}
	public int getHX4()
	{
		int x = this.x2 - 1;
		return x;
	}
	public int getHY4()
	{
		int y = this.y2 + 1;
		return y;
		
	}   
}
