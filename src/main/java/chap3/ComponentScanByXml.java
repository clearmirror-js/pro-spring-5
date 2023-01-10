package chap3;

import chap3.annotated.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ComponentScanByXml {

    public static void main(String[] args) {
        GenericXmlApplicationContext ac
                = new GenericXmlApplicationContext("app-context-annotation.xml"); // xml 기반으로 Base-package 이하의 컴포넌트를 모두 스캔하여 스프링 컨테이너를 생성한다.
        MessageRenderer mr = ac.getBean("renderer", MessageRenderer.class);
        mr.render();
        ac.close();
    }
}
