package com.example.springcore.beanPostProcessors;

import com.example.springcore.service.SpringCoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass() == SpringCoreService.class) {
            log.info("POST PROCESS BEFORE INITIALIZATION " + beanName);
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass() == SpringCoreService.class) {
            log.info("POST PROCESS AFTER INITIALIZATION " + beanName);
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
