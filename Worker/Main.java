package Worker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        File src = new File("F://Games//src");
        worker.createDirectory(src);
        File res = new File("F://Games//res");
        worker.createDirectory(res);
        File saveGames = new File("F://Games//savegames");
        worker.createDirectory(saveGames);
        File temp = new File("F://Games//temp");
        worker.createDirectory(temp);
        File newDir1 = new File("F://Games//src//main");
        worker.createDirectory(newDir1);
        File newDir2 = new File("F://Games//src//test");
        worker.createDirectory(newDir2);
        File newFile1 = new File("F://Games//src//main//Main.java");
        worker.createFile(newFile1);
        File newFile2 = new File("F://Games//src//main//Utils.java");
        worker.createFile(newFile2);
        File newResDirectory1 = new File("F://Games//res//drawables");
        worker.createDirectory(newResDirectory1);
        File newResDirectory2 = new File("F://Games//res//vectors");
        worker.createDirectory(newResDirectory2);
        File newResDirectory3 = new File("F://Games//res//icons");
        worker.createDirectory(newResDirectory3);
        File newTempFile = new File("F://Games//temp//temp.txt");
        worker.createFile(newTempFile);
        String str = worker.sb.toString();
        System.out.println(str);

        FileWriter writer = null;

        try {
            writer = new FileWriter("F://Games//temp//temp.txt");
            writer.write(str);
            writer.append('\n');
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                    System.out.println(ex.getMessage());
            }
        }
    }
}
