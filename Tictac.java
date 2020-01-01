import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import static java.lang.System.exit;

//<applet code="tictac" width=500 height=500></applet>
public class tictac extends Applet implements ActionListener{
    //variables
    int m,n,j;
	int s;
        int p=0;//variable for the about to be visible and invisible
        String about="";
        String player_1="";
        String player_2="";
	int a=0;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9;
           
           
           
    
        
        TextField t1,t2;
        Label l1,l2;
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    public void init()
    {
        Font f3=new Font("Broadway",Font.BOLD,24);
         Font f4=new Font("Broadway",Font.BOLD,20);
         
         
                                              
         
    	setLayout(null);
                
                t1=new TextField(20);
                t2=new TextField(20);
                
                l1=new Label("Player-1 : X ");
                l2=new Label("Player-2 : 0 ");
            
                b1 = new Button();
		b2 = new Button();
		b3 = new Button();
		b4 = new Button();
		b5 = new Button();
		b6 = new Button();
		b7 = new Button();
		b8 = new Button();
		b9 = new Button();
                b10 = new Button("Restart");
                b11 = new Button("About");
                b12 = new Button("Start");
                b13 = new Button("Exit");
		
                
                add(b11);
                add(b12);
                add(b13);
                add(l1);
                add(l2);
                add(t1);
                add(t2);
                
                b10.setFont(f3);
                b11.setFont(f3);
                b12.setFont(f3);
                b13.setFont(f3);
                
                b1.setBackground(Color.cyan);
                b2.setBackground(Color.cyan);
                b3.setBackground(Color.cyan);
                b4.setBackground(Color.cyan);
                b5.setBackground(Color.cyan);
                b6.setBackground(Color.cyan);
                b7.setBackground(Color.cyan);
                b8.setBackground(Color.cyan);
                b9.setBackground(Color.cyan);
                b10.setBackground(Color.pink);
                b11.setBackground(Color.green);
                b12.setBackground(Color.yellow);
                b13.setBackground(Color.orange);
                
                
                b1.setForeground(Color.darkGray);
                b2.setForeground(Color.darkGray);
                b3.setForeground(Color.darkGray);
                b4.setForeground(Color.darkGray);
                b5.setForeground(Color.darkGray);
                b6.setForeground(Color.darkGray);
                b7.setForeground(Color.darkGray);
                b8.setForeground(Color.darkGray);
                b9.setForeground(Color.darkGray);
                b11.setForeground(Color.black);
                
                
                l1.setFont(f3);
                l1.setBounds(400, 100, 150, 30);
                l2.setFont(f3);
                l2.setBounds(400, 107, 150, 100);
                t1.setFont(f4);
                t2.setFont(f4);
                t1.setBounds(560, 100, 200, 30);
                t2.setBounds(560, 140, 200, 30);
                
                
		b1.setBounds(450, 250, 100, 100);
		b2.setBounds(550, 250, 100, 100);
		b3.setBounds(650, 250, 100, 100);
		b4.setBounds(450, 350, 100, 100);
		b5.setBounds(550, 350, 100, 100);
		b6.setBounds(650, 350, 100, 100);
		b7.setBounds(450, 450, 100, 100);
		b8.setBounds(550, 450, 100, 100);
		b9.setBounds(650, 450, 100, 100);
                b10.setBounds(780, 250, 100, 40);
                b11.setBounds(780, 190, 100, 40);
                b12.setBounds(780, 140, 100, 40);
                b13.setBounds(780, 250, 100, 40);
                
               
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
                b10.addActionListener(this);
                b11.addActionListener(this);
                b12.addActionListener(this);
                b13.addActionListener(this);
                
    }
    public void start(){
        System.out.println("Applet started");
    }
    
	@Override
	public void actionPerformed(ActionEvent ae) {
                
		if(ae.getSource()==b1)
			s=1;
		if(ae.getSource()==b2)
			s=2;
		if(ae.getSource()==b3)
			s=3;
		if(ae.getSource()==b4)
			s=4;
		if(ae.getSource()==b5)
			s=5;
		if(ae.getSource()==b6)
			s=6;
		if(ae.getSource()==b7)
			s=7;
		if(ae.getSource()==b8)
			s=8;
		if(ae.getSource()==b9)
			s=9;
                if(ae.getSource()==b10){
                                                a=0;
                                                s=0;
                                                b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                
                                                
                                                
                }
                if(ae.getSource()==b11){
                    s=0;
                    
                    if(p%2==0) {
                        about="Devloped by : Joshi Varun, Gangadhar P Kulam";
                    } else {
                        about="";
                    }
                    p++;
                    
                }
                if(ae.getSource()==b12){
                    s=0;
                    player_1 = t1.getText();
                    player_2 = t2.getText();
                    add(b1);
                    add(b2);
                    add(b3);
                    add(b4);
                    add(b5);
                    add(b6);
                    add(b7);
                    add(b8);
                    add(b9);
                    add(b10);
                    b13.setBounds(780, 300, 100, 40);
                    add(b13);
                    m=440;
                    n=240;
                    j=320;
                    repaint();
                    
                }
                if(ae.getSource()==b13)exit(0);
                
                
		a++;
		repaint();
                
	}
	public void paint(Graphics g){
                Font f3=new Font("Broadway",Font.BOLD,35);
                Font f1=new Font("Times New Roman",Font.BOLD,60);
                g.setColor(Color.black);
                Font f2=new Font("Tahoma",Font.ITALIC,20);
                Font f5=new Font("Tahoma",Font.PLAIN,20);
                g.setFont(f2);
                g.drawString(" "+about, 890, 220);
                g.setFont(f5);
                g.drawString(" Click on start button to start the game ", 890, 170);
                g.drawRect(m, n, j, j);
                
                g.setColor(Color.blue);
                
		s1=b1.getLabel();
		s2=b2.getLabel();
		s3=b3.getLabel();
		s4=b4.getLabel();
		s5=b5.getLabel();
		s6=b6.getLabel();
		s7=b7.getLabel();
		s8=b8.getLabel();
		s9=b9.getLabel();
                
                b1.setFont(f3);
                b2.setFont(f3);
                b3.setFont(f3);
                b4.setFont(f3);
                b5.setFont(f3);
                b6.setFont(f3);
                b7.setFont(f3);
                b8.setFont(f3);
                b9.setFont(f3);
                
                 
		if(a>=0){
			if(a%2==0){
				if(s==1){
                                        
					b1.setLabel("X");
					if("X".equals(s2)&& "X".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
            
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
                                                
						}else if("X".equals(s4)&& "X".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        //g.setColor(Color.red);
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s5)&& "X".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        //g.setColor(Color.red);
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}
						
					}
				if(s==2){
					b2.setLabel("X");
				   if("X".equals(s1)&& "X".equals(s3)){
					b1.setLabel("");
					b2.setLabel("");
					b3.setLabel("");
					b4.setLabel("");
					b5.setLabel("");
					b6.setLabel("");
					b7.setLabel("");
					b8.setLabel("");
					b9.setLabel("");
                                        //g.setColor(Color.red);
                                        g.setFont(f1);
                                        g.drawString(player_1+" won", 400, 700);
					}else if("X".equals(s5)&& "X".equals(s8)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                //g.setColor(Color.red);
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
					}
				}
				if(s==3){
					b3.setLabel("X");
				if("X".equals(s2)&& "X".equals(s1)){
					b1.setLabel("");
					b2.setLabel("");
					b3.setLabel("");
					b4.setLabel("");
					b5.setLabel("");
					b6.setLabel("");
					b7.setLabel("");
					b8.setLabel("");
					b9.setLabel("");
                                        //g.setColor(Color.red);
                                        g.setFont(f1);
                                        g.drawString(player_1+" won", 400, 700);
					}else if("X".equals(s6)&& "X".equals(s9)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                //g.setColor(Color.red);
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
					}else if("X".equals(s5)&& "X".equals(s7)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                //g.setColor(Color.red);
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
					}
			}
				if(s==4){
					b4.setLabel("X");
					if("X".equals(s1)&& "X".equals(s7)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                //g.setColor(Color.red);
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s5)&& "X".equals(s6)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        //g.setColor(Color.red);
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}
				}
				if(s==5){
					b5.setLabel("X");
					if("X".equals(s4)&& "X".equals(s6)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                //g.setColor(Color.red);
                                                g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s3)&& "X".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        //g.setColor(Color.red);
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s1)&& "X".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        //g.setColor(Color.red);
                                                        g.setFont(f1);
                                                       g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s2)&& "X".equals(s8)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        //g.setColor(Color.red);
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
							}
				}
				if(s==6){
					b6.setLabel("X");
					if("X".equals(s3)&& "X".equals(s9)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s4)&& "X".equals(s5)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}
				}
				if(s==7){
					b7.setLabel("X");
					if("X".equals(s5)&& "X".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s4)&& "X".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s8)&& "X".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}
				}
				if(s==8){
					b8.setLabel("X");
					if("X".equals(s7)&& "X".equals(s9)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s5)&& "X".equals(s2)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}
				}
				if(s==9){
					b9.setLabel("X");
					if("X".equals(s6)&& "X".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s8)&& "X".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}else if("X".equals(s5)&& "X".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.drawString(player_1+" won", 400, 700);
						}
				}
			}
			if(a%2!=0){
				if(s==1){
					b1.setLabel("O");
					if("O".equals(s2)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s4)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s5)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}
				}
				if(s==2){
					b2.setLabel("O");
					if("O".equals(s1)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s5)&& "O".equals(s8)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 200, 700);
						}
				}
				if(s==3){
					b3.setLabel("O");
					if("O".equals(s2)&& "O".equals(s1)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s5)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s6)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}
				}
				if(s==4){
					b4.setLabel("O");
					if("O".equals(s5)&& "O".equals(s6)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s1)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}
				}
				if(s==5){
					b5.setLabel("O");
					if("O".equals(s4)&& "O".equals(s6)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s2)&& "O".equals(s8)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s1)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s7)&& "O".equals(s3)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
							}
				}
				if(s==6){
					b6.setLabel("O");
					if("O".equals(s9)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s4)&& "O".equals(s5)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}
				}
				if(s==7){
					b7.setLabel("O");
					if("O".equals(s5)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s4)&& "O".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s8)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}
				}
				if(s==8){
					b8.setLabel("O");
					if("O".equals(s2)&& "O".equals(s5)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s9)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}
				}
				if(s==9){
					b9.setLabel("O");
					if("O".equals(s6)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
                                                g.setFont(f1);
                                                g.setColor(Color.red);
                                                g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s8)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}else if("O".equals(s5)&& "O".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
                                                        g.setFont(f1);
                                                        g.setColor(Color.red);
                                                        g.drawString(player_2+" won", 400, 700);
						}
				}
			}
		}
                
                
               
		}

}

