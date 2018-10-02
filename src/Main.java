
package VideoRecorderExercise;
package videoRecorderApp;

import java.util.Arrays;
import java.io.*;
import videoRecorder.*;

public class Main {
	public static void main(String [ ] args)
	{
		 System.out.println("VideoRecorder coding exercise");

         CommandList commandList = new CommandList();
         IVideoRecorder videoRecorder = new VideoRecorder();

		 String[] wordlist = new String[0];
	
		 InputStreamReader converter = new InputStreamReader(System.in);
		 BufferedReader in = new BufferedReader(converter);

         while (!((wordlist.length > 0) && (wordlist[0].equals("quit"))))
         {    
             if (wordlist.length > 0)
             {
                 ICommand command = commandList.GetCommand(wordlist[0]);
            	 
                 if (command != null)
                 {
                     command.Execute(videoRecorder, Arrays.copyOfRange(wordlist, 1, 10));
                 }
                 else
                 {
                	 System.out.println("Command not recognised.");
                 }
             }
             
        	 System.out.println("Enter a command (type 'quit' to exit): ");
        	 
        	 String s;
        	 
        	 try {
            	 s = in.readLine();     	   		
        	 } catch (IOException e) {
        		 continue;
        	 }

             wordlist = s.split(" ");
         }
         
         System.out.println("Exiting app...");

	}
}
