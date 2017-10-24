package org.siwan.rest.controller;

import java.util.Collection;

import org.siwan.persistence.entity.Member;
import org.siwan.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getUsers")
public class MemberController {
	private MemberService memberService;
	
	@Autowired
	MemberController(MemberService memberService){
		this.memberService = memberService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Member> getMembers(){
		return this.memberService.getAllMembers();
	}
	

}
