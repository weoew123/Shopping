package cls.user.entity;

import mapper.user.UserModifyMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.User;

public class UserModifyEntity implements intfc.user.entity.UserModifyEntity{

	@Override
	public boolean modifyUser(User user) {
		
		
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			UserLogEntity userLog = new UserLogEntity();
			
			if(!userLog.modifyLog(user.getId())) {
				return false;
			}
			
			UserModifyMapper userModifyMapper = sqlsession.getMapper(UserModifyMapper.class);
			userModifyMapper.modifyUser(user);

			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

}
