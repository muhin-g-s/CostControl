package Muhin.G.S.CostControl.Configuration;

import Muhin.G.S.CostControl.BotState.AbstractState;
import Muhin.G.S.CostControl.BotState.ContextState;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ContextStateConfig {

    @Autowired
    AbstractState state;

    @Bean
    public ContextState contextState(){
        ContextState contextState = new ContextState();
        contextState.setState(state);
        return contextState;
    }
}
