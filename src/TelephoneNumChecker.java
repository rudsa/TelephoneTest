public class TelephoneNumChecker {
    private String telNumber = "";
    private String checkNumber = "";
    public void setTelNumber(String telNumber){
        this.telNumber = telNumber;
    }

    public String getTelNumber(){
        return this.telNumber;
    }

    public void telNumberChecker(){
        this.checkNumber = getTelNumber().substring(0, 3);

    }
}
