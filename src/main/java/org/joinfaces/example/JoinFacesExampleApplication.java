
package org.joinfaces.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author Victor Santana
 */
@SpringBootApplication
@EnableFeignClients
public class JoinFacesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoinFacesExampleApplication.class, args);
	}
}
