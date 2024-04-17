package io.github.filipegabriel.clientesbackend.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class InternacionalizacaoConfig {
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");							//seta o arquivo.properties dentro do diretório resources
		messageSource.setDefaultEncoding("ISO-8859-1");					//Faz com que o na interpolação, o arquivo.properties permita os caracteres brasileiros
		messageSource.setDefaultLocale(Locale.getDefault());			//Detecta através do SO qual a localidade
		return messageSource;
	}
	/*
	@Bean
	public LocalValidatorFactoryBean validatorFactoryBean() {			//Faz a interpolação(integração entre as mensagens) e a validação da especificação de validações do java(Bean validation)
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}
*/
}
