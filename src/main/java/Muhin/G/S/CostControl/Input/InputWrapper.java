package Muhin.G.S.CostControl.Input;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class InputWrapper{
    long id_user;
    String input;
}
