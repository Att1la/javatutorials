package training.command;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import training.Command;
import training.CommandException;
import training.Result;

public class PrintBinary implements Command {

	private static final int CHARACTERS_IN_LINE = 8;
	private static final String PRINT_BINARY_COMMAND = "pb ";

	@Override
	public boolean shouldHandle(String command) {
		return command.startsWith(PRINT_BINARY_COMMAND);
	}

	@Override
	public Result process(File workingDirectory, String command) throws CommandException {
		String fileName = command.substring(PRINT_BINARY_COMMAND.length());
		File file = new File(workingDirectory, fileName);
		if (!file.exists() || !file.isFile() || !file.canRead()){
			throw new CommandException("Invalid filename: " + fileName);
		}
		try{
			byte[] content = Files.readAllBytes(file.toPath());
			int count = 1;
			for(byte currentByte : content){
				System.out.print(String.format("%3d", currentByte));
				System.out.print(" ");
				if(count % CHARACTERS_IN_LINE == 0){
					System.out.println();
				}
				count++;
			}
		} catch (IOException e){
			throw new CommandException("Could not read file: " + fileName);
		}
		return new Result(workingDirectory);
	}

}
