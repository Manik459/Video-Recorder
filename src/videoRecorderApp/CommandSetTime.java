package videoRecorderApp;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import recorder.TimeEmulator;
import videoRecorder.IVideoRecorder;

public class CommandSetTime implements ICommand{
	 public void Execute(IVideoRecorder videoRecorder, String[] parameters)
     {
         if (parameters.length > 1)
         {
        	 
        	 Date newTime = null;
        	 DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

             boolean parseSuccess = true;
             
             try {
             	newTime = df.parse(parameters[0] + " " + parameters[1]);
             } catch (ParseException e){
             	parseSuccess = false;
             } 
             
             if (parseSuccess) {
            	 System.out.format("Set new time: %s", newTime);
                 TimeEmulator.JumpToEmulatedTime(newTime);
                 return;
             }
         }

         System.out.println("Invalid parameter list: Command takes new time in format \"2012/2/2 15:00:10\" as a parameter.");
     }
}
