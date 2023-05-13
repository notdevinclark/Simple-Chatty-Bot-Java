package com.notdevinclark.bot;

public class SimpleBot {
    public static void main(String[] args) {
        ChatBot chatty = new ChatBot();
        chatty.greeting();
        chatty.askForName();
        chatty.ageGame();
        chatty.countToAnyNumber();
        chatty.multipleChoiceTest();
        chatty.shutDown();
    }
}
