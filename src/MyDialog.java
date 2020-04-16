import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog extends JDialog {
    public MyDialog(JFrame frame) {
        super(frame, "title", true); // true 為只能按自己的 dialog，預設為 false

        Container container = getContentPane();
        container.add(new JLabel("內容"));

        //setVisible(true); // 配合 JFrame 時，寫在這會失效
        setBounds(100, 100, 400, 300);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("框");
        frame.setBounds(100, 100, 800, 600);
        Container container = frame.getContentPane();

        JButton button = new JButton("按我");
        container.setLayout(new FlowLayout()); // 這行不加，整個畫面是個大按鈕
        container.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addActionListener(a -> new MyDialog(frame).setVisible(true)); // 必需實作 ActionListener


    }
}
