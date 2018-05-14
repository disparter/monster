package com.github.disparter.ddnext.monster.helper;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class Translator {

    @Resource(name = "messageSource")
    private MessageSource injectedMessageSource;
    
    public static MessageSource messageSource;

    public static String get(String messageKey) {
        return messageSource.getMessage(messageKey, null, LocaleContextHolder.getLocale());
    }

    @PostConstruct
    public void postConstruct() {
        messageSource = injectedMessageSource;
    }
}