package training.command;

import java.io.File;

import training.Command;
import training.CommandException;
import training.Result;

public class Exit implements Command{

	@Override
	public boolean shouldHandle(String command) {
		return "exit".equals(command);
	}

	@Override
	public Result process(File workingDirectory, String command) throws CommandException {
		return new Result(workingDirectory, true);
	}

}
