import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String scanTelNum = scan.nextLine();
        TelephoneNumChecker telNumChecker = new TelephoneNumChecker();
        telNumChecker.setTelNumber(scanTelNum);

        Hand hand = new Hand();
        hand.pressTelButtons(telNumChecker.getTelNumber());

        TelephoneDisplay telDisplay = new TelephoneDisplay();
        telDisplay.setOnDisplay(hand.getCallNumber());
        telDisplay.onShow();
    }
}
