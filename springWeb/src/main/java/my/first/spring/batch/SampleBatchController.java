package my.first.spring.batch;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("sampleTest")
public class SampleBatchController {
	
	private final Logger log = LoggerFactory.getLogger(SampleBatchController.class);
	public void sampleBatch() {
		log.debug("log test");
		System.out.println("��ġ����");
		System.out.println("��ġ����");
		log.info("info"); 
	}
}
