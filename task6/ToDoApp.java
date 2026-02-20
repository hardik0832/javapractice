import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoApp {

    private JFrame frame;
    private JTextField taskField;
    private DefaultListModel<String> listModel;
    private JList<String> taskList;

    public ToDoApp() {
        frame = new JFrame("To-Do List App");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Layout
        frame.setLayout(new BorderLayout());

        // Top Panel (Input + Add Button)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        taskField = new JTextField();
        JButton addButton = new JButton("Add Task");

        topPanel.add(taskField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        // Center Panel (Task List)
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Bottom Panel (Delete Button)
        JPanel bottomPanel = new JPanel();
        JButton deleteButton = new JButton("Delete Task");
        bottomPanel.add(deleteButton);

        // Add to Frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Event Handling
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Task cannot be empty!");
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(frame, "Select a task to delete!");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoApp::new);
    }
}
