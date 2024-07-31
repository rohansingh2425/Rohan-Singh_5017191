package com.example.decorator.test;

import com.example.decorator.EmailNotifier;
import com.example.decorator.Notifier;
import com.example.decorator.SMSNotifierDecorator;
import com.example.decorator.SlackNotifierDecorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending notification with Email and SMS:");
        smsNotifier.send("Hello, this is a test message!");

        System.out.println("\nSending notification with Email, SMS, and Slack:");
        slackNotifier.send("Hello, this is another test message!");
    }
}
