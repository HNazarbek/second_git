package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Najot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            if (text.equals("/start")) {

                SendMessage message = new SendMessage();
                message.setText("Assalomu aleykum☺\uFE0F!  \n Bizning botimiz sizga yordam berishga tayyor. \uD83D\uDE98Siz bu botda Toshkent boylab barcha Zaprafkalar manzilini\uD83D\uDCCD olishingiz mumkin.");
                message.setChatId(chatId);
               message.setReplyMarkup(menuButton());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }else if (text.equals("⬅\uFE0F Ortga")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuButton();
                SendMessage message  = new SendMessage();
                message.setText("Bosh menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("Sergili")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }else if (text.equals("Uchtepa")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }else if (text.equals("Yunusobod")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }else if (text.equals("Zangiota")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }else if (text.equals("Yangihayot")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }else if (text.equals("Choshtepa")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }else if (text.equals("Shayxontoxur")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }else if (text.equals("Olmazor")) {
                ReplyKeyboardMarkup markup = (ReplyKeyboardMarkup) menuortga();
                SendMessage message = new SendMessage();
                message.setText("Lokatsiya");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                SendLocation location = new SendLocation();
                double longitude = 41.2269415;
                double latitude = 69.1858632;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83D\uDEABGaz")) {
                SendMessage message = new SendMessage();
                message.setText("Ozingizga maqul joyni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(menuPlace());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⛽\uFE0FBenzin")) {
                    SendMessage message = new SendMessage();
                    message.setText("Ozingizga maqul joyni tanlang");
                    message.setChatId(chatId);
                    message.setReplyMarkup(menuPlace());
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
            } else if (text.equals("\uD83C\uDD7F\uFE0FPropan")) {
                    SendMessage message = new SendMessage();
                    message.setText("Ozingizga maqul joyni tanlang");
                    message.setChatId(chatId);
                    message.setReplyMarkup(menuPlace());
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDD0BElectro shaxobchasi")) {
                    SendMessage message = new SendMessage();
                    message.setText("Ozingizga maqul joyni tanlang");
                    message.setChatId(chatId);
                    message.setReplyMarkup(menuPlace());
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                }
            }
        }

    }

    private Object menuortga() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅\uFE0F Ortga");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);

        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    private ReplyKeyboard menuPlace() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Uchtepa");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Yunusobod");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Zangiota");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Sergili");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Yangihayot");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Choshtepa");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Shayxontoxur");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Olmazor");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("⬅\uFE0F Ortga");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button7);
        row4.add(button8);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    private ReplyKeyboard menuButton () {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDEABGaz");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⛽\uFE0FBenzin");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDD7F\uFE0FPropan");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDD0BElectro shaxobchasi");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);




        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    @Override
    public String getBotUsername() {
        return "t.me/Najot_oil_bot";
    }
    @Override
    public String getBotToken() {
        return "7797739581:AAFD5pjxIuR_E0UJAllizrCroUeGBqNqOk0";
    }
}


