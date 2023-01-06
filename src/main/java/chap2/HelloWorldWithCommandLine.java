package chap2;

/**
 * 문제: 메시지를 받아오는 방식을 바꾸는 경우 렌더링하는 방식 역시 바뀌어야 한다.
 * 개선: 메시지 출력과 메시지 수신을 분리하자. {@link chap2.improved.HelloWorldImproved}
 * @see chap2.improved.MessageRenderer
 * @see chap2.improved.MessageProvider
 */
public class HelloWorldWithCommandLine {
    public static void main(String... args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello world!");
        }
    }
}
