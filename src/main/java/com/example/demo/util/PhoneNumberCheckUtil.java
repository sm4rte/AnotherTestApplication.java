package com.example.demo.util;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

@UtilityClass
public class PhoneNumberCheckUtil {
    public static String convertFromMaskedToPhoneNumber(String maskedNumber) throws Exception {
        if (!StringUtils.isNumeric(maskedNumber)) {
            maskedNumber = maskedNumber.replaceAll("[^0-9]", "");
        }
        if (StringUtils.startsWith(maskedNumber, "8")) {
            maskedNumber = maskedNumber.replaceFirst("8", "7");
        }
        if (!maskedNumber.startsWith("7") || maskedNumber.length() != 11) {
            throw new Exception("Номер телефона введен некорректно!");
        }
        return maskedNumber;
    }
}

