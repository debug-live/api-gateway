package live.debug.msa.apigateway;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/foo")
    public String foo() {
        return restTemplate.getForObject("http://device-service/list", Object.class).toString();
    }
}
