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
public class Circle {
    private int x;
	private int y;
	private int rad;
	private String s;
	public void Circle(){
	};
	public void set(int x,int y,String s,int rad){
        
        this.x = x;
		this.y = y;
		this.s = s;
		this.rad = rad;
	}
	public int getX()
	{
		int x = this.x;
		return x;
	}
	public int getY()
	{
		int y = this.y;
		return y;
	}
	public String getS()
	{
		String s = this.s;
		return s;
	}
	public int getR(){
		int rad =this.rad;
		return rad;
	}
    
}
