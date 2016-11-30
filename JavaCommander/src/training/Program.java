package training;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import training.command.Catenate;
import training.command.ChangeDirectory;
import training.command.Exit;
import training.command.ListDirectory;
import training.command.PrintBinary;
import training.command.PrintWorkingDirectory;

public class Program {

	private Command[] availableCommands = new Command[] { new ChangeDirectory(), new PrintWorkingDirectory(), new Exit(), new Catenate(), new PrintBinary(), new ListDirectory()};
	private Result result = new Result(new File("").getAbsoluteFile());
	
	public static void main(String[] args) throws IOException {

		new Program().start();
		
	}

	private void start() throws IOException {
		greet();
		while(!result.isShouldExit()){
			String commandText = readLine();
			processCommandText(commandText);
		}
		
	}

	private void processCommandText(String commandText) {
		boolean handled = false;
		for(int i = 0; i < availableCommands.length && !handled; i++){
			Command currentCommand = availableCommands[i];
			handled = tryOneAvailableCommand(commandText, currentCommand);
		}
	}

	private boolean tryOneAvailableCommand(String commandText, Command currentCommand) {
		boolean handled = false;
		if (currentCommand.shouldHandle(commandText)){
			processCurrentCommand(commandText, currentCommand);
			handled = true;
		}
		return handled;
	}

	private void processCurrentCommand(String commandText, Command currentCommand) {
		try {
			result = currentCommand.process(result.getWorkingDirectory(), commandText);
		} catch (CommandException e) {
			System.out.println(e.getMessage());
		}
	}

	private void greet() {
		System.out.println("JavaCommander 0.1");
		System.out.println(result.getWorkingDirectory());
	}

	private String readLine() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	
}
