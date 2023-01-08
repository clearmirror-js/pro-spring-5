package chap2.spring;

import chap2.improved.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class); // 애노테이션 기반의 스프링 컨테이너를 생성한다.
        MessageRenderer mr = ac.getBean("messageRenderer", MessageRenderer.class); // 스프링 컨테이너로부터 빈을 찾아온다.
        mr.render();
    }
}
