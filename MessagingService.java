package com.sarmale;

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> listOfMessages;

    public MessagingService(){
        this.listOfMessages = new ArrayList<>();
    }

    public ArrayList<Message> getListOfMessages() {
        return listOfMessages;
    }

    public void printListSenders(){
        for(Message x: this.listOfMessages){
            System.out.println(x.getSender());
        }
    }

    public void printListContent(){
        for ( Message x: this.listOfMessages ){
            System.out.println(x.getContent());
        }
    }

    public void add(Message message){
        if ( message.getContent().length() < 12 ){
            this.listOfMessages.add(message);
        }
    }

    public static void main(String[] args) {
        Message mesaj = new Message("ana", "hot singles in your area");
        Message msg = new Message("maria", "hot wings");
        Message msg1 = new Message("mariuca", "hot winggs");

        MessagingService x = new MessagingService();
        x.add(mesaj);
        x.add(msg);
//        x.printListSenders();
        x.printListContent();

        MessagingService y = new MessagingService();
        y.add(mesaj);
        y.add(msg1);
        y.printListContent();
    }
}
