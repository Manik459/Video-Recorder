package videoRecorderApp;

import recorder.TimeEmulator;
import videoRecorder.IVideoRecorder;

public class CommandGetTime implements ICommand{
    public void Execute(IVideoRecorder videoRecorder, String[] parameters)
    {
    	System.out.format("Get current time: %s\n", TimeEmulator.EmulatedCurrentTime());
    }
}
