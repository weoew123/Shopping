package cls.user.entity;

import java.util.HashMap;
import java.util.Map;

import mapper.user.UserAddMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import session.ShopSqlSessionFactory;
import vo.UserDetail;

@Repository
public class UserAddEntity implements intfc.user.entity.UserAddEntity {

	@Override
	public boolean addDefalutUser(String id, String pwd) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance().getSqlSession();
		Map<String, String> param = new HashMap<String, String>();
		param.put("id", id);
		param.put("pwd", pwd);

		try {
			UserAddMapper userAddMapper = sqlsession
					.getMapper(UserAddMapper.class);
			userAddMapper.addDefalutUser(param);

			
			if(!makeDetailUser(id, sqlsession)) {
				return false;
			}
			if(!addInfoUser(id, sqlsession)) {
				return false;
			}
			sqlsession.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	@Override
	public boolean addDetailUser(UserDetail addUser) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			UserAddMapper userAddMapper = sqlsession
					.getMapper(UserAddMapper.class);
			userAddMapper.addDetailUser(addUser);
			
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}
	
	private boolean addInfoUser(String id, SqlSession sqlsession) {
		try {
			UserAddMapper userAddMapper = sqlsession.getMapper(UserAddMapper.class);
			userAddMapper.addInfoUser(id);

			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
		}
		return true;
	}

	@Override
	public boolean overlap(String id) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		boolean flag = true;
		
		try {
			UserAddMapper userAddMapper = sqlsession.getMapper(UserAddMapper.class);
			if(userAddMapper.overlap(id) == 1) {
				flag = false;
			}

			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return flag;
		} finally {
			sqlsession.close();
		}
		
		return flag;
	}

	private boolean makeDetailUser(String id, SqlSession sqlsession) {
		
		try {
			UserAddMapper userAddMapper = sqlsession.getMapper(UserAddMapper.class);
			userAddMapper.makeDetailUser(id);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
		}
		
		return true;
	}

	

}
