package chap2.spring;

import chap2.improved.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class HelloWorldSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageRenderer mr = ac.getBean("messageRenderer", MessageRenderer.class); // 스프링 컨테이너로부터 빈을 찾아온다.
        mr.render();
    }
}
