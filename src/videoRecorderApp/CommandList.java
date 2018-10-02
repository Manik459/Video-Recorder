package videoRecorderApp;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class CommandList {
	 public CommandList()
     {
         _commandList = new HashMap<String, ICommand>()
	        {{
	            put("play", new CommandPlay());
	            put ("stopplay", new CommandStopPlay());
	            put ("record", new CommandRecord());
	            put ("gettime", new CommandGetTime());
	            put ("settime", new CommandSetTime());
	        }};
     }

     public ICommand GetCommand(String commandName)
     {
         if (_commandList.containsKey(commandName))
         {
             return _commandList.get(commandName);
         }

         return null;
     }

     private Map<String, ICommand> _commandList;
}
