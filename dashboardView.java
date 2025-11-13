import javax.swing.*;
import java.awt.*;

public class dashboardView {
    private JFrame frame;
    private JTable emailTable;
    private JButton addButton;
    private JButton deleteButton;
    private JButton refreshButton;
    private JTextField searchField;
    private JButton searchButton;

    public dashboardView() {
        frame = new JFrame("Email Analyzer Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout(10, 10));

        // Top panel (search + buttons)
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        refreshButton = new JButton("Refresh");

        topPanel.add(new JLabel("Search:"));
        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.add(addButton);
        topPanel.add(deleteButton);
        topPanel.add(refreshButton);

        // Table
        String[] columns = {"Sender", "Subject", "Date", "Priority"};
        Object[][] data = {}; // empty placeholder for now
        emailTable = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(emailTable);

        // Add components to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(dashboardView::new);
    }
}
