package session;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class ShopSqlSessionFactory {

	private static ShopSqlSessionFactory instance;
    private SqlSessionFactory sqlSessionFactory;
    private final String resource = "mybatis-config.xml";
    
    
    private ShopSqlSessionFactory() {
    }
    
    public static ShopSqlSessionFactory getInstance() {
        if(instance == null) {
            instance = new ShopSqlSessionFactory();
        }
        return instance;
    }
    
    /**
     * return Sqlsession
     * @return Sqlsession
     */
    public SqlSession getSqlSession() {
        if(sqlSessionFactory == null) {
        Reader reader;
        
        try {
            reader = Resources.getResourceAsReader(resource);
        }
        
        catch(IOException e) {
        	throw new RuntimeException(resource + " : 파일 로드중 에러가 발생했습니다.");
        }
        
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }
        return sqlSessionFactory.openSession();
        
    }

}
