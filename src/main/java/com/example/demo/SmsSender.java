package com.example.demo;

//use this interface to define SMS
//use interface because can switch provider without changing code
public interface SmsSender {
    void sendSms(SmsRequest smsRequest); //allow any implementation to send sms
}
