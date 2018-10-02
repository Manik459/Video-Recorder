package videoRecorderApp;

import videoRecorder.IVideoRecorder;

public class CommandStopPlay implements ICommand{
	public void Execute(IVideoRecorder videoRecorder, String[] parameters)
    {
        videoRecorder.StopPlay();
    }
}
