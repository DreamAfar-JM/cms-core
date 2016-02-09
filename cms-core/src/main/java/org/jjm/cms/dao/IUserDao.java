package org.jjm.cms.dao;

import java.util.List;

import org.jjm.basic.dao.IBaseDao;
import org.jjm.cms.model.Group;
import org.jjm.cms.model.Role;
import org.jjm.cms.model.RoleType;
import org.jjm.cms.model.User;
import org.jjm.cms.model.UserGroup;
import org.jjm.cms.model.UserRole;

public interface IUserDao extends IBaseDao<User> {
	
	/**
	 * 获取用户的所有角色信息列表
	 * 
	 * @param userId
	 * @return
	 */
	public List<Role> listUserRoles(int userId);

	/**
	 * 获取用户的所有角色的Id列表
	 * 
	 * @param userId
	 * @return
	 */
	public List<Integer> listUserRoleIds(int userId);

	/**
	 * 获取用户的所有组信息
	 * 
	 * @param userId
	 * @return
	 */
	public List<Group> listUserGroups(int userId);

	/**
	 * 获取用户的所有组的Id列表
	 * 
	 * @param userId
	 * @return
	 */
	public List<Integer> listUserGroupIds(int userId);

	/**
	 * 根据用户和角色获取用户角色关联对象
	 * 
	 * @param userId
	 * @param roleId
	 * @return
	 */
	public UserRole loadUserRole(int userId, int roleId);

	/**
	 * 根据用户和组获取用户组关联对象
	 * 
	 * @param userId
	 * @param groupId
	 * @return
	 */
	public UserGroup loadUserGroup(int userId, int groupId);

	/**
	 * 根据用户名获取用户对象
	 * 
	 * @param username
	 * @return
	 */
	public User loadByUsername(String username);

	/**
	 * 根据角色Id获取用户列表
	 * 
	 * @return
	 */
	public List<User> listRoleUsers(int roleId);

	/**
	 * 根据角色类型获取用户列表
	 * 
	 * @return
	 */
	public List<User> listRoleUsers(RoleType roleType);

	/**
	 * 根据组Id获取用户列表
	 * 
	 * @return
	 */
	public List<User> listGroupUsers(int groupId);
}
