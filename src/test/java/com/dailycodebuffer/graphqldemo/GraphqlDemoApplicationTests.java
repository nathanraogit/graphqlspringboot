package com.dailycodebuffer.graphqldemo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GraphqlDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void firsttestcase() {
		int actual2 = 1;
		int  expected = 1;
		assertThat(actual2).isEqualTo(expected);


	}


}
