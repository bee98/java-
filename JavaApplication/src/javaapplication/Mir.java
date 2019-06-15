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
import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Component;
import static javax.swing.LayoutStyle.ComponentPlacement.UNRELATED;
public class Mir extends JFrame {
 
 private JTextField area;
 private JButton button1;
 private JButton button2;
 private JButton button3;
 private JButton button4;
 private JButton button5;
 private JButton button6;
 private Animation2 a;
 private Animation1 b;
 private Animation3 c;
 private int x;  
 
    public Mir(){};
    public Mir(int x) {
        super();
        this.x = x;
        initUI();
    }
 
    private void initUI() {
 
        setSize(600, 450);
        setResizable(false);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button6 = new JButton("  Back  ");
        button6.setBackground(new java.awt.Color(204, 204, 204));
        button6.setFont(new java.awt.Font("Arial Black", 1, 14)); 
        button6.setForeground(new java.awt.Color(255, 102, 0));
         button6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }

           
            
        });
       if( x == 1){
        a = new Animation2();
        add(a);
        button1 = new JButton("Add");
        button2 = new JButton("Remove");
        button3 = new JButton("Clear");
        button1.setBackground(new java.awt.Color(204, 204, 204));
        button1.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        button1.setForeground(new java.awt.Color(204, 0, 204));
        button2.setBackground(new java.awt.Color(204, 204, 204));
        button2.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        button2.setForeground(new java.awt.Color(204, 0, 204));
        button3.setBackground(new java.awt.Color(204, 204, 204));
        button3.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        button3.setForeground(new java.awt.Color(204, 0, 204));
      

        setTitle("Project 3");
        //add(button1);
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl); 
 
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        a.setPreferredSize(new Dimension(450, 450));
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addGroup(gl.createParallelGroup()
            .addComponent(button1)
            .addComponent(button2)
            .addComponent(button3)
            .addComponent(button6))
            .addPreferredGap(UNRELATED)
            .addComponent(a));
 
        gl.setVerticalGroup(gl.createParallelGroup()
            .addGroup(gl.createSequentialGroup()
            .addComponent(button1)
            
            .addComponent(button2)
            
            .addComponent(button3)
            
            .addComponent(button6))
            .addComponent(a)); 
        
 
        
        button1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
         button2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
          button3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
          }
     
     if(x == 2)  
        {
            b = new Animation1();
            add(b);
            button2 = new JButton("  Run  ");
            button1 = new JButton(" Pause ");
            button3 = new JButton("Dequeue");
            button4 = new JButton("Enqueue");
            button5 = new JButton(" Reset ");
            button1.setBackground(new java.awt.Color(204, 204, 204));
            button1.setFont(new java.awt.Font("Arial Black", 0, 14)); 
            button1.setForeground(new java.awt.Color(204, 0, 204));
            button2.setBackground(new java.awt.Color(204, 204, 204));
            button2.setFont(new java.awt.Font("Arial Black", 0, 14)); 
            button2.setForeground(new java.awt.Color(204, 0, 204));
            button3.setBackground(new java.awt.Color(204, 204, 204));
            button3.setFont(new java.awt.Font("Arial Black", 0, 14)); 
            button3.setForeground(new java.awt.Color(204, 0, 204));
            button4.setBackground(new java.awt.Color(204, 204, 204));
            button4.setFont(new java.awt.Font("Arial Black", 0, 14)); 
            button4.setForeground(new java.awt.Color(204, 0, 204));
            button5.setBackground(new java.awt.Color(204, 204, 204));
            button5.setFont(new java.awt.Font("Arial Black", 0, 14)); 
            button5.setForeground(new java.awt.Color(255, 102, 51));
            Container pane = getContentPane();
            GroupLayout gl = new GroupLayout(pane);
            pane.setLayout(gl); 
            gl.setAutoCreateContainerGaps(true);
            gl.setAutoCreateGaps(true);
            b.setPreferredSize(new Dimension(450, 450));
            gl.setHorizontalGroup(gl.createSequentialGroup()
            .addGroup(gl.createParallelGroup()
            .addComponent(button1)
            .addComponent(button2)
             .addComponent(button3)
             .addComponent(button4)
            .addComponent(button5)
            .addComponent(button6))
            .addPreferredGap(UNRELATED)
            .addComponent(b));
             gl.setVerticalGroup(gl.createParallelGroup()
            .addGroup(gl.createSequentialGroup()
            .addComponent(button1)
            .addComponent(button2)
             .addComponent(button3)
             .addComponent(button4)
            .addComponent(button5)
            .addComponent(button6))
            .addComponent(b)); 
             button1.addActionListener(new java.awt.event.ActionListener() {
             @Override
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1_2ActionPerformed(evt);
            }

        });
            button2.addActionListener(new java.awt.event.ActionListener() {
             @Override
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2_2ActionPerformed(evt);
            }

        });
            button3.addActionListener(new java.awt.event.ActionListener() {
             @Override
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3_2ActionPerformed(evt);
            }

                
        });
            button4.addActionListener(new java.awt.event.ActionListener() {
             @Override
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }});
            button5.addActionListener(new java.awt.event.ActionListener() {
             @Override
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }});
        }  
       if(x == 3)
       {
        c = new Animation3();
        area = new JTextField();  
        button1 = new JButton("Add");
        button1.setBackground(new java.awt.Color(214, 214, 204));
        button1.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        button1.setForeground(new java.awt.Color(255, 102, 204));
        button1.addActionListener(new java.awt.event.ActionListener() {
             @Override
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1_3ActionPerformed(evt);
            }

        });
        //add(c,BorderLayout.CENTER);
        
       
        //add(area,BorderLayout.LINE_END);
        //add(button1,BorderLayout.CENTER);
        //add(area,BorderLayout.PAGE_END);
        JPanel basic = new JPanel();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        add(c);
        
        c.add(Box.createVerticalGlue());
 
        JPanel bottom = new JPanel();
        bottom.setAlignmentX(Component.RIGHT_ALIGNMENT);
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
 
       ;
 
        bottom.add(button1);
        bottom.add(button6);
        bottom.add(Box.createRigidArea(new Dimension(10, 15)));
        //bottom.add(close);
        //bottom.add(Box.createRigidArea(new Dimension(15, 0)));
 
        c.add(bottom);
        c.add(Box.createRigidArea(new Dimension(15, 15)));
        add(area,BorderLayout.PAGE_END);
       } 
        
    }
    public void button1ActionPerformed(java.awt.event.ActionEvent evt)
    {
       
       a.arrAdd();
    }
    public void button2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        a.arrRemove();
    }
    public void button3ActionPerformed(java.awt.event.ActionEvent evt)
    {
        a.arrClear();
    }
    public void button1_2ActionPerformed(java.awt.event.ActionEvent evt)
    {
       b.stopInit(); 
    }
     public void button2_2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        b.startInit();
    }
     public void button1_3ActionPerformed(java.awt.event.ActionEvent evt)
    {
       String s = area.getText(); 
       c.add(s);
    }
      public void button3_2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        b.deQueue();
    }
       public void button4ActionPerformed(java.awt.event.ActionEvent evt)
    {
       b.enQueue();
    }
          public void button5ActionPerformed(java.awt.event.ActionEvent evt)
    {
       b.reset();
    }
       public void button6ActionPerformed(java.awt.event.ActionEvent evt)
    {         app app = new app();
              app.setVisible(rootPaneCheckingEnabled);
              app.setLocationRelativeTo(null);
              dispose();
    }    
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
 
                Mir ex = new Mir(0);
                ex.setVisible(true);
            }
        });
    }
}