package models;

public class Data_Checker {
    Boolean result;
    public Boolean checker(String data){
        String start = "0122";

        if (data.compareTo(start) >= 0)
            result = Boolean.TRUE;
        else result = Boolean.FALSE;
        return result;
    }

}
