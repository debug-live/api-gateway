package live.debug.msa.apigateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.test.context.junit4.SpringRunner;

@EnableZuulProxy
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiGatewayApplicationTests {

	@Test
	public void contextLoads() {
	}

}
