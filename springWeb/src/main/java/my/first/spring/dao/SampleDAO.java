package my.first.spring.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("sampleDAO")
public class SampleDAO extends SqlSessionDaoSupport{
	
	@Override
	@Resource(name="sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
	
	
	public List<Map<String,Object>> testSample(){
		return getSqlSession().selectList("mybatis.mappers.sample.testSample");
	}
	
}
