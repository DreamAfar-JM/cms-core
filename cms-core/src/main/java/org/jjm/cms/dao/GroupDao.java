package org.jjm.cms.dao;

import org.jjm.basic.dao.BaseDao;
import org.jjm.cms.model.Group;
import org.springframework.stereotype.Repository;

@Repository("groupDao")
public class GroupDao extends BaseDao<Group> implements IGroupDao{

}
