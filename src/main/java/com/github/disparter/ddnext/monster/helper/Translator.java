package com.github.disparter.ddnext.monster.helper;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Component
public class Translator {
	
	@Autowired
	private HttpServletRequest request;
	
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US); // Set default Locale as US
		return slr;
	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasenames("messages"); // name of the resource bundle
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}
	
	@Bean
	public String get(String code) {
		ResourceBundleMessageSource source = messageSource();
		return source.getMessage(code, null, localeResolver().resolveLocale(request));
	}
}
