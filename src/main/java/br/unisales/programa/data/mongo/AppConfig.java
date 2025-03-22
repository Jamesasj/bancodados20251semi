package br.unisales.programa.data.mongo;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;

@Configuration
public class AppConfig {
	  /*
	   * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient instance.
	   */
	   public @Bean MongoClient mongoClient() throws UnknownHostException {
	       return new MongoClient("mongodb://root:example@localhost:27017/sys-pie");
	   }
}
