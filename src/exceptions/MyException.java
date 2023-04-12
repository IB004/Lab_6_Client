package exceptions;

public class MyException extends Exception {
    ExceptionType exceptionType;
    public ExceptionType getExceptionType(){
        if (exceptionType == null){
            return ExceptionType.UNCATEGORIZED_EXCEPTION;
        }
        return exceptionType;
    }
}
