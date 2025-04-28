
import java.io.File;
import javax.swing.JTextArea;

public class FileLister {

    public static void listFiles(File directory, JTextArea textArea) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listFiles(file, textArea);
                } else {
                    textArea.append(file.getAbsolutePath() + "\n");
                }
            }
        }
    }
}
