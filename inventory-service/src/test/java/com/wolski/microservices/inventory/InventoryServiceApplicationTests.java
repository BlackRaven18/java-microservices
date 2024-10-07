package com.wolski.microservices.inventory;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.MySQLContainer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class InventoryServiceApplicationTests {

	static MySQLContainer mySQLContainer = new MySQLContainer("mysql:8.3.0");

	@LocalServerPort
	Integer port;

	@BeforeEach
	void setup() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = port;
	}

	static {
		mySQLContainer.start();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void shouldReadInventory() {
		var positiveResponse = RestAssured.given()
				.when()
				.get("/api/inventory?skuCode=iphone_15&quantity=1")
				.then()
				.log().all()
				.statusCode(200)
				.extract().response().as(Boolean.class);

		assertTrue(positiveResponse);

		var negativeResponse = RestAssured.given()
				.when()
				.get("/api/inventory?skuCode=iphone_15&quantity=101")
				.then()
				.log().all()
				.statusCode(200)
				.extract().response().as(Boolean.class);

		assertFalse(negativeResponse);
	}
}
