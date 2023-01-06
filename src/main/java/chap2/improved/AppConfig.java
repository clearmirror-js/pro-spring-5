package chap2.improved;


public class AppConfig {

    // Singleton
    private static AppConfig instance = new AppConfig();

    public MessageProvider messageProvider() {
        return new HelloWorldMessageProvider();
    }

    public MessageRenderer messageRenderer(MessageProvider mp) {
        return new StandardOutMessageRenderer(mp);
    }

    private AppConfig() {
    }

    public static AppConfig getInstance() {
        return instance;
    }
}
