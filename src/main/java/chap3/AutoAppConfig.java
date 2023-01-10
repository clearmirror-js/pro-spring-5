package chap3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "chap3.annotated")
@Configuration
public class AutoAppConfig {
}
