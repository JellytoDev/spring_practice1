package spring_practice1.spring_practice1.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//해당 빈사이클 인터페이스는 너무 스프링 의존적, 외부 라이브러리는 적용할 수 없다.
public class NetworkClient {
    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
        connect();
        call("초기화 연결 메세지");

    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작시 호출
    public void connect() {
        System.out.println("connect = " + url);

    }

    public void call(String message) {
        System.out.println("call: "+url+" message = " + message);
    }

    // 서비스 종료시 호출
    public void disconnect() {
        System.out.println("close " + url);
    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메세지");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }

}
