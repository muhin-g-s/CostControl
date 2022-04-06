package Muhin.G.S.CostControl.BotState;

import Muhin.G.S.CostControl.Input.InputWrapper;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;

@Component
public abstract class AbstractState {
    public abstract BotApiMethod<?> action(InputWrapper input);
}
