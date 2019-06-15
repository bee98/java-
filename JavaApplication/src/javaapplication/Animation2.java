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

class Animation2  extends JPanel implements ActionListener
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
  private int turn = 0;
  private int type;
  private int x;
  private int y = -1;
  private ArrayList<Integer> list;
  public Animation2()
  {

  	setup();
  	initTimer();
  	initA();
    arrAdd();
    arrAdd();

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
        
        doDrawing(g);
        
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        turn++;
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
    
    private void doDrawing(Graphics g)
    {
 
    drawComponents(g);
       

    }
    
    
   public void arrAdd()
   {

       Random rand = new Random();
       Random r = new Random();
       int n = rand.nextInt(89)+10;
       int m;
       for(int i : list)
       {
        if(n == i) return;
       } 
       if(list.size() < 1) {
        list.add(n);
        this.y = 0;
        } else
        {
        m = r.nextInt(list.size());
        list.add(m,n);
        this.y = m;
        }

       this.type = 1;
       this.x = n;

      
      

   }
   public void arrRemove()
   {
     Random rand = new Random();
     if(list.size() > 0 )
     {
      int n = rand.nextInt(list.size());
      this.y = list.get(n); 
      list.remove(n);
      this.type = 2;
      this.x = n;
     }
   }
   public void arrClear()
   {
      list.clear();
      list.clear();
      this.type = 3;
   }
    private void setup()
    {
       a = new Square();
       c = new Circle();
       l = new Arrow();
       list = new ArrayList<Integer>();
       
       
    }
    
    private void drawComponents(Graphics g)
    {
      int n = 0;
      if(this.type == 1)
      {
        g.drawString("Add:"+" "+this.x+" locate: "+this.y,20,20);
      }
      if(this.type == 2)
      {
        g.drawString("Remove locate: "+" "+this.x+" value: "+this.y,20,20);
      
      }
      if(this.type == 3)
      {
        
      }
      for (int i : list)
      {
              a.set(20+n*40,200,"" + i);
              g.drawRect(a.getX(),a.getY(),40,40);
              g.drawString(a.getS(),a.getX()+16,a.getY()+18);
              g.drawString("" + n,a.getX()+16,a.getY()+60); 
               
              n++;
      }
    }
    
}