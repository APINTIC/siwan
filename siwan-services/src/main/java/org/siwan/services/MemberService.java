package org.siwan.services;

import java.util.Collection;

import org.siwan.persistence.entity.Member;
import org.siwan.persistence.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {

	@Autowired 
	MemberRepository memberRepository; 
	public Collection<Member> getAllMembers(){
		return (Collection<Member>) memberRepository.findAll();
	}
}
