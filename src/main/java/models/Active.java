package models;

public class Active {
    public Boolean checker (int active){
        Boolean result;
        if (active == 1){
            result = Boolean.TRUE;
        } else result = Boolean.FALSE;
        return result;
    }
}
