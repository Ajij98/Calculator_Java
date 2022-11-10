package com.example.detaile;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

public class Calculator extends JFrame{
	
	JPanel mainPanel=new JPanel();
	JPanel panelNorth=new JPanel();
	JPanel panelNorthWest=new JPanel();
	JPanel panelNorthCenter=new JPanel();
	JPanel panelNorthEast=new JPanel();
	JPanel panelSouth=new JPanel();
	JPanel panelSouthNorth=new JPanel();
	JPanel panelSouthCenter=new JPanel();	
	JPanel panelCenter=new JPanel();
	JPanel panelCenterNorth=new JPanel();
	JPanel panelCenterCenter=new JPanel();
	
	JTextField txtCalculation=new JTextField();
	JTextField txtResult=new JTextField();

	JPanel panelItemList=new JPanel();
	
	JButton btnCE=new JButton("CE");
	JButton btnC=new JButton("C");
	JButton btnBackSpace=new JButton("\uF0E7");
	JButton btnDivision=new JButton("/");
	JButton btnSeven=new JButton("7");
	JButton btnEight=new JButton("8");
	JButton btnNine=new JButton("9");
	JButton btnMultiple=new JButton("*");
	JButton btnFour=new JButton("4");
	JButton btnFive=new JButton("5");
	JButton btnSix=new JButton("6");
	JButton btnMinues=new JButton("-");
	JButton btnOne=new JButton("1");
	JButton btnTwo=new JButton("2");
	JButton btnThree=new JButton("3");
	JButton btnPlus=new JButton("+");
	JButton btnSqrt=new JButton("±");
	JButton btnZero=new JButton("0");
	JButton btnDot=new JButton(".");
	JButton btnEqual=new JButton("=");

	JButton btnPercent=new JButton("%");
	JButton btnRoot=new JButton("√");
	JButton btnXSquere=new JButton("x^2");
	JButton btnOneByX=new JButton("1/x");
	
	JButton btnMC=new JButton("MC");
	JButton btnMR=new JButton("MR");
	JButton btnMplus=new JButton("M+");
	JButton btnMminues=new JButton("M-");
	JButton btnMS=new JButton("MS");
	JButton btnM=new JButton("M^");
	
	JButton btnMenu=new JButton("|||");
	JButton btnHistory=new JButton("HIS");
	JLabel lblStandard=new JLabel("STANDARD");
	
	JPanel panelmenu=new JPanel();
	JPanel panelList=new JPanel();
	
	JMenuBar mainManu=new JMenuBar();
	
	JMenu menu=new JMenu("|||");
	
	JLabel  lblCalculator=new JLabel("CALCULATOR");
	JMenuItem manuStandard=new JMenuItem();
	JMenuItem manuScientific=new JMenuItem();
	JMenuItem manuProgrammer=new JMenuItem();
	JMenuItem manuDateCalculation=new JMenuItem();
	
	JLabel lblConvertar=new JLabel("CONVERTER");
	JMenuItem manuVolume=new JMenuItem("");
	JMenuItem manuLength=new JMenuItem();
	JMenuItem manuWeightandHeight=new JMenuItem();
	JMenuItem manuTemperature=new JMenuItem();
	JMenuItem manuEnergy=new JMenuItem();
	JMenuItem manuArea=new JMenuItem();
	JMenuItem manuSpeed=new JMenuItem();
	JMenuItem manuTime=new JMenuItem();
	JMenuItem manuPower=new JMenuItem();
	JMenuItem manuData=new JMenuItem();
	JMenuItem manuPressure=new JMenuItem();
	JMenuItem manuAngle=new JMenuItem();
	
	JButton btnStandard=new JButton("Standard");
	JButton btnScientific=new JButton("Scientific");
	JButton btnProgrammer=new JButton("Programmer");
	JButton btnDateCalculation=new JButton("Date Calculation");

	JButton btnVolume=new JButton("Volume");
	JButton btnLength=new JButton("Length");
	JButton btnWeightandHeight=new JButton("Weight and Height");
	JButton btnTemperature=new JButton("Temperature");
	JButton btnEnergy=new JButton("Energy");
	JButton btnArea=new JButton("Area");
	JButton btnSpeed=new JButton("Speed");
	JButton btnTime=new JButton("Time");
	JButton btnPower=new JButton("Power");
	JButton btnData=new JButton("Data");
	JButton btnPressure=new JButton("Pressure");
	JButton btnAngle=new JButton("Angle");
	
	char ch;
	
	public Calculator(){
		init();
		cmp();
		mouseAction();	
		btnAction();
	}
	public void btnAction(){
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnSeven.getText();
				txtCalculation.setText(str);
			}
		});
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnEight.getText();
				txtCalculation.setText(str);
			}
		});
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnNine.getText();
				txtCalculation.setText(str);
			}
		});
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnFour.getText();
				txtCalculation.setText(str);
			}
		});
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnFive.getText();
				txtCalculation.setText(str);
			}
		});
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnSix.getText();
				txtCalculation.setText(str);
			}
		});
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnOne.getText();
				txtCalculation.setText(str);
			}
		});
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnTwo.getText();
				txtCalculation.setText(str);
			}
		});
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnThree.getText();
				txtCalculation.setText(str);
			}
		});
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=txtCalculation.getText()+btnZero.getText();
				txtCalculation.setText(str);
			}
		});
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=txtCalculation.getText();
				if(s.length()!=0){
					if(s.charAt(s.length()-1)!='.'){
						String str=txtCalculation.getText()+btnDot.getText();
						txtCalculation.setText(str);
					}
				}	
			}
		});
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=txtCalculation.getText();
				if(s.length()!=0){
					if(s.charAt(s.length()-1)!='+' && s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1)!='*'
							&& s.charAt(s.length()-1)!='/'&&s.charAt(s.length()-1)!='%'){
						String str=txtCalculation.getText()+btnPlus.getText();
						txtCalculation.setText(str);
						ch='+';
					}
				}
			}	
		});
		btnMinues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=txtCalculation.getText();
				if(s.length()!=0){
					if(s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1)!='+' && s.charAt(s.length()-1)!='*'
							&& s.charAt(s.length()-1)!='/'&&s.charAt(s.length()-1)!='%'){
						String str=txtCalculation.getText()+btnMinues.getText();
						txtCalculation.setText(str);
						ch='-';
					}
				}	
			}
		});
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=txtCalculation.getText();
				if(s.length()!=0){
					if(s.charAt(s.length()-1)!='*' && s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1)!='+'
							&& s.charAt(s.length()-1)!='/'&&s.charAt(s.length()-1)!='%'){
						String str=txtCalculation.getText()+btnMultiple.getText();
						txtCalculation.setText(str);
						ch='*';
					}
				}	
			}
		});
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=txtCalculation.getText();
				if(s.length()!=0){
					if(s.charAt(s.length()-1)!='/' && s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1)!='+'
							&& s.charAt(s.length()-1)!='*'&&s.charAt(s.length()-1)!='%'){
						String str=txtCalculation.getText()+btnDivision.getText();
						txtCalculation.setText(str);
						ch='/';
					}
				}
			}
		});
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=txtCalculation.getText();
				if(s.charAt(s.length()-1)!='+'&&s.charAt(s.length()-1)!='-'&&
						s.charAt(s.length()-1)!='*'&&s.charAt(s.length()-1)!='/'
						&&s.charAt(s.length()-1)!='%'){
					String str=txtCalculation.getText()+btnPercent.getText();
					txtCalculation.setText(str);
					ch='%';
				}
			}
		});
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCalculation.setText("");
				txtResult.setText("");
			}
		});
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCalculation.setText("");
				txtResult.setText("");
			}
		});
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length=txtCalculation.getText().length();
				String s;
				if(length>0){
					String str=txtCalculation.getText();
					s=str.substring(0, str.length()-1);
					txtCalculation.setText(s);
				}
				/*String store;
				int length=txtCalculation.getText().length();
				if(length>0){
					StringBuilder builder=new StringBuilder(txtCalculation.getText());
					builder.deleteCharAt(txtCalculation.getText().length()-1);
					store=builder.toString();
					txtCalculation.setText(store);
				}*/
			}
		});
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DecimalFormat df=new DecimalFormat("#.##");
				String str=txtCalculation.getText();
				if(str.length()>2){
					String []b=str.split("[/*+-]");
					double num1=Double.parseDouble(b[0]);
					double num2=Double.parseDouble(b[1]);
					double result=0;
					switch(ch){			
						case '+':
							result=num1+num2;
							break;
						case '-':
							result=num1-num2;
							break;
						case '*':
							result=num1*num2;
							break;
						case '/':
							result=num1/num2;
							break;
						case '%':
							result=num1%num2;
							break;
						default:
							break;			
					}
					String res=String.format("%.4f", result);
					//String res=df.format(result);
					//String res=Double.toString(result);
					txtResult.setText(res);
					txtCalculation.setText("");
				}
			}
		});
	}
	private void mouseAction() {
		btnCE.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnCE.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
                btnCE.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnC.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnC.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnC.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnBackSpace.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {

			}
			public void mouseExited(MouseEvent e) {
				btnBackSpace.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnBackSpace.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnDivision.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {

			}
			public void mouseExited(MouseEvent e) {
				btnDivision.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnDivision.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnSeven.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {

			}
			public void mouseExited(MouseEvent e) {
				btnSeven.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnSeven.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnEight.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnEight.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnEight.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNine.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnNine.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnNine.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMultiple.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnMultiple.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnMultiple.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnFour.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnFour.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnFour.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnFive.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnFive.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnFive.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnSix.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnSix.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnSix.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMinues.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {

			}
			public void mouseExited(MouseEvent e) {
				btnMinues.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnMinues.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnOne.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {

			}
			public void mouseExited(MouseEvent e) {
				btnOne.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnOne.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnTwo.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnTwo.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnTwo.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnThree.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnThree.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnThree.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnPlus.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 
			}
			public void mouseExited(MouseEvent e) {
				btnPlus.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnPlus.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnSqrt.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				btnSqrt.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnSqrt.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnZero.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnZero.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnZero.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnDot.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnDot.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnDot.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnEqual.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnEqual.setBackground(Color.decode("#F4F4F4"));
			}
			public void mouseEntered(MouseEvent e) {
				btnEqual.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnPercent.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnPercent.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnPercent.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnRoot.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnRoot.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnRoot.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnXSquere.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnXSquere.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnXSquere.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnOneByX.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnOneByX.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnOneByX.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnMplus.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnMplus.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnMplus.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMplus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				btnMR.setEnabled(true);
				btnMC.setEnabled(true);
				btnM.setEnabled(true);
				btnMC.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
 					}
					public void mousePressed(MouseEvent e) {
 					}
					public void mouseExited(MouseEvent e) {
						btnMC.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnMC.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
 					}
				});
				btnMR.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
 					}
					public void mousePressed(MouseEvent e) {
 					}
					public void mouseExited(MouseEvent e) {
						btnMR.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnMR.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
					}
				});
				btnM.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
 					}
					public void mousePressed(MouseEvent e) {
 					}
					public void mouseExited(MouseEvent e) {
						btnM.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnM.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
 					}
				});
			}
		});
		btnMminues.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				btnMR.setEnabled(true);
				btnMC.setEnabled(true);
				btnM.setEnabled(true);
				btnMC.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
 					}
					public void mousePressed(MouseEvent e) {
 					}
					public void mouseExited(MouseEvent e) {
						btnMC.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnMC.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
 					}
				});
				btnMR.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
 					}
					public void mousePressed(MouseEvent e) {
 					}
					public void mouseExited(MouseEvent e) {
						btnMR.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnMR.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
					}
				});
				btnM.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
 					}
					public void mousePressed(MouseEvent e) {
 					}
					public void mouseExited(MouseEvent e) {
						btnM.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnM.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
					}
				});
			}
		});
		btnMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnMR.setEnabled(true);
				btnMC.setEnabled(true);
				btnM.setEnabled(true);
				btnMC.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
					}
					public void mousePressed(MouseEvent e) {
					}
					public void mouseExited(MouseEvent e) {
						btnMC.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnMC.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
					}
				});
				btnMR.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
					}
					public void mousePressed(MouseEvent e) {
					}
					public void mouseExited(MouseEvent e) {
						btnMR.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnMR.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
					}
				});
				btnM.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {
					}
					public void mousePressed(MouseEvent e) {
					}
					public void mouseExited(MouseEvent e) {
						btnM.setBackground(Color.WHITE);
					}
					public void mouseEntered(MouseEvent e) {
						btnM.setBackground(Color.decode("#DCDCDC"));
					}
					public void mouseClicked(MouseEvent e) {
					}
				});
			}
		});
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnMR.setEnabled(false);
				btnMC.setEnabled(false);
				btnM.setEnabled(false);
				
			}
		});
		btnMminues.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnMminues.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnMminues.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		btnMS.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnMS.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnMS.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		
		/*menu.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				//btnCE.setBackground(Color.decode("#F4F4F4"));
			}
			public void mousePressed(MouseEvent e) {
				//btnCE.setBackground(Color.decode("#BDFCC9"));
			}
			public void mouseExited(MouseEvent e) {
				menu.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				menu.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
				//btnCE.setBackground(Color.decode("#BDFCC9"));
			}
		});*/
		btnHistory.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
 			}
			public void mousePressed(MouseEvent e) {
 			}
			public void mouseExited(MouseEvent e) {
				btnHistory.setBackground(Color.WHITE);
			}
			public void mouseEntered(MouseEvent e) {
				btnHistory.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent e) {
 			}
		});
		/*btnStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnStandard.setBackground(Color.decode("#00FA9A"));
			}
		});*/
		btnStandard.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				//btnStandard.setBackground(Color.decode("#00FA9A"));
				/*if(btnStandard.isSelected()){
					btnStandard.setBackground(Color.decode("#00FA9A"));
				}*/
			}
			public void mouseExited(MouseEvent arg0) {
				btnStandard.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnStandard.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnScientific.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnScientific.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnScientific.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnProgrammer.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnProgrammer.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnProgrammer.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnDateCalculation.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnDateCalculation.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnDateCalculation.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnVolume.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnVolume.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnVolume.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnLength.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnLength.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnLength.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnWeightandHeight.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnWeightandHeight.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnWeightandHeight.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnTemperature.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnTemperature.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnTemperature.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnEnergy.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnEnergy.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnEnergy.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnArea.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnArea.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnArea.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnSpeed.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnSpeed.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnSpeed.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnTime.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnTime.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnTime.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnPower.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnPower.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnPower.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnData.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnData.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnData.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnPressure.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnPressure.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnPressure.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnAngle.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				btnAngle.setBackground(Color.decode("#F5F5F5"));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnAngle.setBackground(Color.decode("#DCDCDC"));
			}
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
	}
	public void init(){
		setSize(355, 560);
		setVisible(true);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
	}
	public void cmp(){
		add(mainPanel);
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.setLayout(new BorderLayout());
		
		mainPanel.add(panelNorth,BorderLayout.NORTH);
		panelNorth();
		mainPanel.add(panelCenter,BorderLayout.CENTER);
		panelCenter();
		mainPanel.add(panelSouth,BorderLayout.SOUTH);
		panelSouth();
		
	}
	private void panelNorth() {
		panelNorth.setPreferredSize(new Dimension(0, 45));
		panelNorth.setLayout(new BorderLayout());	
		panelNorth.add(panelNorthWest, BorderLayout.WEST);
		panelNorthWest();
		panelNorth.add(panelNorthCenter, BorderLayout.CENTER);
		panelNorthCenter();
		panelNorth.add(panelNorthEast, BorderLayout.EAST);
		panelNorthEast();
	}
	private void panelNorthEast() {
		panelNorthEast.setPreferredSize(new Dimension(60, 0));
		Font font=new Font("clibari", Font.BOLD, 14);
		GridLayout grid=new GridLayout(1,1);
		panelNorthEast.setLayout(grid);
		panelNorthEast.add(btnHistory);
		btnHistory.setFont(font);
		btnHistory.setBorderPainted(false);
		btnHistory.setBackground(Color.WHITE);
		btnHistory.setEnabled(false);
	}
	private void panelNorthWest() {
		panelNorthWest.setPreferredSize(new Dimension(50, 0));
		panelNorthWest.setBackground(Color.WHITE);
		panelNorthWest.add(mainManu);
		mainMamu();
	}
	private void mainMamu() {
		mainManu.add(menu);
		mainManu.setPreferredSize(new Dimension(25, 30));
		//menu.setBackground(Color.WHITE);
		menu();
	}
	private void menu() {	
		Font font=new Font("clibari",Font.BOLD, 18);
		Font font1=new Font("Verdana",Font.PLAIN, 15);
		Font font2=new Font("clibari",Font.BOLD, 16);
		FlowLayout flow=new FlowLayout();
		FlowLayout flow1=new FlowLayout();
		flow.setVgap(0);

		menu.setFont(font2);
		menu.setLayout(flow1);
		flow1.setAlignment(FlowLayout.CENTER);
		
		menu.add(lblCalculator);
		lblCalculator.setFont(font);
		//menu.addSeparator();
		//lblCalculator.setForeground(Color.decode("#8B2252"));

		menu.add(manuStandard);
		manuStandard.setLayout(flow);
		manuStandard.setPreferredSize(new Dimension(248,30));		
		manuStandard.add(btnStandard);
		btnStandard.setFont(font1);
		btnStandard.setPreferredSize(new Dimension(248, 30));
		btnStandard.setBorderPainted(false);
		btnStandard.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();
		//manuStandard.setOpaque(false);

		menu.add(manuScientific);
		manuScientific.setLayout(flow);
		manuScientific.setPreferredSize(new Dimension(248, 30));
		manuScientific.add(btnScientific);
		btnScientific.setFont(font1);
		btnScientific.setPreferredSize(new Dimension(248, 30));
		btnScientific.setBorderPainted(false);
		btnScientific.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuProgrammer);
		manuProgrammer.setLayout(flow);
		manuProgrammer.setPreferredSize(new Dimension(248, 30));
		manuProgrammer.add(btnProgrammer);
		btnProgrammer.setFont(font1);
		btnProgrammer.setPreferredSize(new Dimension(248, 30));
		btnProgrammer.setBorderPainted(false);
		btnProgrammer.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuDateCalculation);
		manuDateCalculation.setLayout(flow);
		manuDateCalculation.setPreferredSize(new Dimension(248, 30));
		manuDateCalculation.add(btnDateCalculation);
		btnDateCalculation.setFont(font1);
		btnDateCalculation.setPreferredSize(new Dimension(248, 30));
		btnDateCalculation.setBorderPainted(false);
		btnDateCalculation.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(lblConvertar);
		lblConvertar.setFont(font);
		//lblConvertar.setForeground(Color.decode("#8B2252"));
		//menu.addSeparator();

		menu.add(manuVolume);
		manuVolume.setLayout(flow);
		manuVolume.setPreferredSize(new Dimension(248, 30));
		manuVolume.add(btnVolume);
		btnVolume.setFont(font1);
		btnVolume.setPreferredSize(new Dimension(248, 30));
		btnVolume.setBorderPainted(false);
		btnVolume.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuLength);
		manuLength.setLayout(flow);
		manuLength.setPreferredSize(new Dimension(248, 30));
		manuLength.add(btnLength);
		btnLength.setFont(font1);
		btnLength.setPreferredSize(new Dimension(248, 30));
		btnLength.setBorderPainted(false);
		btnLength.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuWeightandHeight);
		manuWeightandHeight.setLayout(flow);
		manuWeightandHeight.setPreferredSize(new Dimension(248, 30));		
		manuWeightandHeight.add(btnWeightandHeight);
		btnWeightandHeight.setFont(font1);
		btnWeightandHeight.setPreferredSize(new Dimension(248, 30));
		btnWeightandHeight.setBorderPainted(false);
		btnWeightandHeight.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuTemperature);
		manuTemperature.setLayout(flow);
		manuTemperature.setPreferredSize(new Dimension(248, 30));
		manuTemperature.add(btnTemperature);
		btnTemperature.setFont(font1);
		btnTemperature.setPreferredSize(new Dimension(248, 30));
		btnTemperature.setBorderPainted(false);
		btnTemperature.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();
		
		menu.add(manuEnergy);
		manuEnergy.setLayout(flow);
		manuEnergy.setPreferredSize(new Dimension(248, 30));
		manuEnergy.add(btnEnergy);
		btnEnergy.setFont(font1);
		btnEnergy.setPreferredSize(new Dimension(248, 30));
		btnEnergy.setBorderPainted(false);
		btnEnergy.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuArea);
		manuArea.setLayout(flow);
		manuArea.setPreferredSize(new Dimension(248, 30));
		manuArea.add(btnArea);
		btnArea.setFont(font1);
		btnArea.setPreferredSize(new Dimension(248, 30));
		btnArea.setBorderPainted(false);
		btnArea.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuSpeed);
		manuSpeed.setPreferredSize(new Dimension(248, 30));
		manuSpeed.setLayout(flow);
		manuSpeed.add(btnSpeed);
		btnSpeed.setFont(font1);
		btnSpeed.setPreferredSize(new Dimension(248, 30));
		btnSpeed.setBorderPainted(false);
		btnSpeed.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuTime);
		manuTime.setPreferredSize(new Dimension(248, 30));
		manuTime.setLayout(flow);
		manuTime.add(btnTime);
		btnTime.setFont(font1);
		btnTime.setPreferredSize(new Dimension(248, 30));
		btnTime.setBorderPainted(false);
		btnTime.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuPower);
		manuPower.setPreferredSize(new Dimension(248, 30));
		manuPower.setLayout(flow);
		manuPower.add(btnPower);
		btnPower.setFont(font1);
		btnPower.setPreferredSize(new Dimension(248, 30));
		btnPower.setBorderPainted(false);
		btnPower.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuData);
		manuData.setPreferredSize(new Dimension(248, 30));
		manuData.setLayout(flow);
		manuData.add(btnData);
		btnData.setFont(font1);
		btnData.setPreferredSize(new Dimension(248, 30));
		btnData.setBorderPainted(false);
		btnData.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuPressure);
		manuPressure.setPreferredSize(new Dimension(248, 30));
		manuPressure.setLayout(flow);
		manuPressure.add(btnPressure);
		btnPressure.setFont(font1);
		btnPressure.setPreferredSize(new Dimension(248, 30));
		btnPressure.setBorderPainted(false);
		btnPressure.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();

		menu.add(manuAngle);
		manuAngle.setPreferredSize(new Dimension(248, 30));
		manuAngle.setLayout(flow);
		manuAngle.add(btnAngle);
		btnAngle.setFont(font1);
		btnAngle.setPreferredSize(new Dimension(248, 30));
		btnAngle.setBorderPainted(false);
		btnAngle.setBackground(Color.decode("#F5F5F5"));
		//menu.addSeparator();
	}
	private void panelNorthCenter() {
		FlowLayout flow=new FlowLayout();
		panelNorthCenter.setLayout(flow);
		flow.setVgap(15);
		flow.setAlignment(FlowLayout.LEFT);
		Font font=new Font("Verdana", Font.BOLD, 14);	
		panelNorthCenter.add(lblStandard);
		panelNorthCenter.setBackground(Color.WHITE);
		lblStandard.setFont(font);		
	}
	private void panelCenter() {
		BorderLayout border=new BorderLayout();
		panelCenter.setLayout(border);
		panelCenter.add(panelCenterNorth, BorderLayout.NORTH);
		panelCenterNorth();
		panelCenter.add(panelCenterCenter, BorderLayout.CENTER);
		panelCenterCenter();
	}
	public void panelCenterNorth(){
		panelCenterNorth.setPreferredSize(new Dimension(0, 45));
		GridLayout grid=new GridLayout(1, 1);
		panelCenterNorth.setLayout(grid);
		panelCenterNorth.add(txtCalculation);
		txtCalculation.setBorder(BorderFactory.createTitledBorder(""));
		txtCalculation.setFont(new Font("Clibari", Font.BOLD, 16));
		txtCalculation.setBackground(Color.decode("#F0FFF0"));
	}
	public void panelCenterCenter(){
		GridLayout grid=new GridLayout(1, 1);
		panelCenterCenter.setLayout(grid);
		panelCenterCenter.add(txtResult);
		txtResult.setBorder(BorderFactory.createEmptyBorder());
		txtResult.setFont(new Font("clibari", Font.BOLD, 16));
		txtResult.setBackground(Color.decode("#F0FFF0"));
	}
	private void panelSouth() {		
		panelSouth.setPreferredSize(new Dimension(0, 390));
		BorderLayout border=new BorderLayout();
		panelSouth.setLayout(border);
		border.setVgap(1);	
		panelSouth.add(panelSouthNorth,BorderLayout.NORTH);
		panelSouthNorth();
		panelSouth.add(panelSouthCenter,BorderLayout.CENTER);
		panelSouthCenter();
	}
	private void panelSouthNorth() {
		panelSouthNorth.setPreferredSize(new Dimension(0, 40));
		GridLayout grid=new GridLayout(1, 6);
		panelSouthNorth.setLayout(grid);
		Font font=new Font("clibari", Font.PLAIN, 12);
		
		panelSouthNorth.add(btnMC);
		btnMC.setBackground(Color.WHITE);
		btnMC.setFont(font);
		btnMC.setBorderPainted(false);
		btnMC.setEnabled(false);
		btnMC.setForeground(Color.decode("#2F4F4F"));
		
		panelSouthNorth.add(btnMR);
		btnMR.setBackground(Color.WHITE);
		btnMR.setFont(font);
		btnMR.setBorderPainted(false);
		btnMR.setEnabled(false);
		btnMR.setForeground(Color.decode("#2F4F4F"));
		
		panelSouthNorth.add(btnMplus);
		btnMplus.setBackground(Color.WHITE);
		btnMplus.setFont(font);
		btnMplus.setBorderPainted(false);
		btnMplus.setForeground(Color.decode("#2F4F4F"));
		
		panelSouthNorth.add(btnMminues);
		btnMminues.setBackground(Color.WHITE);
		btnMminues.setFont(font);
		btnMminues.setBorderPainted(false);
		btnMminues.setForeground(Color.decode("#2F4F4F"));
		
		panelSouthNorth.add(btnMS);
		btnMS.setBackground(Color.WHITE);
		btnMS.setFont(font);
		btnMS.setBorderPainted(false);
		btnMS.setForeground(Color.decode("#2F4F4F"));
		
		panelSouthNorth.add(btnM);
		btnM.setBackground(Color.WHITE);
		btnM.setFont(font);
		btnM.setBorderPainted(false);
		btnM.setEnabled(false);
		btnM.setForeground(Color.decode("#2F4F4F"));
	}
	private void panelSouthCenter() {	
		GridLayout grid=new GridLayout(6,4);
		panelSouthCenter.setLayout(grid);
		/*grid.setHgap(4);
		grid.setVgap(4);*/
		Font font1=new Font("clibari", Font.BOLD, 22);
		Font font2=new Font("clibari", Font.PLAIN, 22);
		Font font3=new Font("clibari", Font.PLAIN, 15);
		Font font=new Font("clibari", Font.BOLD, 18);
		Font font4=new Font("clibari", Font.BOLD, 15);
		
		panelSouthCenter.add(btnPercent);
		btnPercent.setBackground(Color.WHITE);
		btnPercent.setFont(font);
		btnPercent.setBorderPainted(false);
		panelSouthCenter.add(btnRoot);
		btnRoot.setBackground(Color.WHITE);
		btnRoot.setFont(font4);
		btnRoot.setBorderPainted(false);
		panelSouthCenter.add(btnXSquere);
		btnXSquere.setBackground(Color.WHITE);
		btnXSquere.setFont(font4);
		btnXSquere.setBorderPainted(false);
		panelSouthCenter.add(btnOneByX);
		btnOneByX.setBackground(Color.WHITE);
		btnOneByX.setFont(font4);
		btnOneByX.setBorderPainted(false);
			
		panelSouthCenter.add(btnCE);
		btnCE.setFont(font3);
		btnCE.setBackground(Color.decode("#F4F4F4"));
		btnCE.setBorderPainted(false);
		panelSouthCenter.add(btnC);
		btnC.setFont(font3);
		btnC.setBackground(Color.decode("#F4F4F4"));
		btnC.setBorderPainted(false);
		panelSouthCenter.add(btnBackSpace);
		btnBackSpace.setFont(font3);
		btnBackSpace.setBackground(Color.decode("#F4F4F4"));
		btnBackSpace.setBorderPainted(false);
		panelSouthCenter.add(btnDivision);
		btnDivision.setFont(font2);
		btnDivision.setBackground(Color.decode("#F4F4F4"));
		btnDivision.setBorderPainted(false);
		panelSouthCenter.add(btnSeven);
		btnSeven.setFont(font1);
		btnSeven.setBackground(Color.WHITE);
		btnSeven.setBorderPainted(false);
		panelSouthCenter.add(btnEight);
		btnEight.setFont(font1);
		btnEight.setBackground(Color.WHITE);
		btnEight.setBorderPainted(false);
		panelSouthCenter.add(btnNine);
		btnNine.setFont(font1);
		btnNine.setBackground(Color.WHITE);
		btnNine.setBorderPainted(false);
		panelSouthCenter.add(btnMultiple);
		btnMultiple.setFont(font2);
		btnMultiple.setBackground(Color.decode("#F4F4F4"));
		btnMultiple.setBorderPainted(false);
		panelSouthCenter.add(btnFour);
		btnFour.setFont(font1);
		btnFour.setBackground(Color.WHITE);
		btnFour.setBorderPainted(false);
		panelSouthCenter.add(btnFive);
		btnFive.setFont(font1);
		btnFive.setBackground(Color.WHITE);
		btnFive.setBorderPainted(false);
		panelSouthCenter.add(btnSix);
		btnSix.setFont(font1);
		btnSix.setBackground(Color.WHITE);
		btnSix.setBorderPainted(false);
		panelSouthCenter.add(btnMinues);
		btnMinues.setFont(font2);
		btnMinues.setBackground(Color.decode("#F4F4F4"));
		btnMinues.setBorderPainted(false);
		panelSouthCenter.add(btnOne);
		btnOne.setFont(font1);
		btnOne.setBackground(Color.WHITE);
		btnOne.setBorderPainted(false);
		panelSouthCenter.add(btnTwo);
		btnTwo.setFont(font1);
		btnTwo.setBackground(Color.WHITE);
		btnTwo.setBorderPainted(false);
		panelSouthCenter.add(btnThree);
		btnThree.setFont(font1);
		btnThree.setBackground(Color.WHITE);
		btnThree.setBorderPainted(false);
		panelSouthCenter.add(btnPlus);
		btnPlus.setFont(font2);
		btnPlus.setBackground(Color.decode("#F4F4F4"));
		btnPlus.setBorderPainted(false);
		panelSouthCenter.add(btnSqrt);
		btnSqrt.setFont(font2);
		btnSqrt.setBackground(Color.decode("#F4F4F4"));
		btnSqrt.setBorderPainted(false);
		panelSouthCenter.add(btnZero);
		btnZero.setFont(font1);
		btnZero.setBackground(Color.WHITE);
		btnZero.setBorderPainted(false);
		panelSouthCenter.add(btnDot);
		btnDot.setFont(font1);
		btnDot.setBackground(Color.decode("#F4F4F4"));
		btnDot.setBorderPainted(false);
		panelSouthCenter.add(btnEqual);
		btnEqual.setFont(font2);
		btnEqual.setBackground(Color.decode("#F4F4F4"));
		btnEqual.setBorderPainted(false);
	}
}
