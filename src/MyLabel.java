import javax.swing.*;
import java.awt.*;

public class MyLabel extends JFrame {
    {
        setBounds(100,100, 300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();

        JLabel label = new JLabel("哇哈哈");// JLable 想取得裡面的內容，可用 setText 和 getText
        label.setFont(new Font("標楷體", Font.PLAIN, 20));
        label.setForeground(new Color(0, 0, 255)); // Color.BLUE
        container.add(label);

        setVisible(true);
    }


    public static void main(String[] args) {
        new MyLabel();
    }
}
