import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.*;

import uk.ac.leedsbeckett.oop.OOPGraphics;

public class TurtleGraphics extends OOPGraphics{

    public static void main(String[] args) {
        new TurtleGraphics(); //create instance of class that extends OOPGraphics (could be separate class without main), gets out of static context
    }
    private final JTextArea textArea;
    public TurtleGraphics() {
        JFrame mainFrame = new JFrame();
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(scrollPane, BorderLayout.EAST);
        mainFrame.add(this, BorderLayout.CENTER);
        mainFrame.pack();
        mainFrame.setVisible(true);
        about();
        clear();
        reset();
        penDown();
    }


    @Override
    public void reset() {
        super.reset();
        textArea.setText("");
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
        textArea.append(command + "\n");


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
        }
        else if (parts[0].equals("save")) {
            BufferedImage buff = getBufferedImage();
            String commands = textArea.getText();
            if (parts.length > 1) {
                try (PrintWriter writer = new PrintWriter(new File(parts[1] + ".txt"))) {
                    writer.println(commands);
                    writer.flush();
                    displayMessage1(parts[1] + ".txt was saved.");
                }
                catch (FileNotFoundException e) {
                    displayMessage1("This text file could not be saved.");
                }
                File outputfile = new File(parts[1] + ".jpg");
                try {
                    ImageIO.write(buff, "jpg", outputfile);
                    displayMessage1(parts[1] + ".jpg was saved.");
                } catch (IOException e) {
                    displayMessage1("The image could not be saved.");
                }
            }
            else {
                try (PrintWriter writer = new PrintWriter(new File("commands.txt"))) {
                    writer.println(commands);
                    writer.flush();
                    displayMessage1("commands.txt was saved.");
                }
                catch (FileNotFoundException e) {
                    displayMessage1("This text file could not be saved");
                }
                File outputfile = new File("buffered.jpg");
                try {
                    ImageIO.write(buff, "jpg", outputfile);
                    displayMessage1("buffered.jpg was saved.");
                } catch (IOException e) {
                    displayMessage1("The image could not be saved.");
                }
            }

        }
        else if (parts[0].equals("load")) {
            try {
                BufferedImage loadBuff = ImageIO.read(new File(parts[1]));
                setBufferedImage(loadBuff);
                displayMessage1("The image was loaded.");
            }
            catch (IOException e) {
                System.out.println("The image failed to load.");
            }
        }


        else {
            displayMessage1("Command not recognised");
            setPenState(false);
            drawCircle(100, 400, 200);
            reset();
        }

    }
}




