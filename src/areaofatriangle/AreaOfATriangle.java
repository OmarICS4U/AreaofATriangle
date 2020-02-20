/*
Omar Sayyed
Feb/19/2020
Calculates the area of a scalene triangle given two sidelengths and an interior angle
 */

package areaofatriangle;
import javax.swing.*;
import java.lang.Math;
/**
 *
 * @author omsay9559
 */
public class AreaOfATriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables
        String inputSideA, inputSideB, inputAngleC;
        double sideA, sideB, angleC, sideC, area;
        //collect Sidelengths A and B
        inputSideA = JOptionPane.showInputDialog("Please enter sidelength a");
        sideA = Double.parseDouble(inputSideA);
        inputSideB = JOptionPane.showInputDialog("Please enter sidelength b");
        sideB = Double.parseDouble(inputSideB);
        //collect angle C in radians
        inputAngleC = JOptionPane.showInputDialog("Please enter the interior angle, C, in radians");
        angleC = Double.parseDouble(inputAngleC);
        //calculate the area
        area = ((sideA * sideB * Math.sin(angleC))/2);
        //display the area to the user
        System.out.println("the area of the triangle is " + area);
    }
    
}
