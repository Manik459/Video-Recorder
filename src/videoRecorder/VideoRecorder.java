package videoRecorder;

import java.util.Date;

// This is the class for which an implementation needs to be provided.
// The class should contain the business logic for the video recorder which converts the input calls coming from the user
// to the correct output calls to the Recorder class.
// 
// If necessary the business logic should be distributed to some new classes with clear responsibilities instead of living only in the
// VideoRecorder class. 
// 
// The video recorder needs to use the program guide to determine the start and stop times of the recordings as the recorder aims to 
// only record full TV programs when possible.
// 
// Recording and playback conflicts need to be detected and prevented in this class, so avoid using the Recorder to detemine if a conflict occured. 
//

public class VideoRecorder implements IVideoRecorder {

    public void Record(int id, int channelNumber, Date startTime, Date endTime)
    {
        System.out.println("To be implemented: Record");
    }

    public void Play(int id)
    {
    	System.out.println("To be implemented: Play");
    }

    public void StopPlay()
    {
    	System.out.println("To be implemented: StopPlay");
    }
}
