package chat;

import java.io.Serializable;

public class Message implements Serializable{
    private String type;
    private String text;
    private String auther;
    private String time;
    
    Message(String type, String auther, String text, String time) {
        this.type = type;
        this.text = text;
        this.auther = auther;
        this.time = time;
    }
    
    Message(String type, String auther) {
        this.type = type;
        this.auther = auther;
    }
    
    Message(String type) {
        this.type = type;
    }

    public String getText() { return text; }
    public String getAuther() { return auther; }
    public String getTime() { return time; }
    public String getType() { return type; }
}
