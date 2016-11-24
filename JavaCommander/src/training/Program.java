package training;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import training.command.ChangeDirectory;
import training.command.PrintWorkingDirectory;

public class Program {

	private Command[] availableCommands = new Command[] { new ChangeDirectory(), new PrintWorkingDirectory()};
	
	public static void main(String[] args) throws IOException {

		new Program().start();
		
	}

	private void start() throws IOException {
		System.out.println("JavaCommander 0.1");
		File workingDirectory = new File("").getAbsoluteFile(); //program aktuális könyvtárában
		System.out.println(workingDirectory.getAbsolutePath());
		
		while(true){
			String commandText = readLine();
			boolean handled = false;
			for(int i = 0; i < availableCommands.length && !handled; i++){
				if (availableCommands[i].shouldHandle(commandText)){
					try {
						Result result = availableCommands[i].process(workingDirectory, commandText);
						workingDirectory = result.getWorkingDirectory();
					} catch (CommandException e) {
						System.out.println(e.getMessage());
					}
					handled = true;
				}
			}
		}
		
	}

	private String readLine() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	
}
