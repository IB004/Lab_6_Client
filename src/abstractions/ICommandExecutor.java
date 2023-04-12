package abstractions;

import data.CommandData;

public interface ICommandExecutor {
    public void execute(CommandData commandData);
}
