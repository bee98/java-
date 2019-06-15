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
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;
import java.awt.Font;
import java.util.ArrayList;

class Animation1  extends JPanel implements ActionListener
{
  private  int DELAY = 1200;// thoi gian khoang cach ve khung hinh
  private final int INITIAL_DELAY = 150; //do tre
  //private final int WIDTH = 70;
  //private final int HEIGHT= 30;
  private Timer timer;
  private Circle c;
  private Square a;
  private Arrow l;
  private int key = 0;
  private int turn = -2;
  private int type = -1;
  private int check = 1;
  private ArrayList<Integer> listA;
  private ArrayList<Integer> listB;
  private ArrayList<Integer> listC;
  public Animation1()
  {

  	setup();
        add();
  	initTimer();
  	initA();


  }
  public void startInit()
  {
    timer.start();
    this.check = 1;
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
       //timer.stop();
        this.check = 0;
    }
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        
        doDrawing(g);
        
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        repaint();
       
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
       
       if(check == 1) 
       {
           run();
           turn++;
       }
       drawTable(g);
       drawComponents(g);
       

    }
    private void drawTable(Graphics g)
    {
    	a.set(30,260,"");
        g.drawRect(a.getX(),a.getY(),40,40);
        a.set(30,220,"");
        g.drawRect(a.getX(),a.getY(),40,40);
        a.set(30,180,"");
        g.drawRect(a.getX(),a.getY(),40,40);
        a.set(30,140,"");
        g.drawRect(a.getX(),a.getY(),40,40);
        a.set(30,100,"");
        g.drawRect(a.getX(),a.getY(),40,40);
        a.set(30,60,"");
        g.drawRect(a.getX(),a.getY(),40,40);
        
        
    }
    private void setup()
    {
       a = new Square();
       c = new Circle();
       l = new Arrow();
       listA = new ArrayList<Integer>();
       listB = new ArrayList<Integer>();
       listC = new ArrayList<Integer>();
       
    }
    private void drawComponentA(Graphics g)
    {
      int n = 0;
        for(int i : listA)
        {
           g.setColor(Color.ORANGE);
           c.set(120+n*50,20,"" + i,30);
           g.drawOval(c.getX(),c.getY(),c.getR(),c.getR()); 
           g.fillOval(c.getX(),c.getY(),c.getR(),c.getR()); 
           g.setColor(Color.RED);
           g.drawString(c.getS(),c.getX()+9,c.getY()+19);
           n++;
           //System.out.println(i);
        }
    }
    private void drawComponentB(Graphics g)
    {
        int n = 0;
        for(int i : listB)
        {
           g.setColor(Color.GREEN);
           c.set(35,265-40*n,"" + i,30);
           g.drawOval(c.getX(),c.getY(),c.getR(),c.getR()); 
           g.fillOval(c.getX(),c.getY(),c.getR(),c.getR()); 
           g.setColor(Color.YELLOW);
           g.drawString(c.getS(),c.getX()+9,c.getY()+19);
           n++;
           //System.out.println(i);
        }
    }
    private void drawComponentC(Graphics g)
    {
      int n = 0;
        for(int i : listC)
        {
           g.setColor(Color.GRAY);
           c.set(120+n*50,300,"" + i,30);
           g.drawOval(c.getX(),c.getY(),c.getR(),c.getR()); 
           g.fillOval(c.getX(),c.getY(),c.getR(),c.getR()); 
           g.setColor(Color.BLUE);
           g.drawString(c.getS(),c.getX()+9,c.getY()+19);
           n++;
           //System.out.println(i);
        }
    }
    private void drawComponents(Graphics g)
    {
      if(type == 1)  g.drawString("deQueue",10,10);
      if(type == 0)  g.drawString("enQueue",10,10);
      drawComponentA(g);
      drawComponentB(g);
      drawComponentC(g);
    }
    public void deQueue()
    {
       int x;
       if(listB.size() > 0)
       {
       x = listB.get(0);
       listC.add(x);
       listB.remove(0);
       this.type = 1;
       }
    }
    public void enQueue()
    {

       int x;
       if(listA.size() > 0)
       {
       x = listA.get(0);
       listB.add(x);
       listA.remove(0);
       this.type = 0;
       }
    }
    
    private void add(){
      listA.add(12);
      listA.add(22);
      listA.add(25);
      listA.add(42);
      listA.add(26);
      listA.add(18);
    }
    private void run()
    {
      if(turn == 1) enQueue();
      if(turn == 2) enQueue();
      if(turn == 3) enQueue();
      if(turn == 4) deQueue();
      if(turn == 5) enQueue();
      if(turn == 6) deQueue();
      if(turn == 7) enQueue();
      if(turn == 8) deQueue();
      if(turn == 9) deQueue();
      if(turn == 10) enQueue();
      if(turn == 11) deQueue();
      if(turn == 12) deQueue();
      if(turn == 13)  
        {
          stopInit();
          //add();
        }
      
    }
    public void reset()
    {
        listA.clear();
        listB.clear();
        listC.clear();
        add();
        turn = -1;
    }
}