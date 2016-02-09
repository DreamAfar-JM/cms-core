package org.jjm.cms.dao;

import org.jjm.basic.dao.BaseDao;
import org.jjm.cms.model.Role;
import org.springframework.stereotype.Repository;
@Repository("roleDao")
public class RoleDao extends BaseDao<Role> implements IRoleDao{

}
