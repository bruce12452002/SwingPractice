import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.util.Properties;
import java.util.stream.Stream;

public class MyTextArea extends JFrame {
    {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // PlainDocument 為預設值
        JTextArea textArea = new JTextArea(new PlainDocument(), "abc" + System.getProperty("line.separator") + "def", 3, 8);
        textArea.append("xxx");
        textArea.insert("ooo", 1);

        JScrollPane scrollPane = new JScrollPane(textArea); // 打字超過範圍時會顯示，改變視窗大小不會
        container.add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyTextArea();
    }
}
