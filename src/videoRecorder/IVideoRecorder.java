package videoRecorder;

import java.util.Date;

public interface IVideoRecorder {
    void Record(int id, int channelNumber, Date startTime, Date endTime);
    void Play(int id);
    void StopPlay();
}
