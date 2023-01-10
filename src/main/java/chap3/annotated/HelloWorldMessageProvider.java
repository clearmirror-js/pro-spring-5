package chap3.annotated;

import org.springframework.stereotype.Component;

@Component("provider") // 애노테이션 기반의 컴포넌트 등록
public class HelloWorldMessageProvider implements MessageProvider {

    public HelloWorldMessageProvider() {
        System.out.println("HelloWorldMessageProvider.HelloWorldMessageProvider");
    }

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
