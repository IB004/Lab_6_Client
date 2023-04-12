package exceptions;

public class WrongInputException extends MyException {
    ExceptionType type;
    String commandName;
    String someInfo;

    public WrongInputException(){
    }
    public WrongInputException(ExceptionType type){
        this.type = type;
    }

    public WrongInputException(ExceptionType type, String commandName){
        this.type = type;
        this.commandName = commandName;
    }
    public ExceptionType getExceptionType(){
        return type;
    }
    public String getCommandName(){
        if(commandName.isBlank()){
            return "";
        }
        return commandName;
    }
     public String getInfo(){
        return  this.someInfo;
     }

     public void setInfo(String str){
        this.someInfo = str;
     }


}
