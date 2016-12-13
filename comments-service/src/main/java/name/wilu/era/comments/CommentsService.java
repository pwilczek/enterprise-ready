package name.wilu.era.comments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommentsService {

	public static void main(String[] args) {
		SpringApplication.run(CommentsService.class, args);
	}
}
