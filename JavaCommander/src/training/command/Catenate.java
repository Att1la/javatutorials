package training.command;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import training.Command;
import training.CommandException;
import training.Result;

public class Catenate implements Command{

	private static final String CATENATE = "cat ";

	@Override
	public boolean shouldHandle(String command) {
		return command.startsWith(CATENATE);
	}

	@Override
	public Result process(File workingDirectory, String command) throws CommandException {
		String fileName = command.substring(CATENATE.length());
		File file = new File(workingDirectory, fileName);
		if (!file.exists() || !file.isFile() || !file.canRead()){
			throw new CommandException("Invalid filename: " + fileName);
		}
		try{
		List<String> lines = Files.readAllLines(file.toPath());
		for (String line : lines){
			System.out.println(line);
		}
		} catch (IOException e){
			throw new CommandException("Could not read file: " + fileName);
		}
		return new Result(workingDirectory);
	}
	
	

}
