package ex4;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private String operatorName;
    private List<String> phoneNumbers;

    public Network(String operatorName) {
        this.operatorName = operatorName;
        this.phoneNumbers = new ArrayList<>();
    }


    public String getoperatorName() {
        return operatorName;
    }

    public void setoperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }


    public void addPhoneNumber(String number){
        phoneNumbers.add(number);
    }

    public void printNumbers(){
        System.out.println("Network: " + operatorName);
        System.out.println("phoneNumbers {");
        for (int i = 0; i < phoneNumbers.size(); i++) {
            System.out.println("\t"+phoneNumbers.get(i));
        }
        System.out.println("}");
    }

}
