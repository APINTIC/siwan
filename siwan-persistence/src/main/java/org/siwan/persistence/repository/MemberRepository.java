package org.siwan.persistence.repository;


import java.util.List;

import org.siwan.persistence.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

    List<Member> findByLastName(String lastName);
}
