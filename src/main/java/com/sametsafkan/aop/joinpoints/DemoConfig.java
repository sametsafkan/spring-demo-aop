package com.sametsafkan.aop.joinpoints;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.sametsafkan.aop.joinpoints")
public class DemoConfig {

}
