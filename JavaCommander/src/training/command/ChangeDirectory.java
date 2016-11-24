package training.command;

import java.io.File;

import training.Command;
import training.CommandException;
import training.Result;

public class ChangeDirectory implements Command{

	@Override
	public boolean shouldHandle(String command) {
		return command.startsWith("cd ");
	}

	@Override
	public Result process(File workingDirectory, String command) throws CommandException {
		String arg = command.substring("cd ".length());
		File newDir;
		if("..".equals(arg)){
			newDir = workingDirectory.getParentFile();
		} else {
			newDir = new File(workingDirectory, arg);
		}
		if (newDir == null || !newDir.exists() || !newDir.isDirectory()){
			throw new CommandException("Invalid directory: " + arg);
		}
		
		
		return new Result(newDir);
	}

	
	
}
