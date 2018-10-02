package videoRecorderApp;

import videoRecorder.IVideoRecorder;

/* Class that abstracts the Play Command. */
public class CommandPlay implements ICommand {
	public void Execute(IVideoRecorder videoRecorder, String[] parameters)
    {
      if (parameters.length>0)
      {
        int id;

        try {
        	id = Integer.parseInt(parameters[0]);
        } catch (NumberFormatException e) {
        	System.out.println("Invalid parameter list: id parameter " + parameters[0] + " cannot be parsed as an integer..");
        	return;
        }
        
        videoRecorder.Play(id);

        return;
      }

      System.out.println("Invalid parameter list: Command takes single integer recording id as parameter.");
    }
}
