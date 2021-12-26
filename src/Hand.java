import java.util.Scanner;

public class Hand {
    private String callNumber = "";

    public String getCallNumber() {
        return callNumber;
    }

    public void pressTelButtons(String number){
        TelephoneButtons telButtons = new TelephoneButtons();
        for(int i=0; i<number.length(); i++){
            switch (number.charAt(i)){
                case '0':{
                    System.out.println("Press : " + telButtons.getTelButtonZero());
                    callNumber += telButtons.getTelButtonZero();
                    break;
                }
                case '1':{
                    System.out.println("Press : " + telButtons.getTelButtonOne());
                    callNumber += telButtons.getTelButtonOne();
                    break;
                }
                case '2':{
                    System.out.println("Press : " + telButtons.getTelButtonTwo());
                    callNumber += telButtons.getTelButtonTwo();
                    break;
                }
                case '3':{
                    System.out.println("Press : " + telButtons.getTelButtonThree());
                    callNumber += telButtons.getTelButtonThree();
                    break;
                }
                case '4':{
                    System.out.println("Press : " + telButtons.getTelButtonFour());
                    callNumber += telButtons.getTelButtonFour();
                    break;
                }
                case '5':{
                    System.out.println("Press : " + telButtons.getTelButtonFive());
                    callNumber += telButtons.getTelButtonFive();
                    break;
                }
                case '6':{
                    System.out.println("Press : " + telButtons.getTelButtonSix());
                    callNumber += telButtons.getTelButtonSix();
                    break;
                }
                case '7':{
                    System.out.println("Press : " + telButtons.getTelButtonSeven());
                    callNumber += telButtons.getTelButtonSeven();
                    break;
                }
                case '8':{
                    System.out.println("Press : " + telButtons.getTelButtonEight());
                    callNumber += telButtons.getTelButtonEight();
                    break;
                }
                case '9':{
                    System.out.println("Press : " + telButtons.getTelButtonNine());
                    callNumber += telButtons.getTelButtonNine();
                    break;
                }
                case '#':{
                    System.out.println("Press : " + telButtons.getTelButtonSharp());
                    callNumber += telButtons.getTelButtonSharp();
                    break;
                }
                case '*':{
                    System.out.println("Press : " + telButtons.getTelButtonAsterisk());
                    callNumber += telButtons.getTelButtonAsterisk();
                    break;
                }
                default:{
                    callNumber += " Not Number";
                    break;
                }
            }
        }
    }


}
