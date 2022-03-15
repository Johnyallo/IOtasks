package GameProgress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ProgressMain {
    private static List<String> listOfGames = new ArrayList<String>();

    public static void saveGame(String pathName, GameProgress gameProgress) {
        listOfGames.add(pathName);
        try (FileOutputStream fos = new FileOutputStream(pathName);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void zipFiles(String pathName, List<String> list) {
        ZipEntry[] zipEntry = new ZipEntry[list.size()];
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(pathName))) {
            for (int i = 0; i < list.size(); i++) {
                FileInputStream fis = new FileInputStream(list.get(i));
                String nameOfZipFile = "zipFile" + (i + 1) + ".dat";
                zipEntry[i] = new ZipEntry(nameOfZipFile);
                zout.putNextEntry(zipEntry[i]);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zout.write(buffer);
                zout.closeEntry();
                System.out.println("File " + list.get(i) + " was added in zip-file " + pathName);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteFiles(String pathName, String nameOfZip) {
        File dir = new File(pathName);
        for (File file : dir.listFiles()) {
            if (!nameOfZip.equals(file.getName())) {
                if (file.delete()) {
                    System.out.println(file + " was deleted.");
                }
            }
        }
    }

    public static void main(String[] args) {
        GameProgress gameProgress1 = new GameProgress(80, 3, 5, 55.3);
        GameProgress gameProgress2 = new GameProgress(60, 2, 3, 68.5);
        GameProgress gameProgress3 = new GameProgress(100, 1, 1, 100.0);
        saveGame("F://Games//savegames//save1.dat", gameProgress1);
        saveGame("F://Games//savegames//save2.dat", gameProgress2);
        saveGame("F://Games//savegames//save3.dat", gameProgress3);
        zipFiles("F://Games//savegames//zip.zip", listOfGames);
        deleteFiles("F://Games//savegames", "zip.zip");
    }
}
