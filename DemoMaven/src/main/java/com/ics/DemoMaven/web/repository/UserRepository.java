package com.ics.DemoMaven.web.repository;

import com.ics.DemoMaven.support.jpa.CustomJpaRepository;
import com.ics.DemoMaven.web.entity.User;

/**
 * <b>User Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface UserRepository extends CustomJpaRepository<User, Long> {

	/**
	 * Find user by username
	 * 
	 */
	public User findByUsername(String username);
}
