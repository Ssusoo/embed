package ms.ssu.boot;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // MySpringBootApplication.TYPE 클래스 레벨이 붙는다.
@Retention(RetentionPolicy.RUNTIME) // 거의 런타임으로 함.
@Documented // 문서화 시키기
@ComponentScan // 스프링이 내부적으로 읽어 @ComponentScan으로 인식시킴
public @interface MySpringBootApplication {
}
