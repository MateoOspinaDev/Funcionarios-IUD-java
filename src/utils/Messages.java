
package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public interface Messages {
    static void showMessage(String titulo, String msg, int tipo) {
        JOptionPane.showMessageDialog((Component)null, msg, titulo, tipo);
    }

    static void ErrorMessage(String titulo, String msg) {
        showMessage(titulo, msg, 0);
    }

    static boolean okMessage(String titulo, String msg) {
        JOptionPane jP = new JOptionPane();
        return JOptionPane.showConfirmDialog((Component)null, msg, titulo, 0) == 0;
    }
}
