package guide;

import java.util.Date;
import java.util.Calendar;

/* TV program from the program guide. E.g. Sky News from 19.00 to 19.30. */
public class GuideProgram {
	
	/* Mocked generation of the TV program that is on at a specific time on a specific channel. In a real program guide this would come from a database. */
    public GuideProgram(String name, Date startTime, Date endTime)
    {
        Name = name;
        StartTime = startTime;
        EndTime = endTime;
    }
	
    public String Name;
    public Date StartTime;
    public Date EndTime;
}
