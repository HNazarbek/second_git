package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Chat chat = message.getChat();
        Long id = chat.getId();
        Long friendid = 743854287l;
        Long myId = 7357159462l;

        if (update.getMessage().getChat().getId().equals(friendid)) {
            send(myId, message.getText());
        } else if (update.getMessage().getChat().getId().equals(myId)) {
            send(friendid, message.getText());
        }
    }

    private void send(Long chatid, String meassage){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText(meassage);
        try{
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return "t.me/jsdcvkyusv_bot";
    }
    @Override
    public String getBotToken() {
        return "7811438294:AAHyg8Q4-oVQCw-F8_s6nBAahVOpICoW3EQ";
    }
}
