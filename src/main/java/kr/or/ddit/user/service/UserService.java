package kr.or.ddit.user.service;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.user.model.UserVo;

public class UserService implements IuserService {
	
	public UserService(){
	
	}
	
	@Override
	public List<UserVo> userList() {
	    
	    //가짜 사용자 데이터를 리턴한다
	    List<UserVo> userList = new ArrayList<UserVo>();
	    userList.add(new UserVo("브라운", "brown", "곰"));
	    userList.add(new UserVo("코니", "cony", "토끼"));
	    userList.add(new UserVo("샐리", "sally", "병아리"));
	    return userList;
	}

	

}
