package Interface;

public class Main {
    public static void main(String[] args) {
        Interfaces.ITelephone myPhone;
        myPhone = new Interface.DeskPhone(123123);

        myPhone.powerOn();
        myPhone.callPhone(123123);
        myPhone.answer();

        myPhone = new Interface.MobilePhone(01234);
        myPhone.powerOn();
        myPhone.callPhone(01234);
        myPhone.answer();
    }
}