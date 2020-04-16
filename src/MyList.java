import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import java.util.stream.Stream;

public class MyList extends JFrame {
    {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        // 方法一
        //        JList<String> list = new JList<>(new String[]{"a", "b", "c", "d", "e", "f"});

        // 方法二
        //        Vector<String> vector = new Vector<>();
        //        vector.add("a1");
        //        vector.add("a2");
        //        vector.add("a3");
        //        vector.add("a4");
        //        vector.add("a5");
        //        JList<String> list = new JList<>(vector);

        // 方法三
        DefaultListModel<String> listModel = new DefaultListModel<>();
        Stream.iterate(1, i -> ++i).limit(5).forEach(i -> listModel.addElement("b" + i));
        listModel.addElement("哈哈");

        JList<String> list = new JList<>();
        list.setModel(listModel);

        /**
                 *   SINGLE_SELECTION：單選
                 *   ListSelectionModel.SINGLE_INTERVAL_SELECTION：多選時，只能是連續的
                 *   MULTIPLE_INTERVAL_SELECTION：多選，預設值
                 */
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // 按 Ctrl + 滑鼠左鍵可多選； Shift + 滑鼠左鍵可連續選
        JScrollPane scrollPane = new JScrollPane(list); // 如果高度不夠會顯示不出來，所以用 scroll bar
        scrollPane.setBounds(new Rectangle(10, 10, 50, 70));
        container.add(scrollPane);

        buttonEvent(list, container);

        setVisible(true);
    }

    private void buttonEvent(JList<String> list, Container container) {
        JButton button = new JButton("按我");
        button.addActionListener(actionEvent -> list.getSelectedValuesList().forEach(System.out::println));

        button.setBounds(100, 10, 100, 50);
        container.add(button);
    }

    public static void main(String[] args) {
        new MyList();
    }
}
