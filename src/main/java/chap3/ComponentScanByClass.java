package chap3;

import chap3.annotated.MessageRenderer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanByClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class); // @ComponentScan 설정 클래스 기반으로 Base-package 이하의 컴포넌트를 모두 스캔하여 스프링 컨테이너를 생성한다.
        MessageRenderer mr = ac.getBean("renderer", MessageRenderer.class);
        mr.render();
        ac.close();
    }
}