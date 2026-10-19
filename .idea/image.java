// Source - https://stackoverflow.com/q/13011705
// Posted by Bernard, modified by community. See post 'Timeline' for change history
// Retrieved 2026-10-15, License - CC BY-SA 3.0

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class image {

    /*public static void main(String args[])
    {
        TimeFrame frame = new TimeFrame();
    }*/
}

class TimeFrame extends JFrame
{
    ImageIcon originalIcon = new ImageIcon("me.jpg");
    ImageIcon secondIcon = new ImageIcon("Button 2.jpeg");

    // 2. Extract and resize the image to 200x200 pixels
    Image scaledImage = originalIcon.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH);
    Image scaledImage2 = secondIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

    // 3. Create the new resized icon and attach it to the label
    ImageIcon resizedIcon = new ImageIcon(scaledImage);
    JLabel label = new JLabel(resizedIcon);
    ImageIcon resizedIcon2 = new ImageIcon(scaledImage2);
    JLabel label2 = new JLabel(resizedIcon2);

    public TimeFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Frame");
        setSize(500,400);
        //this.setIconImage(icon);
        add(label,BorderLayout.SOUTH);
        add(label2,BorderLayout.CENTER);
        setVisible(true);
    }


}