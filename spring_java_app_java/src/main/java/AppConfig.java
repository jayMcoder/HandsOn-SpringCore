import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.springapp.repository.CustomerRepository;
import com.springapp.repository.HibernateCustomerRepositoryImpl;
import com.springapp.service.CustomerService;
import com.springapp.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.springapp"})
@PropertySource("app.properties")
public class AppConfig {
	
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		// customerService.setCustomerRepository(getCustomerRepository());
//		
//		return customerService;
//	}
	
//	 @Bean(name = "customerRegistry")
//	 public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	 }
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer 
		getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
