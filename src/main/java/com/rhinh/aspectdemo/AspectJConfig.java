package com.rhinh.aspectdemo;

import com.rhinh.aspectdemo.*;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.rhinh")
public class AspectJConfig {
    @Bean
    public LogAspect getLogAspect() {
        return new LogAspect();
    }
    @Bean("Account")
    public Account getAccount() {
        return new Account();
    }
//    @Bean
//    public AnnotationAwareAspectJAutoProxyCreator getAnnotationAwareAspectJAutoProxyCreator() {
//        return new AnnotationAwareAspectJAutoProxyCreator();
//    }
}
