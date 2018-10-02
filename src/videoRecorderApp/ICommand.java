package videoRecorderApp;

import videoRecorder.*;

public interface ICommand {
	void Execute(IVideoRecorder videoRecorder, String[] parameters);   
}
