package chap2.spring;

import chap2.improved.HelloWorldMessageProvider;
import chap2.improved.MessageProvider;
import chap2.improved.MessageRenderer;
import chap2.improved.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration에 의해 @ComponentScan의 대상이 된다.
 * AppConfig 클래스에 선언한 @Bean은 스프링 컨테이너에 의해 싱글톤으로 관리된다.
 * @see chap2.improved.AppConfig
 */
@Configuration
public class AppConfig {

    @Bean
    public MessageProvider messageProvider() {
        System.out.println("AppConfig.messageProvider");
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer(MessageProvider messageProvider) {
        System.out.println("AppConfig.messageRenderer");
        return new StandardOutMessageRenderer(messageProvider);
    }

}
