package Muhin.G.S.CostControl.Controler;

import Muhin.G.S.CostControl.Input.InputWrapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HandlerMessage{

    @Autowired
    InputWrapper input;

    public InputWrapper handel(Message message){
        input.setInput(message.getText());
        input.setId_user(message.getChatId());
        return input;
    }
}