package com.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


@Service
public class Utility implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public static Object getBean (String beanId) {
        return applicationContext.getBean(beanId);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
