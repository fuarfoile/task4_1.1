/*
 * Buyer.java 24/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.buyer;

import com.boast.random.RandomString;
import java.io.Serializable;

public class Buyer implements Serializable {
    private String firstName;
    private String secondName;
    private String thirdName;
    private String address;
    private Long creditCardNumber;
    private Long bankAccountNumber;

    public Buyer() {
        firstName = RandomString.getFirstName();
        secondName = RandomString.getSecondName();
        thirdName = RandomString.getThirdName();
        address = RandomString.getAddress();
        creditCardNumber = (long) (Math.random() * 9999_9999_9999_9999L); //1000
        bankAccountNumber = (long) (Math.random() * 999_999_999_999_999_999L);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getAddress() {
        return address;
    }

    public Long getCreditCardNumber() {
        return creditCardNumber;
    }

    public Long getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        String zeros = "00000000000000000000";

        String result = firstName + " " + secondName + " " + thirdName;
        result += "\n  Address: " + address;

        String card = zeros.substring(0, 16 - creditCardNumber.toString().length()) + creditCardNumber;
        card = card.substring(0, 4) + "_" + card.substring(4, 8) + "_" + card.substring(8, 12) + "_" + card.substring(12, 16);

        String bankNumber = zeros.substring(0, 18 - bankAccountNumber.toString().length()) + bankAccountNumber;

        result += "\n  Credit Card Number: " + card + "\n  Bank Account Number: " + bankNumber;
        return result;
    }
}