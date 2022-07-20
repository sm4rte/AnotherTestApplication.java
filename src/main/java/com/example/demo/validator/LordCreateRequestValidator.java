package com.example.demo.validator;

import com.example.demo.model.dto.request.lord.LordCreateRequestDto;
import com.example.demo.util.PhoneNumberCheckUtil;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;

@Component
public class LordCreateRequestValidator implements Validator<LordCreateRequestDto>{
    @Override
    public void validate(LordCreateRequestDto target) throws Exception {
        String emailAdress = target.getEmail();
        if (!EmailValidator.getInstance().isValid(emailAdress)){
                throw new Exception("Вы неправильно ввели почту!");
        }
        //phone check
        target.setPhoneNumber(PhoneNumberCheckUtil.convertFromMaskedToPhoneNumber(target.getPhoneNumber()));
        if (target.getAge()<0) throw new Exception("Вы непрвильно ввели возраст");
    }
}

