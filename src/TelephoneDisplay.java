
public class TelephoneDisplay {
    private String display = "";

    public void setOnDisplay(String display){
        this.display = display;
    }

    public void setOnDisplayClear(){
        this.display = "";
    }

    public void onShow(){
        System.out.println("************************");
        System.out.println("************************");
        System.out.println("*******" + this.display + "*******");
        System.out.println("************************");
        System.out.println("************************");
    }
}
