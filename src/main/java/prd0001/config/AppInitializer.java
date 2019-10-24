/**
 * 
 */
package prd0001.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author mahesh.kharote
 * 
 */
@SpringBootApplication
@ComponentScan(value = "prd0001")
@EntityScan(basePackages = {"prd0001.entity"})
public class AppInitializer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppInitializer.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AppInitializer.class, args);

	}

}

