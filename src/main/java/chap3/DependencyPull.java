package chap3;

import chap2.improved.MessageRenderer;
import chap2.spring.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Dependency Lookup (DL)
 */
public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class); // 스프링 컨테이너 생성
        MessageRenderer mr = ac.getBean("messageRenderer", MessageRenderer.class);
        mr.render();
    }
}
