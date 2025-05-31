/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identificationofchildrenatrisk;

import javax.swing.UIManager;

/**
 *
 * @author SEABIRDS-PC
 */
public class Main{
   public static void main(String[] args) 
    {                
        try
        {                    
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
            
            MainFrame mf=new MainFrame();
            mf.setTitle("Main Frame");
            mf.setVisible(true);
            mf.setResizable(false);
        }
        catch (Exception ex)
        {

        }   
    } 
}
