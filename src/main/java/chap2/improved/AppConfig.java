package chap2.improved;


public class AppConfig {

    public MessageProvider messageProvider() {
        return new HelloWorldMessageProvider();
    }

    public MessageRenderer messageRenderer() {
        return new StandardOutMessageRenderer(messageProvider());
    }

}
