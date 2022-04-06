package Muhin.G.S.CostControl.BotState;

import Muhin.G.S.CostControl.Input.InputWrapper;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class ContextState {
    AbstractState state;

    public BotApiMethod<?> doAction(InputWrapper inputWrapper){
        return state.action(inputWrapper);
    }
}
