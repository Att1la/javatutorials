package training.command;

import java.io.File;

import training.Command;
import training.CommandException;
import training.Result;

public class PrintWorkingDirectory implements Command{

	@Override
	public boolean shouldHandle(String command) {
		return "pwd".equals(command);
	}

	@Override
	public Result process(File workingDirectory, String command) throws CommandException {
		System.out.println(workingDirectory.getAbsolutePath());
		return new Result(workingDirectory);
	}

}
