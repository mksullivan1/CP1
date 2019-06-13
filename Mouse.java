import javax.swing.JFrame;

public class Mouse{
    public static void main(String[] args){
        JFrame frame = new JFrame("Frame Demo");  //Creates the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminates program
        frame.setSize(400, 400); //Sets the width and height of the shape
        MMouse r = new MMouse();//Creating the Shapes Object
        frame.add(r);//Adds the Shape to the frame
        
        frame.setVisible(true); //show frame
    }
}