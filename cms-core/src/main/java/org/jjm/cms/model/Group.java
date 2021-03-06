package org.jjm.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户组对象
 * 
 * @ClassName: Group
 * @Description: ...
 * @author: 蒋金敏
 * @date: 2016年2月7日 下午5:34:15
 * @version: V1.0
 */

@Entity
@Table(name="t_group")
public class Group {
	/**
	 * 组id
	 */
	private int id;
	/**
	 * 组名称
	 */
	private String name;
	/**
	 * 组描述信息
	 */
	private String descr;

	public Group() {
	}

	public Group(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
