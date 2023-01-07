package chap2.spring;

import chap2.improved.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * xml 기반의 스프링 컨테이너 생성도 가능하지만 최근에는 java 클래스에 의한 방식을 사용한다.
 */
public class HelloWorldSpringXml {
    public static void main(String[] args) {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MessageRenderer mr = ac.getBean("renderer", MessageRenderer.class); // 스프링 컨테이너로부터 빈을 찾아온다.
        mr.render();
    }
}
