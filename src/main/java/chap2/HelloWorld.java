package chap2;

/**
 * 문제: 출력 메시지나 출력 방식을 바꾸기 위해서는 직접 코드를 수정하여야 한다.
 * 개선: 메시지 내용을 외부로부터 받아오자. {@link HelloWorldWithCommandLine}
 */
public class HelloWorld {
    public static void main(String... args) {
        System.out.println("Hello world!");
    }
}
