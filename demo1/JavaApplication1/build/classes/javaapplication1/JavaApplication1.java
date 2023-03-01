/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.EventQueue;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import swing.MainFrame;

/**
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           // BeautyEyeLNFHelper.frameBorderStyle=BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
           org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception ex) {}
        
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                new MainFrame().setVisible(true);
            }
        });
    }
    
}
