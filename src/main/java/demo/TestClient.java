package demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="test-client", configuration=TestClientConfiguration.class)
public interface TestClient {
	@GetMapping()
	public ResponseEntity getTest();
}
