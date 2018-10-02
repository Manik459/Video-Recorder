package recorder;

import java.util.Date;

public interface IRecorder {
	 boolean Record(int recordingId, int channelNumber, Date startTime, Date endTime);
     boolean PlayRecording(int recordingId);
     boolean StopPlayRecording(int recordingId);
}
