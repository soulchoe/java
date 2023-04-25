package com.bs.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import com.bs.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map=new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		// 있다면 false 값 반환
	//	boolean result=false;
//		for(String key:map.keySet()) {
//			if(key.equals(id)) {
//				return false;
//			}else {
//				map.put(id, m);
//				return true;
//			}
//		}
//		return ;
		if(map.containsKey(id)) {
			return false;
		}else {
			map.put(id, m);
			return true;
		}
	
	}
	public String logIn(String id, String password) {
//		String result=null;
//		Iterator itr=map.keySet().iterator();
//		while(itr.hasNext()) {
//			if(itr.next().equals(id)) {
//				if(map.get(id).getPassword().equals(password)) result=id;break;
//			}
//		}
//		return result;
		if(map.get(id).getPassword().equals(password)) return id;
		else return null;
		
	}
	public boolean changePassword(String id, String oldPw, String newPw) {
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
		// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
		if(map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		else return false;
	}
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
		
	}
//	public TreeMap sameName(String name) {
//		
//	}
}
