package training.command;

import java.io.File;

import training.Command;
import training.CommandException;
import training.Result;

public class ListDirectory implements Command {

	@Override
	public boolean shouldHandle(String command) {
		return command.equals("ls");
	}

	@Override
	public Result process(File workingDirectory, String command) throws CommandException {
		
		System.out.println(String.format("%10s", "Name") + "| File/Directory | Size");
		System.out.println();
		
		for (File file : workingDirectory.listFiles()){
			System.out.print(String.format("%10s", file.getName()));
			if (file.isDirectory()){
				System.out.print(" d");
			} else {
				System.out.print(" f");
			}
			System.out.println(" " + file.length());
		}
		
		return new Result(workingDirectory);
	}

}
