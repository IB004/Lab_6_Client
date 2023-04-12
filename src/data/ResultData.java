package data;

import java.util.LinkedList;
/**
 * ResultData is a special open storage class, that contains full info about result of the command.
 */
public class ResultData {
    public String resultText;
    public LinkedList<LabWork> labsList = new LinkedList<>();
    public String errorMessage;
    public boolean hasText(){
        return !(this.resultText == null || this.resultText.isBlank());
    }
    public boolean hasErrorMessage(){
        return !(this.errorMessage == null || this.errorMessage.isBlank());
    }
    public boolean hasElements(){
        return !(this.labsList == null || this.labsList.isEmpty());
    }

    public static boolean isEmpty(ResultData resultData){
        if (resultData == null){
            return true;
        }
        return !(resultData.hasElements() || resultData.hasText() || resultData.hasErrorMessage());
    }
}
