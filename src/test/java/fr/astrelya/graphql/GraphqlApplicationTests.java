package fr.astrelya.graphql;

import fr.astrelya.graphql.model.Continent;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class GraphqlApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void globalTest(){
		final var continents = Continent.values();
		System.out.println(continents);
	}

}
