package chap2.spring;

import chap2.improved.HelloWorldMessageProvider;
import chap2.improved.MessageProvider;
import chap2.improved.MessageRenderer;
import chap2.improved.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 애노테이션은 CGLIB를 통해 설정정보 클래스의 바이트코드를 조작하여 싱글톤을 보장하도록 한다.
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
    public MessageRenderer messageRenderer() {
        System.out.println("AppConfig.messageRenderer");
        return new StandardOutMessageRenderer(messageProvider());
    }

}
