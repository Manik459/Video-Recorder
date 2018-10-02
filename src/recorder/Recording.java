package recorder;

import java.util.Date;

public class Recording {
	
	public Recording(int id, int channelNr, Date startTime, Date endTime){
		Id = id;
		ChannelNr = channelNr;
		StartTime = startTime;
		EndTime = startTime;
	}
	
    public int Id;
    Date StartTime;
    Date EndTime;
    int ChannelNr;
}
