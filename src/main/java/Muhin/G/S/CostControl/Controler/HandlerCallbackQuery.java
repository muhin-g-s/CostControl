package Muhin.G.S.CostControl.Controler;

import Muhin.G.S.CostControl.Input.InputWrapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HandlerCallbackQuery {

    @Autowired
    InputWrapper input;

    public InputWrapper handel(CallbackQuery callbackQuery){
        input.setInput(callbackQuery.getData());
        input.setId_user(Long.parseLong(callbackQuery.getId()));
        return input;
    }
}