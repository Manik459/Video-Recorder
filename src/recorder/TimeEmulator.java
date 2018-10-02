package recorder;

import java.util.Date;
import java.util.Calendar;

// This class is used purely to allow time to be emulated for testing.
// The time can be changed via the console to see what the expected system state is at the given time instead of having to wait for
// recordings to actually complete. 
public class TimeEmulator {
	  static private int _offsetMinutes = 0;

      static public void JumpToEmulatedTime(Date time)
      {
    	  Calendar calNow = Calendar.getInstance(); // Get current time
    	  Calendar calInputTime = Calendar.getInstance(); // Input time
    	  calInputTime.setTime(time);
    	  
          _offsetMinutes = ((((calInputTime.get(Calendar.YEAR) - calNow.get(Calendar.YEAR))*365) + (calInputTime.get(Calendar.DAY_OF_MONTH) - calNow.get(Calendar.DAY_OF_MONTH)))*24 +
                          (calInputTime.get(Calendar.HOUR) - calNow.get(Calendar.HOUR)))*60 + calInputTime.get(Calendar.MINUTE) - calNow.get(Calendar.MINUTE);
      }

      // This keeps the time that is currently set.
      static public Date EmulatedCurrentTime()
      {
    	  Calendar cal = Calendar.getInstance(); // Get current time
    	  cal.add(Calendar.MINUTE, _offsetMinutes); // Add offset
          return cal.getTime();
      }
}
