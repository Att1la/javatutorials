package training;

import java.io.File;

public class Result {

	private File workingDirectory;
	private boolean shouldExit = false;
	
	public Result(File workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	
	public Result(File workingDirectory, boolean shouldExit) {
		super();
		this.workingDirectory = workingDirectory;
		this.shouldExit = shouldExit;
	}



	public File getWorkingDirectory() {
		return workingDirectory;
	}

	public void setWorkingDirectory(File workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	public boolean isShouldExit() {
		return shouldExit;
	}

	public void setShouldExit(boolean shouldExit) {
		this.shouldExit = shouldExit;
	}
	
	
	
}
