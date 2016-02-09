package org.jjm.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 用户组对象，存储用户和组的关联
 * 
 * @ClassName: UserGroup
 * @Description: TODO
 * @author: 蒋金敏
 * @date: 2016年2月7日 下午5:55:02
 * @version: V1.0
 */
@Entity
@Table(name = "t_user_group")
public class UserGroup {
	private int id;
	private User user;
	private Group group;

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
	@JoinColumn(name = "g_id")
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
