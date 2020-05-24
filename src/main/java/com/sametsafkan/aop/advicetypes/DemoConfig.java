package com.sametsafkan.aop.advicetypes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.sametsafkan.aop.advicetypes")
public class DemoConfig {

}
