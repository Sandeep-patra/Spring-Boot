package in.AshokIt.service;

import in.AshokIt.dao.IUserDao;

public class UserService implements IUserService {
	IUserDao uDao;
	
	public void setuDao(IUserDao uDao) {
		this.uDao = uDao;
	}

	@Override
	public String getName(int id) {
		return uDao.findName(id);
	}

}
