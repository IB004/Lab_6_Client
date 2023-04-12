import client.Client;
import client.Message;
import client.WebDispatcher;
import commands.ClearCommand;
import data.CommandData;


public class Main {
    public static void main(String[] args) throws Exception{

        WebDispatcher webDispatcher = new WebDispatcher(new Message());
        webDispatcher.connect("127.0.0.1", 8888);
        webDispatcher.sendCommandDataToExecutor(getTestCommandData());

        //Client client = new Client();
        //client.doWhileTrue();
    }

    private static CommandData getTestCommandData(){
        CommandData commandData = new CommandData();
        commandData.command = new ClearCommand();
        return commandData;
    }
}
