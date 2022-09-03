package me.boris.bqmongo;

import me.boris.bqmongo.repository.ProductoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class BqmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BqmongoApplication.class, args);
	}

}
