import java.awt.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class TurtleGraphics extends OOPGraphics{

    public static void main(String[] args) {
        new TurtleGraphics(); //create instance of class that extends OOPGraphics (could be separate class without main), gets out of static context
    }

    public TurtleGraphics()
    {
        JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                                               //set the frame to a size we can see
        MainFrame.setVisible(true);                             //now display it
        about();                                                                //call the OOPGraphics about method to display version information.
        clear();
        reset();
        penDown();

    }
    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void displayMessage1(String message) {
        System.out.println(message);
        displayMessage(message);
        wait(2000);
        clearInterface();
    }

    public void processCommand(String command) {
        String[] parts = command.split(" ");
        System.out.println(command);
        Graphics g = getGraphicsContext();

        if (parts[0].equals("about")) {
            about();
            clear();
        }
        else if (parts[0].equals("penup")) {
            penUp();
            displayMessage1("Pen state: " + getPenState());
        }
        else if (parts[0].equals("pendown")) {
            penDown();
            displayMessage1("Pen state: " + getPenState());
        }
        else if (parts[0].equals("turnleft")){
            if (parts.length > 1) {
                try {
                    int object = Integer.parseInt((String) parts[1]);
                    turnLeft(parts[1]);
                }
                catch (NumberFormatException e) {
                    displayMessage1("Angle given is not an integer");

                }
            }
            else {
                turnLeft();
                displayMessage1("No angle given, turning 90 degrees.");
            }
        }
        else if (parts[0].equals("turnright")){
            if (parts.length > 1) {
                try {
                    int object = Integer.parseInt((String) parts[1]);
                    turnLeft(parts[1]);
                }
                catch (NumberFormatException e) {
                    displayMessage1("Angle given is not an integer");
                }
            }
            else {
                turnRight();
                displayMessage1("No angle given, turning 90 degrees.");
            }
        }
        else if (parts[0].equals("forward")) {
            if (parts.length > 1) {
                forward(parts[1]);
            } else {
                displayMessage1("No distance given.");
            }
        }
        else if (parts[0].equals("backward")) {
            if (parts.length > 1) {
                int distance = Integer.parseInt(parts[1]);
                forward(distance * -1);
            } else {
                displayMessage1("No distance given.");
            }
        }
        else if (parts[0].equals("black")) {
            setPenColour(Color.black);
        }
        else if (parts[0].equals("green")) {
            setPenColour(Color.green);
        }
        else if (parts[0].equals("red")) {
            setPenColour(Color.red);
        }
        else if (parts[0].equals("white")) {
            setPenColour(Color.white);
        }
        else if (parts[0].equals("reset")) {
            reset();
        }
        else if (parts[0].equals("clear")) {
            clear();
        } else {
            displayMessage1("Command not recognised");
            setPenState(false);
            drawCircle(100, 400, 200);
            reset();
        }

    }
}




