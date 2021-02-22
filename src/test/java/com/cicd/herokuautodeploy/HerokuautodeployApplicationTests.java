package com.cicd.herokuautodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "test")
class HerokuautodeployApplicationTests {

	@Test
	void contextLoads() {
	}

}
