/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment_management;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Khoza
 */
public class Apartment_Management {
    
    public LogIn Login;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogIn Login = new LogIn();
        Login.show();
    }
    
}
