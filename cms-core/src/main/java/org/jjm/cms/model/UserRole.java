package org.jjm.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 用户角色关系对象
 * 
 * @ClassName: UserRole
 * @Description: TODO
 * @author: 蒋金敏
 * @date: 2016年2月7日 下午5:53:40
 * @version: V1.0
 */
@Entity
@Table(name = "t_user_role")
public class UserRole {
	private int id;
	private User user;
	private Role role;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "u_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "r_id")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
