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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;
import java.util.ArrayList;

class table
{
	private int  key;// so bi chia
	private int  num;//so du
	public table(int key,int num)
	{
		super();
		this.key = key;
		this.num = num;
	}
	public int getKey()
	{
		return key;
	}
	public int getNum()
	{
		return num;
	}
	public void set(int key,int num)
	{
		this.key = key;
		this.num = num;
	}
	public String toString()
	{
		return "[ key:" + this.key + " num:" + this.num + " ]" +"\n";
	}

}
class Animation3  extends JPanel implements ActionListener
{
  private final  int DELAY = 700;
  private final int INITIAL_DELAY = 150; 
  private final int WIDTH = 70;
  private final int HEIGHT= 30;
  private Timer timer;
  private Circle c;
  private Square a;
  private Arrow l;
  private int key = 0;
  private int num = 0;
  private int turn = 0;
  private ArrayList<table> list;
  public Animation3()
  {

  	setup();
  	initTimer();
  	initA();

  }
  private void initTimer() {
 
        timer = new Timer(DELAY, this);
        timer.setInitialDelay(INITIAL_DELAY);
        timer.start();
    }
    private void initA()
    {
    	setBackground(Color.WHITE);
    }
    public void stopInit()
    {
        timer.stop();
    }
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        if (turn > 3 && turn < 16) add();
        doDrawing(g);
       // if(turn == 28) stopInit();
    }
    public void add(String str)
    {
      int i = Integer.parseInt(str);
      this.key = i;
      this.num = hashFun_c(key);
      table t = new table(key,num);
      for (table l : list) {
            if(l.getKey() == key) return;
        }
      list.add(t);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        turn++;
        repaint();
        check();
    }
    private void drawSquare(Graphics g,int x,int y,String s)
    {

    }
    private void drawCircle(Graphics g,int x,int y,String s)
    {
          
    }
    private void drawArrowX(Graphics g,int x1,int y1,int x2,int y2)
    {
    	  l.set(x1,y1,x2,y2);
          g.drawLine(l.getX1(),l.getY1(),l.getX2(),l.getY2());
          g.drawLine(l.getX2(),l.getY2(),l.getHX3(),l.getHY3());
          g.drawLine(l.getX2(),l.getY2(),l.getHX4(),l.getHY4());
    	  
    }
    private void drawArrowY(Graphics g,int x1,int y1,int x2,int y2)
    {
          l.set(x1,y1,x2,y2);
          g.drawLine(l.getX1(),l.getY1(),l.getX2(),l.getY2());
          g.drawLine(l.getX2(),l.getY2(),l.getTX3(),l.getTY3());
          g.drawLine(l.getX2(),l.getY2(),l.getTX4(),l.getTY4()); 
    }
    private void remove()
    {

    }
    private void doDrawing(Graphics g)
    {
 
       drawHash(g);
       

    }
    private void drawHash(Graphics g)
    {
          drawTable(g);
          drawFun_c(g);
    }
    private int hashFun_c(int x)
    {
    	return x%6;
    }
    private void drawTable(Graphics g)
    {
    	a.set(120,230,"5");
        g.setColor(Color.ORANGE);
        g.fillRect(a.getX(),a.getY(),40,40);
        g.setColor(Color.RED);
        g.drawRect(a.getX(),a.getY(),40,40);
        g.drawString(a.getS(),a.getX()+20,a.getY()+20);
        a.set(120,190,"4");
        g.setColor(Color.ORANGE);
        g.fillRect(a.getX(),a.getY(),40,40);
        g.setColor(Color.RED);
        g.drawRect(a.getX(),a.getY(),40,40);
        g.drawString(a.getS(),a.getX()+20,a.getY()+20);
        a.set(120,150,"3");
        g.setColor(Color.ORANGE);
        g.fillRect(a.getX(),a.getY(),40,40);
        g.setColor(Color.RED);
        g.drawRect(a.getX(),a.getY(),40,40);
        g.drawString(a.getS(),a.getX()+20,a.getY()+20);
        a.set(120,110,"2");
        g.setColor(Color.ORANGE);
        g.fillRect(a.getX(),a.getY(),40,40);
        g.setColor(Color.RED);
        g.drawRect(a.getX(),a.getY(),40,40);
        g.drawString(a.getS(),a.getX()+20,a.getY()+20);
        a.set(120,70,"1");
        g.setColor(Color.ORANGE);
        g.fillRect(a.getX(),a.getY(),40,40);
        g.setColor(Color.RED);
        g.drawRect(a.getX(),a.getY(),40,40);
        g.drawString(a.getS(),a.getX()+20,a.getY()+20);
        a.set(120,30,"0");
        g.setColor(Color.ORANGE);
        g.fillRect(a.getX(),a.getY(),40,40);
        g.setColor(Color.RED);
        g.drawRect(a.getX(),a.getY(),40,40); 
        g.drawString(a.getS(),a.getX()+20,a.getY()+20);
        drawComponents(g);
    }
    private void drawFun_c(Graphics g)
    {
    	
        a.set(20,30,"Key:" + key);
        g.drawRect(a.getX(),a.getY(),80,40);
        g.drawString(a.getS(),a.getX()+20,a.getY()+20); 
        drawArrowY(g,60,70,60,90); 
        a.set(10,90,"return Key%6");
        g.drawRect(a.getX(),a.getY(),100,40);
        g.drawString(a.getS(),a.getX()+15,a.getY()+20);
        drawArrowY(g,60,130,60,150);
        c.set(40,150,"" + num,40);
        g.drawOval(c.getX(),c.getY(),c.getR(),c.getR());	
        g.drawString(c.getS(),c.getX()+18,c.getY()+24);

    }
    private void setup()
    {
       a = new Square();
       c = new Circle();
       l = new Arrow();
       list = new ArrayList<table>();
    }
    private void drawComponents(Graphics g)
    {

        drawComponent(g,0);
        drawComponent(g,1);
        drawComponent(g,2);
        drawComponent(g,3);
        drawComponent(g,4);
        drawComponent(g,5);

    }
    private void add()
    {
    	Random rand = new Random();
    	this.key = rand.nextInt(89)+10;
    	this.num = hashFun_c(key);
    	table t = new table(key,num);
    	for (table l : list) {
            if(l.getKey() == key) return;
        }
    	list.add(t);
    }
    private void check()
    {
    	if(turn == 100)
        for (table l : list) {
        System.out.println(l.toString());
        }
    }
    private void drawComponent(Graphics g,int i)
    {
    	int  n = 0;
    	for (table l : list) {
        	if(l.getNum() == i)
        	{

              a.set(180+n*56,30+i*40,"" + l.getKey());
              g.drawRect(a.getX(),a.getY(),36,36);
              g.drawString(a.getS(),a.getX()+14,a.getY()+16); 
              drawArrowX(g,160+n*56 ,50+i*40,178+n*56,50+i*40); 
              n++;
        	}
    }
}
}
