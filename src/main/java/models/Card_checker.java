package models;

public class Card_checker {
    public Boolean checker(String cardnumber){
        String[] card1 = {"9860 1601 3384 9895", "8600 0604 2192 9705", "4231 2000 1448 5087"};
        boolean result;
        for(int i = 0; true;){
            if (cardnumber.equals(card1[i])){
                result =  Boolean.TRUE;
                break;
            } else result = Boolean.FALSE;
        }
        return result;
    }

}
