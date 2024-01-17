package com.example.springcore.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpringCoreService {

    public SpringCoreService() {
        log.info("Object was created");
    }

    @PostConstruct
    public void init() {
        log.info("INITIALIZE SpringCoreService");
    }

    @PreDestroy
    public void destroy() {
        log.info("DESTROY SpringCoreService");
    }
}
