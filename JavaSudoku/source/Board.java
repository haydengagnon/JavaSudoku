
package csc225finalproject;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import java.util.Scanner;

public class Board {
       
    private JFrame frame;
    private JLabel title;
    private JPanel sudokuBoard;
    private JPanel gameButtons;
    private JPanel numberButtons;
    public Board(){
     
        

        prepareGUI();
    
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
        System.out.println("Welcome to Sudoku! Please choose a difficulty:");
        System.out.println("A: Easy");
        System.out.println("B: Medium");
        System.out.println("C: Hard");
        System.out.println("Q: Quit");
        
        int loopNumber = 0;
        
        while(loopNumber == 0){
        
        Scanner input = new Scanner(System.in);
        String userChoice = input.next().trim().toUpperCase();
        
        if(userChoice.equals("A")){
            Board swingControlDemo = new Board();
            swingControlDemo.startNewGame(userChoice);
            loopNumber++;
        }
        else if(userChoice.equals("B")){
            Board swingControlDemo = new Board();
            swingControlDemo.startNewGame(userChoice);
            loopNumber++;
        }
        else if(userChoice.equals("C")){
            Board swingControlDemo = new Board();
            swingControlDemo.startNewGame(userChoice);
            loopNumber++;
        }
        else if(userChoice.equals("Q")){
            break;
        }
        else{
            System.out.println("Please enter a valid Option");
        }
        }
     
      
    }
      private void startNewGame(String difficulty){
        
        showButtonDemo(difficulty);
        
    
      
    }
    
      private void prepareGUI(){
      frame = new JFrame("Sudoku");
      frame.setSize(900,650);
      frame.setLayout(null);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
      sudokuBoard = new JPanel();
      sudokuBoard.setSize(500,500);
      sudokuBoard.setLocation(50,100);
      sudokuBoard.setLayout(new GridLayout(9,9));
      title = new JLabel("Sudoku");
      title.setFont(new Font("Times New Roman", Font.BOLD, 30));
      title.setSize(100, 100);
      title.setLocation(400, 10);
      gameButtons = new JPanel();
      gameButtons.setSize(300, 200);
      gameButtons.setLocation(550, 125);
      gameButtons.setLayout(new BoxLayout(gameButtons, BoxLayout.PAGE_AXIS));
      numberButtons = new JPanel();
      numberButtons.setSize(250, 250);
      numberButtons.setLocation(575, 340);
      numberButtons.setLayout(new GridLayout(3, 3, 5, 5));
      frame.add(title);
      frame.add(sudokuBoard);
      frame.add(gameButtons);
      frame.add(numberButtons);
      
      frame.setVisible(true);
   }

      
      /**
       * Create all of the Buttons for the board
       */
      private void showButtonDemo(String difficulty){
      BoardButton sudokuButton1 = new BoardButton();
      BoardButton sudokuButton2 = new BoardButton();
      BoardButton sudokuButton3 = new BoardButton();
      BoardButton sudokuButton4 = new BoardButton();
      BoardButton sudokuButton5 = new BoardButton();
      BoardButton sudokuButton6 = new BoardButton();
      BoardButton sudokuButton7 = new BoardButton();
      BoardButton sudokuButton8 = new BoardButton();
      BoardButton sudokuButton9 = new BoardButton();
      BoardButton sudokuButton10 = new BoardButton();
      BoardButton sudokuButton11 = new BoardButton();
      BoardButton sudokuButton12 = new BoardButton();
      BoardButton sudokuButton13 = new BoardButton();
      BoardButton sudokuButton14 = new BoardButton();
      BoardButton sudokuButton15 = new BoardButton();
      BoardButton sudokuButton16 = new BoardButton();
      BoardButton sudokuButton17 = new BoardButton();
      BoardButton sudokuButton18 = new BoardButton();
      BoardButton sudokuButton19 = new BoardButton();
      BoardButton sudokuButton20 = new BoardButton();
      BoardButton sudokuButton21 = new BoardButton();
      BoardButton sudokuButton22 = new BoardButton();
      BoardButton sudokuButton23 = new BoardButton();
      BoardButton sudokuButton24 = new BoardButton();
      BoardButton sudokuButton25 = new BoardButton();
      BoardButton sudokuButton26 = new BoardButton();
      BoardButton sudokuButton27 = new BoardButton();
      BoardButton sudokuButton28 = new BoardButton();
      BoardButton sudokuButton29 = new BoardButton();
      BoardButton sudokuButton30 = new BoardButton();
      BoardButton sudokuButton31 = new BoardButton();
      BoardButton sudokuButton32 = new BoardButton();
      BoardButton sudokuButton33 = new BoardButton();
      BoardButton sudokuButton34 = new BoardButton();
      BoardButton sudokuButton35 = new BoardButton();
      BoardButton sudokuButton36 = new BoardButton();
      BoardButton sudokuButton37 = new BoardButton();
      BoardButton sudokuButton38 = new BoardButton();
      BoardButton sudokuButton39 = new BoardButton();
      BoardButton sudokuButton40 = new BoardButton();
      BoardButton sudokuButton41 = new BoardButton();
      BoardButton sudokuButton42 = new BoardButton();
      BoardButton sudokuButton43 = new BoardButton();
      BoardButton sudokuButton44 = new BoardButton();
      BoardButton sudokuButton45 = new BoardButton();
      BoardButton sudokuButton46 = new BoardButton();
      BoardButton sudokuButton47 = new BoardButton();
      BoardButton sudokuButton48 = new BoardButton();
      BoardButton sudokuButton49 = new BoardButton();
      BoardButton sudokuButton50 = new BoardButton();
      BoardButton sudokuButton51 = new BoardButton();
      BoardButton sudokuButton52 = new BoardButton();
      BoardButton sudokuButton53 = new BoardButton();
      BoardButton sudokuButton54 = new BoardButton();
      BoardButton sudokuButton55 = new BoardButton();
      BoardButton sudokuButton56 = new BoardButton();
      BoardButton sudokuButton57 = new BoardButton();
      BoardButton sudokuButton58 = new BoardButton();
      BoardButton sudokuButton59 = new BoardButton();
      BoardButton sudokuButton60 = new BoardButton();
      BoardButton sudokuButton61 = new BoardButton();
      BoardButton sudokuButton62 = new BoardButton();
      BoardButton sudokuButton63 = new BoardButton();
      BoardButton sudokuButton64 = new BoardButton();
      BoardButton sudokuButton65 = new BoardButton();
      BoardButton sudokuButton66 = new BoardButton();
      BoardButton sudokuButton67 = new BoardButton();
      BoardButton sudokuButton68 = new BoardButton();
      BoardButton sudokuButton69 = new BoardButton();
      BoardButton sudokuButton70 = new BoardButton();
      BoardButton sudokuButton71 = new BoardButton();
      BoardButton sudokuButton72 = new BoardButton();
      BoardButton sudokuButton73 = new BoardButton();
      BoardButton sudokuButton74 = new BoardButton();
      BoardButton sudokuButton75 = new BoardButton();
      BoardButton sudokuButton76 = new BoardButton();
      BoardButton sudokuButton77 = new BoardButton();
      BoardButton sudokuButton78 = new BoardButton();
      BoardButton sudokuButton79 = new BoardButton();
      BoardButton sudokuButton80 = new BoardButton();
      BoardButton sudokuButton81 = new BoardButton();
      
      
      
      //Creating gameplay buttons (new game, hint, check answers)
      NewGameButton newGame = new NewGameButton();
      newGame.setText("NewGame");
      newGame.setFont(new Font("Arial", Font.PLAIN, 16));
      HintButton hint = new HintButton();
      hint.setText("Hint");
      hint.setFont(new Font("Arial", Font.PLAIN, 20));
      CheckButton checkAnswers = new CheckButton();
      checkAnswers.setText("Check");
      checkAnswers.setFont(new Font("Arial", Font.PLAIN, 20));
      newGame.setAlignmentX(Component.CENTER_ALIGNMENT);
      hint.setAlignmentX(Component.CENTER_ALIGNMENT);
      checkAnswers.setAlignmentX(Component.CENTER_ALIGNMENT);
      newGame.setMaximumSize(new Dimension(120, 60));
      hint.setMaximumSize(new Dimension(120, 60));
      checkAnswers.setMaximumSize(new Dimension(120, 60));

      
      //Creating Number pad buttons
      NumberButton enterNumber1 = new NumberButton("1");
      NumberButton enterNumber2 = new NumberButton("2");
      NumberButton enterNumber3 = new NumberButton("3");
      NumberButton enterNumber4 = new NumberButton("4");
      NumberButton enterNumber5 = new NumberButton("5");
      NumberButton enterNumber6 = new NumberButton("6");
      NumberButton enterNumber7 = new NumberButton("7");
      NumberButton enterNumber8 = new NumberButton("8");
      NumberButton enterNumber9 = new NumberButton("9");
      
      //Display the tect for those numbers
      enterNumber1.displayText();
      enterNumber2.displayText();
      enterNumber3.displayText();
      enterNumber4.displayText();
      enterNumber5.displayText();
      enterNumber6.displayText();
      enterNumber7.displayText();
      enterNumber8.displayText();
      enterNumber9.displayText();

      
      
      //Creating a 3d array of the board
      BoardButton[][] bigArray = {
          
          {sudokuButton1,sudokuButton2,sudokuButton3,sudokuButton4,sudokuButton5,sudokuButton6,sudokuButton7,sudokuButton8,sudokuButton9},
          {sudokuButton10,sudokuButton11,sudokuButton12,sudokuButton13,sudokuButton14,sudokuButton15,sudokuButton16,sudokuButton17,sudokuButton18},
          {sudokuButton19,sudokuButton20,sudokuButton21,sudokuButton22,sudokuButton23,sudokuButton24,sudokuButton25,sudokuButton26,sudokuButton27},
          {sudokuButton28,sudokuButton29,sudokuButton30,sudokuButton31,sudokuButton32,sudokuButton33,sudokuButton34,sudokuButton35,sudokuButton36},
          {sudokuButton37,sudokuButton38,sudokuButton39,sudokuButton40,sudokuButton41,sudokuButton42,sudokuButton43,sudokuButton44,sudokuButton45},
          {sudokuButton46,sudokuButton47,sudokuButton48,sudokuButton49,sudokuButton50,sudokuButton51,sudokuButton52,sudokuButton53,sudokuButton54},
          {sudokuButton55,sudokuButton56,sudokuButton57,sudokuButton58,sudokuButton59,sudokuButton60,sudokuButton61,sudokuButton62,sudokuButton63},
          {sudokuButton64,sudokuButton65,sudokuButton66,sudokuButton67,sudokuButton68,sudokuButton69,sudokuButton70,sudokuButton71,sudokuButton72},
          {sudokuButton73,sudokuButton74,sudokuButton75,sudokuButton76,sudokuButton77,sudokuButton78,sudokuButton79,sudokuButton80,sudokuButton81},
      };
      
       BoardButton[] topLeft = {sudokuButton1,sudokuButton2,sudokuButton3,sudokuButton10,sudokuButton11,sudokuButton12,sudokuButton19,sudokuButton20,sudokuButton21};
       BoardButton[] topMiddle = {sudokuButton4,sudokuButton5,sudokuButton6,sudokuButton13,sudokuButton14,sudokuButton15,sudokuButton22,sudokuButton23,sudokuButton24};
       BoardButton[] topRight = {sudokuButton7,sudokuButton8,sudokuButton9,sudokuButton16,sudokuButton17,sudokuButton18,sudokuButton25,sudokuButton26,sudokuButton27};
       BoardButton[] middleLeft = {sudokuButton28,sudokuButton29,sudokuButton30,sudokuButton37,sudokuButton38,sudokuButton39,sudokuButton46,sudokuButton47,sudokuButton48};
       BoardButton[] middleMiddle = {sudokuButton31,sudokuButton32,sudokuButton33,sudokuButton40,sudokuButton41,sudokuButton42,sudokuButton49,sudokuButton50,sudokuButton51};
       BoardButton[] middleRight = {sudokuButton34,sudokuButton35,sudokuButton36,sudokuButton43,sudokuButton44,sudokuButton45,sudokuButton52,sudokuButton53,sudokuButton54};
       BoardButton[] bottomLeft = {sudokuButton55,sudokuButton56,sudokuButton57,sudokuButton64,sudokuButton65,sudokuButton66,sudokuButton73,sudokuButton74,sudokuButton75};
       BoardButton[] bottomMiddle = {sudokuButton58,sudokuButton59,sudokuButton60,sudokuButton67,sudokuButton68,sudokuButton69,sudokuButton76,sudokuButton77,sudokuButton78};
       BoardButton[] bottomRight = {sudokuButton61,sudokuButton62,sudokuButton63,sudokuButton70,sudokuButton71,sudokuButton72,sudokuButton79,sudokuButton80,sudokuButton81};
       
       BoardButton[] Row1 = {sudokuButton1,sudokuButton2,sudokuButton3,sudokuButton4,sudokuButton5,sudokuButton6,sudokuButton7,sudokuButton8,sudokuButton9};
       BoardButton[] Row2 = {sudokuButton10,sudokuButton11,sudokuButton12,sudokuButton13,sudokuButton14,sudokuButton15,sudokuButton16,sudokuButton17,sudokuButton18};
       BoardButton[] Row3 = {sudokuButton19,sudokuButton20,sudokuButton21,sudokuButton22,sudokuButton23,sudokuButton24,sudokuButton25,sudokuButton26,sudokuButton27};
       BoardButton[] Row4 = {sudokuButton28,sudokuButton29,sudokuButton30,sudokuButton31,sudokuButton32,sudokuButton33,sudokuButton34,sudokuButton35,sudokuButton36};
       BoardButton[] Row5 = {sudokuButton37,sudokuButton38,sudokuButton39,sudokuButton40,sudokuButton41,sudokuButton42,sudokuButton43,sudokuButton44,sudokuButton45};
       BoardButton[] Row6 = {sudokuButton46,sudokuButton47,sudokuButton48,sudokuButton49,sudokuButton50,sudokuButton51,sudokuButton52,sudokuButton53,sudokuButton54};
       BoardButton[] Row7 = {sudokuButton55,sudokuButton56,sudokuButton57,sudokuButton58,sudokuButton59,sudokuButton60,sudokuButton61,sudokuButton62,sudokuButton63};
       BoardButton[] Row8 = {sudokuButton64,sudokuButton65,sudokuButton66,sudokuButton67,sudokuButton68,sudokuButton69,sudokuButton70,sudokuButton71,sudokuButton72};
       BoardButton[] Row9 = {sudokuButton73,sudokuButton74,sudokuButton75,sudokuButton76,sudokuButton77,sudokuButton78,sudokuButton79,sudokuButton80,sudokuButton81};

       BoardButton[] col1 = {sudokuButton1,sudokuButton10,sudokuButton19,sudokuButton28,sudokuButton37,sudokuButton46,sudokuButton55,sudokuButton64,sudokuButton73};
       BoardButton[] col2 = {sudokuButton2,sudokuButton11,sudokuButton20,sudokuButton29,sudokuButton38,sudokuButton47,sudokuButton56,sudokuButton65,sudokuButton74};
       BoardButton[] col3 = {sudokuButton3,sudokuButton12,sudokuButton21,sudokuButton30,sudokuButton39,sudokuButton48,sudokuButton57,sudokuButton66,sudokuButton75};
       BoardButton[] col4 = {sudokuButton4,sudokuButton13,sudokuButton22,sudokuButton31,sudokuButton40,sudokuButton49,sudokuButton58,sudokuButton67,sudokuButton76};
       BoardButton[] col5 = {sudokuButton5,sudokuButton14,sudokuButton23,sudokuButton32,sudokuButton41,sudokuButton50,sudokuButton59,sudokuButton68,sudokuButton77};
       BoardButton[] col6 = {sudokuButton6,sudokuButton15,sudokuButton24,sudokuButton33,sudokuButton42,sudokuButton51,sudokuButton60,sudokuButton69,sudokuButton78};
       BoardButton[] col7 = {sudokuButton7,sudokuButton16,sudokuButton25,sudokuButton34,sudokuButton43,sudokuButton52,sudokuButton61,sudokuButton70,sudokuButton79};
       BoardButton[] col8 = {sudokuButton8,sudokuButton17,sudokuButton26,sudokuButton35,sudokuButton44,sudokuButton53,sudokuButton62,sudokuButton71,sudokuButton80};
       BoardButton[] col9 = {sudokuButton9,sudokuButton18,sudokuButton27,sudokuButton36,sudokuButton45,sudokuButton54,sudokuButton63,sudokuButton72,sudokuButton81};
       
       
       /*String[][] puzzle = {
      
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
      };
       
       Random random = new Random();
           
       
       for(int ii = 0; ii < 9;ii++){
           
       
           for(int jj = 0; jj < 9;jj++){
           
               int value = random.nextInt(9) + 1;
               String valueString = String.valueOf(value);    
               
               
               
               
               puzzle[ii][jj] = valueString;
               
               
           
           }
           
           
       
       }
       */
       
       
       
       String color1 = "#D3D3D3";
       String color2 = "#C4C4C4";
       
      
      for(int ii = 0; ii < topLeft.length;ii++){
          
          topLeft[ii].setBackground(Color.decode(color1));
          topMiddle[ii].setBackground(Color.decode(color2));
          topRight[ii].setBackground(Color.decode(color1));
          middleLeft[ii].setBackground(Color.decode(color2));
          middleMiddle[ii].setBackground(Color.decode(color1));
          middleRight[ii].setBackground(Color.decode(color2));
          bottomLeft[ii].setBackground(Color.decode(color1));
          bottomMiddle[ii].setBackground(Color.decode(color2));
          bottomRight[ii].setBackground(Color.decode(color1));
          
      }
      
      
      
      //Add number buttons to their panel
      numberButtons.add(enterNumber7);
      numberButtons.add(enterNumber8);
      numberButtons.add(enterNumber9);
      numberButtons.add(enterNumber4);
      numberButtons.add(enterNumber5);
      numberButtons.add(enterNumber6);
      numberButtons.add(enterNumber1);
      numberButtons.add(enterNumber2);
      numberButtons.add(enterNumber3);
      
      //Add gameplay buttons to their JPanel
      gameButtons.add(newGame);
      gameButtons.add(Box.createRigidArea(new Dimension(0,20)));
      gameButtons.add(hint);
      gameButtons.add(Box.createRigidArea(new Dimension(0,20)));
      gameButtons.add(checkAnswers);


      
      
      
      
      //Add the board buttons to the game
      sudokuBoard.add(sudokuButton1);
      sudokuBoard.add(sudokuButton2);
      sudokuBoard.add(sudokuButton3);
      sudokuBoard.add(sudokuButton4);
      sudokuBoard.add(sudokuButton5);
      sudokuBoard.add(sudokuButton6);
      sudokuBoard.add(sudokuButton7);
      sudokuBoard.add(sudokuButton8);
      sudokuBoard.add(sudokuButton9);
      sudokuBoard.add(sudokuButton10);
      sudokuBoard.add(sudokuButton11);
      sudokuBoard.add(sudokuButton12);
      sudokuBoard.add(sudokuButton13);
      sudokuBoard.add(sudokuButton14);
      sudokuBoard.add(sudokuButton15);
      sudokuBoard.add(sudokuButton16);
      sudokuBoard.add(sudokuButton17);
      sudokuBoard.add(sudokuButton18);
      sudokuBoard.add(sudokuButton19);
      sudokuBoard.add(sudokuButton20);
      sudokuBoard.add(sudokuButton21);
      sudokuBoard.add(sudokuButton22);
      sudokuBoard.add(sudokuButton23);
      sudokuBoard.add(sudokuButton24);
      sudokuBoard.add(sudokuButton25);
      sudokuBoard.add(sudokuButton26);
      sudokuBoard.add(sudokuButton27);
      sudokuBoard.add(sudokuButton28);
      sudokuBoard.add(sudokuButton29);
      sudokuBoard.add(sudokuButton30);
      sudokuBoard.add(sudokuButton31);
      sudokuBoard.add(sudokuButton32);
      sudokuBoard.add(sudokuButton33);
      sudokuBoard.add(sudokuButton34);
      sudokuBoard.add(sudokuButton35);
      sudokuBoard.add(sudokuButton36);
      sudokuBoard.add(sudokuButton37);
      sudokuBoard.add(sudokuButton38);
      sudokuBoard.add(sudokuButton39);
      sudokuBoard.add(sudokuButton40);
      sudokuBoard.add(sudokuButton41);
      sudokuBoard.add(sudokuButton42);
      sudokuBoard.add(sudokuButton43);
      sudokuBoard.add(sudokuButton44);
      sudokuBoard.add(sudokuButton45);
      sudokuBoard.add(sudokuButton46);
      sudokuBoard.add(sudokuButton47);
      sudokuBoard.add(sudokuButton48);
      sudokuBoard.add(sudokuButton49);
      sudokuBoard.add(sudokuButton50);
      sudokuBoard.add(sudokuButton51);
      sudokuBoard.add(sudokuButton52);
      sudokuBoard.add(sudokuButton53);
      sudokuBoard.add(sudokuButton54);
      sudokuBoard.add(sudokuButton55);
      sudokuBoard.add(sudokuButton56);
      sudokuBoard.add(sudokuButton57);
      sudokuBoard.add(sudokuButton58);
      sudokuBoard.add(sudokuButton59);
      sudokuBoard.add(sudokuButton60);
      sudokuBoard.add(sudokuButton61);
      sudokuBoard.add(sudokuButton62);
      sudokuBoard.add(sudokuButton63);
      sudokuBoard.add(sudokuButton64);
      sudokuBoard.add(sudokuButton65);
      sudokuBoard.add(sudokuButton66);
      sudokuBoard.add(sudokuButton67);
      sudokuBoard.add(sudokuButton68);
      sudokuBoard.add(sudokuButton69);
      sudokuBoard.add(sudokuButton70);
      sudokuBoard.add(sudokuButton71);
      sudokuBoard.add(sudokuButton72);
      sudokuBoard.add(sudokuButton73);
      sudokuBoard.add(sudokuButton74);
      sudokuBoard.add(sudokuButton75);
      sudokuBoard.add(sudokuButton76);
      sudokuBoard.add(sudokuButton77);
      sudokuBoard.add(sudokuButton78);
      sudokuBoard.add(sudokuButton79);
      sudokuBoard.add(sudokuButton80);
      sudokuBoard.add(sudokuButton81);

      frame.setVisible(true);
      
      
      
      

      
      String[][] puzzle = {
      
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
          {"","","","","","","","",""},
      };
      
      createNewPuzzle(puzzle);
      
      
      Boolean[][] easy1 = {
          
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},
          {false,false,false,false,false,false,false,false,false},};
      
      createNewDifficulty(easy1,difficulty);
      
      
      
      
      for(int ii = 0; ii < 9;ii++){
          for(int jj = 0; jj < 9;jj++){
              
              bigArray[ii][jj].SetValue(puzzle[ii][jj]);
              bigArray[ii][jj].SetHasValue(easy1[ii][jj]);
              bigArray[ii][jj].SetStartingSquare(easy1[ii][jj]);
              bigArray[ii][jj].displayText();
              
          }
      
      
      }
      
      
      
      
      /**
       * The next about 500 lines of code is adding action listeners for each of the buttons.
       * upon click it runs the method associated with the button which is located at the bottom
       * of the class labeled with the ActionPerformed.
       */
      sudokuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton1);
            }
        });
      
      
      sudokuButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt,sudokuButton2);
            }
        });
      
      sudokuButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton3);
            }
        });
      
      sudokuButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton4);
            }
        });
      
      sudokuButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton5);
            }
        });
      
      sudokuButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton6);
            }
        });
      
      sudokuButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton7);
            }
        });
      
      sudokuButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton8);
            }
        });
      
      sudokuButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton9);
            }
        });
      
      sudokuButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton10);
            }
        });
      
      sudokuButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton11);
            }
        });
      
      sudokuButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton12);
            }
        });
      
      sudokuButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton13);
            }
        });
      
      sudokuButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton14);
            }
        });
      
      sudokuButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton15);
            }
        });
      
      sudokuButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton16);
            }
        });
      
      sudokuButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton17);
            }
        });
      
      sudokuButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton18);
            }
        });
      
      sudokuButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton19);
            }
        });
      
      sudokuButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton20);
            }
        });
      
      sudokuButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton21);
            }
        });
      
      sudokuButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton22);
            }
        });
      
      sudokuButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton23);
            }
        });
      
      sudokuButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton24);
            }
        });
      
      sudokuButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton25);
            }
        });
      
      sudokuButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton26);
            }
        });
      
      sudokuButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton27);
            }
        });
      
      sudokuButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton28);
            }
        });
      
      sudokuButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton29);
            }
        });
      
      sudokuButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton30);
            }
        });
      
      sudokuButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton31);
            }
        });
      
      sudokuButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton32);
            }
        });
      
      sudokuButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton33);
            }
        });
      
      sudokuButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton34);
            }
        });
      
      sudokuButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton35);
            }
        });
      
      sudokuButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton36);
            }
        });
      
      sudokuButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton37);
            }
        });
      
      sudokuButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton38);
            }
        });
      
      sudokuButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton39);
            }
        });
      
      sudokuButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton40);
            }
        });
      
      sudokuButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton41);
            }
        });
      
      sudokuButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton42);
            }
        });
      
      sudokuButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton43);
            }
        });
      
      sudokuButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton44);
            }
        });
      
      sudokuButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton45);
            }
        });
      
      sudokuButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton46);
            }
        });
      
      sudokuButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton47);
            }
        });
      
      sudokuButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton48);
            }
        });
      
      sudokuButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton49);
            }
        });
      
      sudokuButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton50);
            }
        });
      
      sudokuButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton51);
            }
        });
      
      sudokuButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton52);
            }
        });
      
      sudokuButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton53);
            }
        });
            
      sudokuButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton54);
            }
        });
            
      sudokuButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton55);
            }
        });
            
      sudokuButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton56);
            }
        });
            
      sudokuButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton57);
            }
        });
            
      sudokuButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton58);
            }
        });
            
      sudokuButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton59);
            }
        });
            
      sudokuButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton60);
            }
        });
            
      sudokuButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton61);
            }
        });
            
      sudokuButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton62);
            }
        });
            
      sudokuButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton63);
            }
        });
            
      sudokuButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton64);
            }
        });
            
      sudokuButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton65);
            }
        });
            
      sudokuButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton66);
            }
        });
            
      sudokuButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton67);
            }
        });
            
      sudokuButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton68);
            }
        });
            
      sudokuButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton69);
            }
        });
            
      sudokuButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton70);
            }
        });
            
      sudokuButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton71);
            }
        });
            
      sudokuButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton72);
            }
        });
            
      sudokuButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton73);
            }
        });
            
      sudokuButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton74);
            }
        });
            
      sudokuButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton75);
            }
        });
            
      sudokuButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton76);
            }
        });
            
      sudokuButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton77);
            }
        });
            
      sudokuButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton78);
            }
        });
            
      sudokuButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton79);
            }
        });
            
      sudokuButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton80);
            }
        });
           
      sudokuButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuButtonActionPerformed(evt, sudokuButton81);
            }
        });
      
       enterNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber1);
            }
        });
       
       enterNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber2);
            }
        });
       
       enterNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber3);
            }
        });
       
       enterNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber4);
            }
        });
       
       enterNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber5);
            }
        });
       
       enterNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber6);
            }
        });
       
       enterNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber7);
            }
        });
       
       enterNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber8);
            }
        });
       
       enterNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt, enterNumber9);
            }
        });
       
       
       checkAnswers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswersActionPerformed(evt, checkAnswers, bigArray, puzzle);
            }
        });
       
       
       hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintActionPerformed(evt, hint, bigArray, puzzle);
            }
        });
       
       newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt, newGame, difficulty);
            }
        });
      
      
   }
   
   
   
   
      
   private void createNewPuzzle(String[][] puzzle){
          
          
        
        
        //Creating each Array to store the numbers in
        String[] line1 = {"","","","","","","","",""};
        String[] line2 = {"","","","","","","","",""};
        String[] line3 = {"","","","","","","","",""};
        String[] line4 = {"","","","","","","","",""};
        String[] line5 = {"","","","","","","","",""};
        String[] line6 = {"","","","","","","","",""};
        String[] line7 = {"","","","","","","","",""};
        String[] line8 = {"","","","","","","","",""};
        String[] line9 = {"","","","","","","","",""};
        
        //This is where I make the board Array that has all of the strings
        String[][] puzzle1 = {
      
          line1,
          line2,
          line3,
          line4,
          line5,
          line6,
          line7,
          line8,
          line9,
      };
        //These Counters are used to prevent an infinite loop in Line 6 and Line 8
           int counter = 0; 
           int counter2 = 0;
        Random random = new Random(); //Creating the Random number generator
             

     /**
      * This first for loop is for Lines 1 - 8. It will restart if Line 8 is unable to finish the puzzle after a 
      * certain number of attempts.
      */
    for(int numberForLine8 = 0; numberForLine8 < 9; numberForLine8++){     

        /**
         * This Loop is for lines 1-6. It will restart if Line 6 is unable to finish the puzzle after a 
         * certain number of attempts.
         */
        for(int numberforLine6 = 0; numberforLine6 < 9; numberforLine6++)   {    

        
            /**
             * These lines clear all the the lines. This is so when I have to restart either of the for loops above.
             * I loop each line and set each value to having no value.
             */
            for(int jj = 0; jj < 9; jj++){line1[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line2[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line3[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line4[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line5[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line6[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line7[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line8[jj] = "";}
            for(int jj = 0; jj < 9; jj++){line9[jj] = "";}
        
        
//--------------------------LINE 1 --------------------------------------------- 

            /**
             * This for loop is for all of the values of Line 1
             */
            for(int ii = 0; ii < 9;ii++){
           
                java.util.List<String> line1List = new ArrayList<>(Arrays.asList(line1));//I have to create this list so I can run .conatins()
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
               
                if(line1List.contains(valueString)){//This checks if line 1 already has the value. This then goes back a value and restarts to get a new number
                    ii--;}
                else{//If it doesn't contain the value, then it will add the value and move to the next iteration
                   line1[ii] = valueString;}}
      
//--------------------------LINE 2 --------------------------------------------- 
       
            /**
             * This is the loop for all the values of line 2
             */
            for(int ii = 0; ii < 9;ii++){
           
                java.util.List<String> line2List = new ArrayList<>(Arrays.asList(line2));//I have to create this list so I can run .conatins()
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
       
                if(line2List.contains(valueString)){
                    ii--;}
                else if(ii<3){    
                    if(line1[0].equals(valueString) || line1[1].equals(valueString) || line1[2].equals(valueString)){
                        ii = -1;}
                    else{
                        line2[ii] = valueString;}}
                else if(ii<6){
                    if(line1[3].equals(valueString) || line1[4].equals(valueString) || line1[5].equals(valueString)){
                        ii = -1;}
                    else{
                        line2[ii] = valueString;}}
                else if(ii < 9){      
                    if(line1[6].equals(valueString) || line1[7].equals(valueString) || line1[8].equals(valueString)){
                        ii = -1;}
                    else{
                        line2[ii] = valueString;}}
                else{
                    line2[ii] = valueString;}}
 
//--------------------------LINE 3 --------------------------------------------- 
       
            for(int ii = 0; ii < 9;ii++){
       
                java.util.List<String> line3List = new ArrayList<>(Arrays.asList(line3));//I have to create this list so I can run .conatins()  
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
       
                if(line3List.contains(valueString)){
                   ii--;}
                else if(ii < 3){
                    if(line1[0].equals(valueString) || line1[1].equals(valueString) || line1[2].equals(valueString) || line2[0].equals(valueString) || line2[1].equals(valueString) || line2[2].equals(valueString)){
                        ii = -1;}
                    else{
                        line3[ii] = valueString;}}
                else if(ii < 6){
                    if(line1[3].equals(valueString) || line1[4].equals(valueString) || line1[5].equals(valueString) || line2[3].equals(valueString) || line2[4].equals(valueString) || line2[5].equals(valueString)){
                        ii--;}
                    else{
                        line3[ii] = valueString;}}
                else{line3[ii] = valueString;}}
       
//--------------------------LINE 4 --------------------------------------------- 
       
            for(int ii = 0; ii < 9;ii++){
       
                java.util.List<String> line4List = new ArrayList<>(Arrays.asList(line4));//I have to create this list so I can run .conatins()
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
       
                    if(line4List.contains(valueString)){
                        if(ii > -1){
                            ii--;}
                        else{
                            ii = -1;}} 
                    else if(line1[ii].equals(valueString) || line2[ii].equals(valueString) || line3[ii].equals(valueString)){
                        for(int jj = 0; jj < 8; jj++){line4[jj] = "";}
                            ii = -1;}
                    else{
                        line4[ii] = valueString;}}
       
//--------------------------LINE 5 --------------------------------------------- 
       
 
            for(int ii = 0; ii < 9;ii++){
       
                java.util.List<String> line5List = new ArrayList<>(Arrays.asList(line5));//I have to create this list so I can run .conatins()
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
       
                if(line5List.contains(valueString)){
                    if(ii > -1){
                        ii--;}
                    else{
                        ii = -1;}}
                else if(ii<3){
                    if(line1[ii].equals(valueString) || line2[ii].equals(valueString) || line3[ii].equals(valueString) || line4[0].equals(valueString) || line4[1].equals(valueString) || line4[2].equals(valueString)){
                        ii--;}
                    else{line5[ii] = valueString;}}
                else if (ii < 6){
                    if(line1[ii].equals(valueString) || line2[ii].equals(valueString) || line3[ii].equals(valueString) || line4[3].equals(valueString) || line4[4].equals(valueString) || line4[5].equals(valueString)){
                        for(int jj = 0; jj < 8; jj++){line5[jj] = "";}
                            ii = -1;}
                    else{line5[ii] = valueString;}}
                else{
                    if(line1[ii].equals(valueString) || line2[ii].equals(valueString) || line3[ii].equals(valueString) || line4[6].equals(valueString) || line4[7].equals(valueString) || line4[8].equals(valueString)){
                        for(int jj = 0; jj < 8; jj++){line5[jj] = "";}
                            ii = -1;}
                    else{line5[ii] = valueString;}}}
       
//--------------------------LINE 6 --------------------------------------------- 
  
            for(int ii = 0; ii < 9;ii++){
       
                java.util.List<String> line6List = new ArrayList<>(Arrays.asList(line6));//I have to create this list so I can run .conatins()
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
                
                if(counter < 1000){   
                    if(line6List.contains(valueString)){
                        if(ii > -1)
                            {ii--;}
                        else{
                            ii = -1;}}
                    else if(ii < 3){
                        if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line4[0].equals(valueString)||line4[1].equals(valueString)||line4[2].equals(valueString)||line5[0].equals(valueString)||line5[1].equals(valueString)||line5[2].equals(valueString)){
                            for(int jj = 0; jj < 8; jj++){line6[jj] = "";}
                            ii = -1;
                            counter++;
                            numberforLine6 = 0;}
                            else{line6[ii] = valueString;
                            numberforLine6++;}}
                    else if(ii < 6){
                        if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line5[3].equals(valueString)||line5[4].equals(valueString)||line5[5].equals(valueString)){
                            for(int jj = 0; jj < 8; jj++){line6[jj] = "";}
                            ii = -1;}
                        else{
                            line6[ii] = valueString;
                            numberforLine6++;}}
                    else{
                        if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line5[6].equals(valueString)||line5[7].equals(valueString)||line5[8].equals(valueString)){
                            for(int jj = 0; jj < 8; jj++){line6[jj] = "";}
                                ii = -1;}
                        else{
                            line6[ii] = valueString;
                            numberforLine6++;}}}
                else{ii = 0; counter =0;break;}}}

//--------------------------LINE 7 ---------------------------------------------
     
            for(int ii = 0; ii < 9;ii++){
     
                java.util.List<String> line7List = new ArrayList<>(Arrays.asList(line7));//I have to create this list so I can run .conatins()
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String

                if(line7List.contains(valueString)){
                    if(ii > -1){
                        ii--;}
                    else{
                        ii = -1;}}
                else{
                    if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line6[ii].equals(valueString)){
                        for(int jj = 0; jj < 8; jj++){line7[jj] = "";}
                        ii = -1;}
                    else{
                        line7[ii] = valueString;}}}
       
//--------------------------LINE 8 ---------------------------------------------
     
            for(int ii = 0; ii < 9;ii++){
     
                java.util.List<String> line8List = new ArrayList<>(Arrays.asList(line8));//I have to create this list so I can run .conatins()
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
     
                if(counter2 < 10000){ 
                    if(line8List.contains(valueString)){
                        if(ii > -1){
                            ii--;}
                        else{
                            ii = -1;}}
                    else if(ii < 3){
                        if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line6[ii].equals(valueString)||line7[0].equals(valueString)||line7[1].equals(valueString)||line7[2].equals(valueString)){
                            for(int jj = 0; jj < 8; jj++){line8[jj] = "";}
                            ii = -1;
                            numberForLine8 = 0;
                            counter2++;}
                        else{
                            line8[ii] = valueString;
                            numberForLine8++;}}
                    else if(ii < 6){
                        if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line6[ii].equals(valueString)||line7[3].equals(valueString)||line7[4].equals(valueString)||line7[5].equals(valueString)){
                            for(int jj = 0; jj < 8; jj++){line8[jj] = "";}
                            ii = -1;
                            numberForLine8 = 0;}
                        else{
                            line8[ii] = valueString;
                            numberForLine8++;}}
                    else{
                        if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line6[ii].equals(valueString)||line7[6].equals(valueString)||line7[7].equals(valueString)||line7[8].equals(valueString)){
                            for(int jj = 0; jj < 8; jj++){line8[jj] = "";}
                                ii = -1;
                                numberForLine8 = 0;}
                        else{
                            line8[ii] = valueString;
                            numberForLine8++;}}}
                    else{counter2 = 0;break;}}}
        
//--------------------------LINE 9 ---------------------------------------------
        
            for(int ii = 0; ii < 9;ii++){
     
                int value = random.nextInt(9) + 1; //Generate a Random number between 1 - 9
                String valueString = String.valueOf(value); //Convert that number to a String
        
                if(line1[ii].equals(valueString)||line2[ii].equals(valueString)||line3[ii].equals(valueString)||line4[ii].equals(valueString)||line5[ii].equals(valueString)||line6[ii].equals(valueString)||line7[ii].equals(valueString)||line8[ii].equals(valueString)){
                    ii--;}
                else{line9[ii] = valueString;}}
 
//--------------------------Creating the Board ---------------------------------
          for(int ii = 0; ii < 9;ii++){for(int jj = 0; jj < 9;jj++){puzzle[ii][jj] = puzzle1[ii][jj];}}//This sets each value of the puzzle to the one I generated     
      } 
   private void createNewDifficulty(Boolean[][] difficulty, String input){
          Random random = new Random();
          int startingNumber = 0;
          
          if(input.equals("A") ){
              startingNumber = 40;
          }
          else if(input.equals("B") ){
              startingNumber = 35;
          }
          else if(input.equals("C") ){
              startingNumber = 30;
          }
          
          
          
          int hintnumber = 0;
       
       while(hintnumber < startingNumber)
       {
            int number1 = random.nextInt(9);
            int number2 = random.nextInt(9);
           
            if(difficulty[number1][number2].equals(false)){
            
                difficulty[number1][number2] = true;
                
                hintnumber++;
            
            }
            
           
       }
          
          
      }
   private void sudokuButtonActionPerformed(java.awt.event.ActionEvent evt, BoardButton button){button.alertBoardButton();}
   private void enterNumberActionPerformed(java.awt.event.ActionEvent evt, NumberButton button){button.changeBoardButton();}
   private void checkAnswersActionPerformed(java.awt.event.ActionEvent evt, CheckButton button, BoardButton[][] array, String[][] answers){ 
       for(int ii = 0; ii < 9;ii++){
          for(int jj = 0; jj < 9;jj++){
              if(!array[ii][jj].IsStartingSquare())
                {
                  if(array[ii][jj].GetValue().equals(answers[ii][jj])){ 
                         
                    }
                  else{   
                      array[ii][jj].setForeground(Color.RED);   
                    }  
                }
              else{}   
                }
            }
       ;}
   private void hintActionPerformed(java.awt.event.ActionEvent evt, HintButton button, BoardButton[][] array, String[][] answers){ 
   
   
   Random random = new Random();

       
       int hintnumber = 0;
       
       while(hintnumber != 1)
       {
            int number1 = random.nextInt(9);
            int number2 = random.nextInt(9);
           
            if(!array[number1][number2].DoesHaveValue()){
            
                array[number1][number2].SetValue(answers[number1][number2]);
                array[number1][number2].SetHasValue(true);
                array[number1][number2].displayText();
                
                hintnumber = 1;
            
            }
            
           
       }
       

   }
   private void newGameActionPerformed(java.awt.event.ActionEvent evt, NewGameButton button, String difficulty){
   
       
        frame.removeAll();
        frame.dispose();
        prepareGUI();
        startNewGame(difficulty);
   
   };
   
   
}  
   


