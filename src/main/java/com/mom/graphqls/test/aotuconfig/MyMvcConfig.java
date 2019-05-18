//package com.mom.graphqls.test.aotuconfig;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//@EnableWebMvc
//public class MyMvcConfig extends WebMvcConfigurerAdapter{
//
////    //继承WebMvcConfigurerAdapter实现无web.xml配置解析器
////    @Bean
////    public InternalResourceViewResolver viewResolver(){
////        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
////        viewResolver.setPrefix("/WEB_INF/classes/views/");
////        viewResolver.setSuffix(".jsp");
////        viewResolver.setViewClass(JstlView.class);
////        return viewResolver;
////    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//    }
//
//}
