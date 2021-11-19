package example.exception;

import java.io.File;
import java.io.IOException;

public class FileExceptionTest {

    public static void main(String[] args) {
        CreateNewFileTest();
    }

    private static void CreateNewFileTest() {
        File file = new File("/home/celk/workspace/java-student/archive/example.txt");
        try {
            file.canWrite();
            boolean isCreatedFile = file.createNewFile();

            System.out.println("Arquivo criado " + isCreatedFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
