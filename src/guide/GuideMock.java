package guide;

import java.util.Calendar;
import java.util.Date;
import java.lang.String;

/* Program guide mock, which returns the TV program that is on a particular channel at a particular time. */
public class GuideMock implements IGuide {
	public GuideProgram GetProgram(int channelNumber, Date time)
    {
	    String name;
	    Date startTime;
	    Date endTime;
		
	    /* For this exercise, emulate a program guide by using a simple model where program duration is assumed to be N minutes, with N the channel number.
        Add an offset to make sure program boundaries are not fully aligned. */
        name = String.format("ExampleProgramEvent %d %s", channelNumber, time);
        Calendar cal = Calendar.getInstance();
        cal.setTime(time);
        
        int origHours = cal.get(Calendar.HOUR);
        int origMinutes = cal.get(Calendar.MINUTE);

        // Simple algorithm to emulate different program durations on the different channels.
        // This assigns a program duration which is proportional to the channel number.
        
        // Set time back to previous midnight
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        
        // Set start and end time around the provided time input value.
        cal.add(Calendar.MINUTE, ((((origHours * 60) + (origMinutes)) / channelNumber) * channelNumber) + channelNumber);
        startTime = cal.getTime();
        cal.add(Calendar.MINUTE, channelNumber);
        endTime = cal.getTime();
        
        return new GuideProgram(name, startTime, endTime);
    }
}