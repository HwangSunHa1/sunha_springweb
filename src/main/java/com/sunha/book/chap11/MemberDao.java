package com.sunha.book.chap11;

import java.util.List;

public interface MemberDao {
	
	Member selectByLogin(String email, String password);
	
	void insert(Member member);

	List<Member>selectAll(int offset, int count);
	
	int countAll();
	
	int changePassword(String memberId, String currentPassword, String newPassword);
}
