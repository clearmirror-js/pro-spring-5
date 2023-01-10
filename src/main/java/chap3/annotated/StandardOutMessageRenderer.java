package chap3.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer") // 애노태이션 기반의 컴포넌트 등록
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    // 생성자 주입을 통한 의존성 주입
    @Autowired
    public StandardOutMessageRenderer(MessageProvider provider) {
        System.out.println("StandardOutMessageRenderer.StandardOutMessageRenderer");
        this.messageProvider = provider;
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

}
