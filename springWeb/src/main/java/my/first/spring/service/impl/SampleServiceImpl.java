package my.first.spring.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import my.first.spring.dao.SampleDAO;
import my.first.spring.service.SampleService;


@Service("sampleService")
public class SampleServiceImpl implements SampleService{
	
	@Resource(name="sampleDAO")
	private SampleDAO sampleDAO;

	@Override
	public List<Map<String, Object>> testSample() {
		return sampleDAO.testSample();
	}
	
	
	
}
