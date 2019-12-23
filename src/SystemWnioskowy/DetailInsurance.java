package SystemWnioskowy;

import java.util.ArrayList;
import java.util.List;

public class DetailInsurance {
	private List<Command> commandList = new ArrayList<Command>();
	
	
	public void takeDetail(Command command) {
		commandList.add(command);
	}
	
	public void placeDetail() {
		for (Command command: commandList) {
			command.Execute();
		}
		commandList.clear();
	}

}
