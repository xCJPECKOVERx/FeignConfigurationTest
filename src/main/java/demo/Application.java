package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import feign.RequestInterceptor;

@SpringBootApplication
@EnableFeignClients
@EnableOAuth2Client
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
//	@Bean
//	@ConfigurationProperties(prefix = "security.oauth2.client")
//	public ClientCredentialsResourceDetails clientCredentialsResourceDetails() {
//		return new ClientCredentialsResourceDetails();
//	}
//	
//	@Bean
//	public RequestInterceptor oauth2FeignRequestInterceptor(){
//		return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), clientCredentialsResourceDetails());
//	}
//
//	@Bean
//	public OAuth2RestTemplate clientCredentialsRestTemplate() {
//		return new OAuth2RestTemplate(clientCredentialsResourceDetails());
//	}
}
