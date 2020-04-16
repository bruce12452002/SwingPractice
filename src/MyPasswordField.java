import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class MyPasswordField extends JFrame {
    {
        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // 基本上用法和 TextField 差不多
        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setEchoChar('@'); // 輸入時出現的符號，預設是黑點

        // 按 Enter 時觸發
        passwordField.addActionListener(actionEvent -> {
            char[] password = passwordField.getPassword();
            Stream.of(password).forEach(System.out::println);
        });

        container.add(passwordField);

        setVisible(true);
    }


    public static void main(String[] args) {
        new MyPasswordField();
    }
}
