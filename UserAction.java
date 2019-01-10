package cn.bdqn.tangcco.tcbd1005.shiwenqi01.user.action;

import cn.bdqn.tangcco.tcbd1005.shiwenqi01.user.biz.UserBiz;
import cn.bdqn.tangcco.tcbd1005.shiwenqi01.user.entity.Student;
import cn.bdqn.tangcco.tcbd1005.shiwenqi01.user.entity.User;

public class UserAction {

	private UserBiz biz;
	//shift+enter(»Ø³µ)
	public UserAction() {
		biz = new UserBiz();
	}
	
	public boolean login(User users){
		//ctrl+shift+o 0
		Student student = biz.login(users);
		
		if(student!=null){
			System.out.println(student);//toString
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
