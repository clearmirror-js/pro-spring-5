package chap2.improved;

/**
 * provider, renderer 구현체를 변경하더라도 AppConfig만 수정하면 코드를 수정하지 않아도 된다.
 * @see AppConfig
 */
public class HelloWorldImprovedWithConfig {

    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        MessageProvider mp = appConfig.messageProvider();
        MessageRenderer mv = appConfig.messageRenderer(mp);
        mv.render();
    }
}
