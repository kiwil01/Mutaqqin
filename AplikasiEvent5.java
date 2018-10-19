package Tugas01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AplikasiEvent5 extends JFrame{
JLabel lblnama=new JLabel("Nama Makanan");    
JTextField txnama=new JTextField(20);   
JLabel lblbeli=new JLabel("Pembelian"); 
//
    JTextField txbeli=new JTextField(7);    
JLabel lblkelamin=new JLabel("Jenis Kelamin");  
  JRadioButton pria=new JRadioButton("Pria");  
  //
  JRadioButton wanita=new JRadioButton("Wanita");   
 ButtonGroup kelompok=new ButtonGroup(); 
   JLabel lblmenu=new JLabel("Menu");  
   //
   JCheckBox mskhbg=new JCheckBox("Masak Habang");    
JCheckBox sop=new JCheckBox("Nasi Sop");    
JCheckBox lalapan=new JCheckBox("Lalapan");    
JButton cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea(); 

AplikasiEvent5()  
{       
setTitle("Masakan Banjar");       
setLocation(300,100);       
setSize(300,320);       
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    }

void KomponenVisual()   
{ 
  getContentPane().setLayout(null);      
 getContentPane().add(lblnama);     
  lblnama.setBounds(10,10,110,20);      
 getContentPane().add(txnama);     
  txnama.setBounds(110,10,175,20);       
getContentPane().add(lblbeli);      
lblbeli.setBounds(10,33,110,20);       
getContentPane().add(txbeli);      
 txbeli.setBounds(110,33,70,20);       
getContentPane().add(lblkelamin);       
lblkelamin.setBounds(10,56,80,20);       
kelompok.add(pria);       
kelompok.add(wanita);       
getContentPane().add(pria);       
pria.setBounds(105,56,50,20);   
getContentPane().add(wanita);  
      wanita.setBounds(160,56,70,20);       
getContentPane().add(lblmenu);       
lblmenu.setBounds(10,80,70,20);       
getContentPane().add(mskhbg);      
mskhbg.setBounds(105,80,150,20);       
getContentPane().add(sop);       
sop.setBounds(105,103,100,20);      
 getContentPane().add(lalapan);       
lalapan.setBounds(105,126,100,20);       
getContentPane().add(cetak);       
cetak.setBounds(10,150,270,20);       
getContentPane().add(hasil);       
hasil.setBounds(10,180,270,100);       
setVisible(true); 
}
void AksiReaksi()    
{       
 cetak.addActionListener(new ActionListener()       
{          
public void actionPerformed(ActionEvent e)          
{             
hasil.append(txnama.getText()+"\n");             
hasil.append(txbeli.getText()+"\n");             
if(pria.isSelected()==true)             
{                
hasil.append(pria.getText()+"\n");             
}             
else             
{                
hasil.append(wanita.getText()+"\n");             
} 
 
if(mskhbg.isSelected()==true)             
{                
hasil.append(mskhbg.getText()+"\n");             
}             
if(sop.isSelected()==true)             
{                
hasil.append(sop.getText()+"\n");             
}             
if(lalapan.isSelected()==true)             
{                
hasil.append(lalapan.getText()+"\n");             
} 

         }
       });    
} 
 
   public static void main(String args[])    
{       
AplikasiEvent5 e5=new AplikasiEvent5();       
e5.KomponenVisual();       
e5.AksiReaksi();      
}
}


