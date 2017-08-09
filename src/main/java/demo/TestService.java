package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	TestClient testClient;
	
	public void test() {
		System.out.println(testClient.getTest());
	}
}
