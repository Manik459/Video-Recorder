package guide;

import java.util.Date;

public interface IGuide {
	GuideProgram GetProgram(int channel, Date time);
}
