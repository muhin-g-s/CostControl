package Muhin.G.S.CostControl.Controler;

import Muhin.G.S.CostControl.BotState.ContextState;
import Muhin.G.S.CostControl.Input.InputWrapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CostControlBot extends TelegramWebhookBot {

    @Autowired
    HandlerCallbackQuery handlerCallbackQuery;
    @Autowired
    HandlerMessage handlerMassage;
    @Autowired
    ContextState contextState;
    @Autowired
    InputWrapper input;

    @Value("${telegram.webhook-path}")
    String botPath;
    @Value("${telegram.user}")
    String botUsername;
    @Value("${telegram.token}")
    String botToken;

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotPath() {
        return botPath;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        if(update.hasCallbackQuery())
            input = handlerCallbackQuery.handel(update.getCallbackQuery());

        if(update.hasMessage())
            input = handlerMassage.handel(update.getMessage());

       return contextState.doAction(input);
    }
}