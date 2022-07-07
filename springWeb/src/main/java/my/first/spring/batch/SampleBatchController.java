package my.first.spring.batch;

import org.springframework.stereotype.Component;

@Component("sampleTest")
public class SampleBatchController {
	
	
	public void sampleBatch() {
		System.out.println("배치시작");
		System.out.println("배치종료");
	}
}
