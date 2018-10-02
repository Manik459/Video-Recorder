package videoRecorderApp;

import videoRecorder.IVideoRecorder;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CommandRecord implements ICommand{
	public void Execute(IVideoRecorder videoRecorder, String[] parameters)
    {
        if (parameters.length > 5)
        {
            int id = 0;
            int channelNumber = 0;
            Date startTime = null;
            Date endTime = null;
            
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

            boolean parseSuccess = true;
            
            try {
            	id = Integer.parseInt(parameters[0]);
            	channelNumber = Integer.parseInt(parameters[1]);
            	startTime = df.parse(parameters[2] + " " + parameters[3]);
            	endTime = df.parse(parameters[4] + " " + parameters[5]);
            } catch (ParseException e){
            	parseSuccess = false;
            } catch (NumberFormatException  e){
            	parseSuccess = false;
            }
            
            if (parseSuccess) {
            	videoRecorder.Record(id, channelNumber, startTime, endTime);
            	return;
            }
        }

        System.out.println("Invalid parameter list: Command takes integer recording id, integer channel number, start time in format \"2012/2/2 15:00:10\" and end time in same format");
    }
}
