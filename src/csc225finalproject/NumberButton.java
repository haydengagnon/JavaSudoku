/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc225finalproject;

import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author colli
 */
public class NumberButton extends JButton{
    
    private String value; //Each number button will have a value
    
    
    public String GetValue() { //Gets the value of the button
        return value;
    }
    
    public void SetValue(String value) { //Sets the value of the button
        this.value = value;
    }
    
    
    /**
     * Default constructor
     */
    public NumberButton(){} 
    
    /**
     * Full Constructor
     * @param value takes in the value of the number button
     */
    public NumberButton(String value){
        
        SetValue(value);
        
    }

    
    /**
     * This method is run when someone clicks on a number button. It will set whichever
     * button is on alert to the same value as itself and update their appearance.
     */
    public void changeBoardButton(){
        
        
        if(BoardButton.boardButtonOnAlert.IsStartingSquare()){
        

        }
        
        else{
        
        BoardButton.boardButtonOnAlert.SetValue(this.GetValue());
        BoardButton.boardButtonOnAlert.SetHasValue(true);
        BoardButton.boardButtonOnAlert.displayText();
        }
        
        
    }
    
    
    //displays the text on the number button
    public void displayText(){
        
        this.setText(this.GetValue());
        this.setFont(new Font("Arial", Font.PLAIN, 40));
        
    }
    
    
    
}
