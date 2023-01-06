package chap2.improved;

/**
 * 문제: 다른 provider, renderer 구현체를 사용하고 싶은 경우 여전히 코드를 변경하여야 한다.
 * 개선: 런타임 시점에 외부에서 provider, renderer 를 결정하도록 하자. {@link HelloWorldImprovedWithConfig}
 */
public class HelloWorldImproved {
    public static void main(String[] args) {
        MessageProvider mp = new HelloWorldMessageProvider();
        MessageRenderer mr = new StandardOutMessageRenderer(mp);
        mr.render(); // 메시지는 MessageProvider가 제공하고, MessageRenderer는 수신받은 내용을 렌더링하면 된다.
    }
}
