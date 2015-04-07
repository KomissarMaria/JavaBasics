package Task3_DirectoryMonitor_package;

import java.io.File;
import java.io.IOException;

public interface IFileEvent {
    void onFileAdded(File dir) throws IOException;
}
