package client;

import exceptions.*;

public class Warning {
    public Warning(){}
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    public <Exc extends Exception> void showWarning(Exc e) {
        try {
            WrongInputException e1 = (WrongInputException) e;
        }
        catch (ClassCastException classCastException){
            warningMessage("Unknown exception");
        }
    }
    public void wrongInput(WrongInputException e) {
        /*
        switch (e.getExceptionType()) {
            case EMPTY_COMMAND -> Message.printNothing();
            case WRONG_COMMAND -> wrongCommand(e.getCommandName());
            case NO_INTEGER -> digitIsRequired(e.getCommandName());
            case NO_STRING -> stringIsRequired(e.getCommandName());
            case EMPTY_FIELD -> canNotBeEmpty();
            case MUST_BE_HIGHER -> mustBeHigher(e.getInfo());
            case SHOULD_NOT_CONTAIN -> shouldNotContain(e.getInfo());
            default -> wrongMessage("Something went wrong. Please, try again.");
        }
         */
    }

    public void warningMessage(String message) {
        System.out.println(ANSI_RED + message + ANSI_RESET);
    }

    private void wrongCommand(String command) {
        String message = "Command '" + command + "' is not registered.\n" +
                "Please, type it correctly or use command 'help'.";
        warningMessage(message);
    }

    private void digitIsRequired(String command) {
        String message = "Integer digit is required for command '" + command + "'.\n" +
                "Please, type it correctly or use command 'help'.";
        warningMessage(message);
    }

    private void stringIsRequired(String command) {
        String message = "String is required for command '" + command + "'.\n" +
                "Please, type it correctly or use command 'help'.";
        warningMessage(message);
    }

    private void canNotBeEmpty() {
        warningMessage("This field can not be empty!");
    }

    public void mustBeType(String type) {
        warningMessage("This field must be type of " + type + "!");
    }

    private void mustBeHigher(String value) {
        warningMessage("This field must be higher than " + value + "!");
    }

    public void wrongEnumValue() {
        warningMessage("This value is not supported!");
    }

    public void shouldNotContain(String value) {
        warningMessage("Fields should not contain '" + value + "'!");
    }

}
