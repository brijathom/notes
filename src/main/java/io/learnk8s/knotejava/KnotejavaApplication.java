package io.learnk8s.knotejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SpringBootApplication
public class KnotejavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnotejavaApplication.class, args);
	}

}

@Document(collection = "notes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Note {
	@Id
	private String id;
	private String description;

	@Override
	public String toString() {
		return description;
	}
}
