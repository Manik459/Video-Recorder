package recorder;

import java.util.HashMap;
import java.util.Date;

/* This class represents a mock of the actual recorder, which is the component that actually receives video streams, records them to disk and allows 
them to be played back. 
This mock is very rudimentary and may need to be completed to emulate the basic recorder behaviour accurately.
The business logic of the actual video recorder should not go in here. */
public class RecorderMock implements IRecorder {
	
	private HashMap<Integer, Recording> _recordingsList;
	
    private boolean _isRecordingPlaying;
    private int _currentlyPlayingRecording;
	
    public RecorderMock()
    {
        _recordingsList = new HashMap<Integer, Recording>();
    }

    // Record a specific channel for a specific time span 
    public boolean Record(int recordingId, int channelNumber, Date startTime, Date endTime)
    {
         _recordingsList.put(recordingId, new Recording(recordingId, channelNumber, startTime, endTime));

        return ValidateRecordingsList();
    }

    public boolean PlayRecording(int recordingId)
    {
        if (!(IsRecordingRecorded(recordingId)))
        {
            return false;
        }
        
        if (_isRecordingPlaying)
        {
        	System.out.format("Already playing recording %i\n", _currentlyPlayingRecording);
            return false;
        }

        _isRecordingPlaying = true;
        _currentlyPlayingRecording = recordingId;
        
        return true;
    }

    public boolean StopPlayRecording(int recordingId)
    {
        if (!_isRecordingPlaying)
        {
            return false;
        }

        _isRecordingPlaying = false;

        return true;
    }
    private boolean ValidateRecordingsList()
    {
    	// Check whether there are any recording conflicts in the current list
        // To be completed
        return true;
    }

    private boolean IsRecordingRecorded(int id)
    {
        return (_recordingsList.containsKey(id) && TimeEmulator.EmulatedCurrentTime().after(_recordingsList.get(id).StartTime));
    }
}