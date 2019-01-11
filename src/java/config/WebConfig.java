/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import service.GameService;
import service.GameServiceImpl;
import validator.NumberValidation;

/**
 *
 * @author ief
 */
@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class WebConfig extends WebMvcConfigurerAdapter{
    
    @Bean 
    public NumberValidation numberValidator(){
        return new NumberValidation();
    }  
    @Bean
    public GameService gameService(){
        return new GameServiceImpl();
    } 
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource =
        new ResourceBundleMessageSource();
        messageSource.setBasename("resources/messages"); return messageSource;
    }
  
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").
                                 addResourceLocations("/WEB-INF/resources/css/");
    }
}
