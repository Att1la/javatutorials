package training;

import java.io.File;

public class Result {

	private File workingDirectory;
	
	public Result(File workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	public File getWorkingDirectory() {
		return workingDirectory;
	}

	public void setWorkingDirectory(File workingDirectory) {
		this.workingDirectory = workingDirectory;
	}
	
	
	
}
