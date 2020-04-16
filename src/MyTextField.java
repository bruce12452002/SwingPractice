import javax.swing.*;
import java.awt.*;

public class MyTextField extends JFrame {
    {
        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JTextField field = new JTextField("哇哈哈", 20); // 文字內容和寬度，也可用 setText，setColumns
        field.setFont(new Font("標楷體", Font.BOLD, 20));
        field.setForeground(new Color(0, 0, 255)); // Color.BLUE
        field.setBackground(Color.PINK);
        container.add(field);

        buttonEvent(field, container);

        setVisible(true);
    }

    private void buttonEvent(JTextField field, Container container) {
        JButton button = new JButton("按我");
        button.addActionListener(actionEvent -> {
            System.out.println("內容是=" + field.getText());
            field.setText(""); // 清空文字
            field.requestFocus(); // 游標
        });
        button.setBounds(100, 10, 100, 50);
        container.add(button);
    }

    public static void main(String[] args) {
        new MyTextField();
    }
}
