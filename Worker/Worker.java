package Worker;

import java.io.File;
import java.io.IOException;

public class Worker {
    StringBuilder sb = new StringBuilder();
    public void createDirectory(File newDirectory) {
        if (newDirectory.isDirectory()) {
            sb.append("Directory " + newDirectory.getName() + " was created.\n");
        } else {
            if (newDirectory.mkdir()) {
                sb.append("Directory " + newDirectory.getName() + "was created.\n");
            }
        }
    }

    public void createFile(File newFile) {
        if (newFile.isFile()) {
            sb.append("File " + newFile.getName() + "was created.\n");
        } else {
            try {
                if (newFile.createNewFile())
                    sb.append("File " + newFile.getName() + "was created.\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
