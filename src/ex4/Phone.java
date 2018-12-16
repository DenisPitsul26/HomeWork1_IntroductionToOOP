package ex4;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void registerToNetwork(Network network){
       if (!isRegisteredInNetwork(network, getNumber()))
            network.addPhoneNumber(number);
    }

    public void call(Network network, String callerNumber) {
        if (isRegisteredInNetwork(network, getNumber())) {

            if (isRegisteredInNetwork(network, callerNumber)) {
                System.out.println("Making call...");
            }
            else
                System.out.println("Caller number is not registered to network!!!");
        }
        else
            System.out.println("Our number is not registered to network!!!");

    }

    public boolean isRegisteredInNetwork(Network network, String number) {
        boolean isNumberRegistered = false;
        for (int i = 0; i < network.getPhoneNumbers().size(); i++) {
            if (network.getPhoneNumbers().get(i).equals(number)) {  //чи зареєстрований наш номер в мережі
                isNumberRegistered = true;
                break;
            }
        }

        return isNumberRegistered;
    }
}
