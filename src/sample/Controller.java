package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import org.apache.commons.io.FileUtils;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class Controller implements Initializable {
    @FXML
    public TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long inMemory = Runtime.getRuntime().totalMemory();
        long myMemory = Runtime.getRuntime().freeMemory();
        File file = new File(System.getProperty("user.home"));
        long dd = FileUtils.sizeOfDirectory(file);
        String name =new com.sun.security.auth.module.NTSystem().getName();
        textArea.setText("Os name: " + System.getProperty("os.name") + "\nOs version: " + System.getProperty("os.version")
                + "\nArchitecture of system: " + System.getProperty("os.arch")
        + "   \nname:   " + name   + " \nJava version: " +  System.getProperty("java.version") +
    "\nWorking directory: " +  System.getProperty("user.home") +"\nSize of user folder: " + dd +
                "\nJVM free: " + inMemory + " \n"
    + "JVM max memory : " + maxMemory + "\n"
    + "JVM free before : " + myMemory + "\n ");
    }
}
