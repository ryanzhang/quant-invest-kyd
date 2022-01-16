
package com.cgc.horizon0.account.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "sys_code", schema = "stock")
public class SysCode extends PanacheEntity {
	@Column(name = "code_type_id") public Integer codeTypeID; //	参数分类ID
	@Column(name = "value_cd") public String valueCD;	// 常量值
	@Column(name = "value_name") public String valueName;	// 常量值说明

}
