/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc225finalproject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author colli
 */
public class BoardButton extends JButton{
 
    
    private String value; // This will keep track of what number it is
    private boolean hasValue; //This will keep track of if it has a number attached to it
    private boolean StartingSquare; //This will keep track of if it is a starting square or not. This can be used to lock our starting squares
    
    
    public static BoardButton boardButtonOnAlert; // This will be implemented with the action listeners later
    
    
    
    public String GetValue() { //Returns the value
        return value;
    }
    
    public void SetValue(String value) { //Sets the value
        this.value = value;
        
    }
    
    public boolean DoesHaveValue(){ //Checks if it does haev a value
        return hasValue;
    }
    
    public void SetHasValue(boolean hasValue){ //Sets that it does have a value
    
        this.hasValue = hasValue;
        
    }
    
    public boolean IsStartingSquare(){ //Checks if it is a starting square
        return StartingSquare;
    }
    
    public void SetStartingSquare(boolean StartingSquare){//Sets that it is a starting square
    
        this.StartingSquare = StartingSquare;
        
    }
    
    
    
 
    
    /**
     * Creates just a plain Button
     */
    public BoardButton(){}
    
    /**
     * Creates a Button that has a value
     * @param value input the value of the button
     */
    public BoardButton(String value){
    SetValue(value);
    }
    
    /**
     * 
     * Full Constructor
     * 
     * @param value Enter the value of the button
     * @param hasValue state that it has a value
     * @param StartingSquare State whether it is a starting square or not
     */
    public BoardButton(String value, boolean hasValue, boolean StartingSquare){
        
        SetValue(value);
        SetHasValue(hasValue);
        SetStartingSquare(StartingSquare);
        
    }
    
    /**
     * 
     * This will be used to alert which piece the user has clicked on. 
     * 
     */
    public void alertBoardButton(){
        
        boardButtonOnAlert = this;
        
    }
    
    /**
     * 
     * This method displays the text on the button. If it has a value then it will
     * display it otherwise nothing will happen
     * 
     */
    public void displayText(){
        
        
        
            if(this.DoesHaveValue()){
                this.setText(this.GetValue());
            }
        
            else{}
        
            
            if(IsStartingSquare()){
            
                this.setForeground(Color.BLACK);
                
            }
        
            else{
                this.setForeground(Color.BLUE);
            }
            
            this.setFont(new Font("Arial", Font.PLAIN, 25));
            
    }
    

    
    
    
}
