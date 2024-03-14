package in.AshokIt.dao;


public class UserDao implements IUserDao {

	@Override
	public String findName(int id) {
		if(id==100)
			return "Sandeep";
		else if(id==101)
			return "Akash";
		return null;
	}

}
