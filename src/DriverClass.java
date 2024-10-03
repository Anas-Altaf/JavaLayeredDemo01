import pl.BookPO;

import javax.swing.*;


public class DriverClass {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookPO().setVisible(true);
            }
        });
    }
}
