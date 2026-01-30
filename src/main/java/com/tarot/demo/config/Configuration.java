package com.tarot.demo.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories(basePackages = "com.tarot.demo")
@EnableTransactionManagement
@org.springframework.context.annotation.Configuration
public class Configuration {

}
