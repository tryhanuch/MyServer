package beans;

/**
 * Created by tish on 07.06.2014.
 */
public class TCPService {
    private MessageBuilder messageBuilder;
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public MessageBuilder getMessageBuilder() {
        return messageBuilder;
    }

    public void setMessageBuilder(MessageBuilder messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    public void start(){
        //ServerSocket realisation
    }

    public void stop(){

    }
}
