package Task2_MonitorFiles_package;

import java.io.File;

public interface IFileEvent {
	void onFileAdded(String s, File file);
}
