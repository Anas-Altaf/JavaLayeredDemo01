package pl;

import bll.BookBO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookPO extends JFrame {

    private JTextField searchField;
    private JButton searchButton;
    private JTextArea resultArea;
    private BookBO bookBO;

    public BookPO() {
        bookBO = new BookBO();

        setTitle("Book Search Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Search for a book by title: "));
        searchField = new JTextField(20);
        topPanel.add(searchField);
        searchButton = new JButton("Search");
        topPanel.add(searchButton);
        add(topPanel, BorderLayout.NORTH);
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = null;
                result = bookBO.searchBooks(searchField.getText());
                resultArea.setText(result);
            }
        });
    }
}