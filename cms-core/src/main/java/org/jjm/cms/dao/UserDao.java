package org.jjm.cms.dao;

import java.util.List;

import org.jjm.basic.dao.BaseDao;
import org.jjm.cms.model.Group;
import org.jjm.cms.model.Role;
import org.jjm.cms.model.RoleType;
import org.jjm.cms.model.User;
import org.jjm.cms.model.UserGroup;
import org.jjm.cms.model.UserRole;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {

	@Override
	public List<Role> listUserRoles(int userId) {
		String hql = " select ur.role from UserRole ur where ur.user.id=?";
		return this.getSession().createQuery(hql).setParameter(0, userId).list();
	}

	@Override
	public List<Integer> listUserRoleIds(int userId) {
		String hql = " select ur.role.id from UserRole ur where ur.user.id=?";
		return this.getSession().createQuery(hql).setParameter(0, userId).list();
	}

	@Override
	public List<Group> listUserGroups(int userId) {
		String hql = " select ug.group from UserGroup ug where ug.user.id=?";
		return this.getSession().createQuery(hql).setParameter(0, userId).list();
	}

	@Override
	public List<Integer> listUserGroupIds(int userId) {
		String hql = " select ug.group.id from UserGroup ug where ug.user.id=?";
		return this.getSession().createQuery(hql).setParameter(0, userId).list();
	}

	@Override
	public UserRole loadUserRole(int userId, int roleId) {
		String hql = " select ur from UserRole ur where ur.user.id=? and ur.role.id=?";
		return (UserRole) this.getSession().createQuery(hql).setParameter(0, userId).setParameter(1, roleId)
				.uniqueResult();
	}

	@Override
	public UserGroup loadUserGroup(int userId, int groupId) {
		String hql = " select ug from UserGroup ug where ug.user.id=? and ug.group.id=?";
		return (UserGroup) this.getSession().createQuery(hql).setParameter(0, userId).setParameter(1, groupId)
				.uniqueResult();

	}

	@Override
	public User loadByUsername(String username) {
		String hql = " from User where username=?";
		return (User) this.queryObject(hql, username);
	}

	@Override
	public List<User> listRoleUsers(int roleId) {
		String hql = " select ur.user from UserRole ur where ur.role.id=?";
		return this.list(hql, roleId);
	}

	@Override
	public List<User> listRoleUsers(RoleType roleType) {
		String hql = " select ur.user from UserRole ur where ur.role.roleType=?";
		return this.list(hql, roleType);
	}

	@Override
	public List<User> listGroupUsers(int groupId) {
		String hql = " select ug.user from UserGroup ug where ug.group.id=?";
		return this.list(hql, groupId);
	}

}
