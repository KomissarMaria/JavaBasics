package Task3_DirectoryMonitor_package;

import java.io.*;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(File dir) throws IOException {
        System.out.println("Файл .txt добавлен в папку: " + dir.getCanonicalPath());
    }

}
